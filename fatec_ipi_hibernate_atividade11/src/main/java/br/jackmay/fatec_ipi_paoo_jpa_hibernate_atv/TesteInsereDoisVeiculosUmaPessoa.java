package br.jackmay.fatec_ipi_paoo_jpa_hibernate_atv;

import java.util.ArrayList;
import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import br.jackmay.fatec_ipi_paoo_jpa_hibernate_atv.model.beans.Pessoa;
import br.jackmay.fatec_ipi_paoo_jpa_hibernate_atv.model.beans.Veiculo;
import br.jackmay.fatec_ipi_paoo_jpa_hibernate_atv.model.persistence.JPAUtil;

public class TesteInsereDoisVeiculosUmaPessoa {

	public static void main(String[] args) {
		EntityManager manager = JPAUtil.getEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		
		Pessoa p = new Pessoa();
		p.setNome("Baianinho Máua");
		p.setIdade("42");
		manager.persist(p);
		p.setVeiculo(new ArrayList<>());
		Veiculo v1 = new Veiculo();
		v1.setModelo("Brasilia");
		v1.setMarca("Volkswagen");
		v1.setCor("amarelo");
		
		Veiculo v2 = new Veiculo();
		v2.setModelo("Calhambeque");
		v2.setMarca("Ford");
		v2.setCor("Preto");
		
		p.getVeiculo().add(v1);
		p.getVeiculo().add(v2);
		
		//manager.persist(f);
		manager.persist(v1);
		manager.persist(v2);
		
		transaction.commit();
		manager.close();
		JPAUtil.close();
	}

}
