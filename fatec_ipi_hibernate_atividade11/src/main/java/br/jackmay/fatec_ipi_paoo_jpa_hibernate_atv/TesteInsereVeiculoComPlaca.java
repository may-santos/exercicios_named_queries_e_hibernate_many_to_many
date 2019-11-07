package br.jackmay.fatec_ipi_paoo_jpa_hibernate_atv;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import br.jackmay.fatec_ipi_paoo_jpa_hibernate_atv.model.beans.Placa;
import br.jackmay.fatec_ipi_paoo_jpa_hibernate_atv.model.beans.Veiculo;
import br.jackmay.fatec_ipi_paoo_jpa_hibernate_atv.model.persistence.JPAUtil;

public class TesteInsereVeiculoComPlaca {

	public static void main(String[] args) {
		
		EntityManager manager= JPAUtil.getEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		
		Placa placa = new Placa();
		placa.setCidade("QualquerCidade");
		manager.persist(placa);
		Veiculo v = new Veiculo();
		v.setModelo("Camaro");
		v.setMarca("Chevrolet");
		v.setCor("Amarelo");
		v.setPlaca(placa);
		manager.persist(v);
		
		transaction.commit();
	}

}
