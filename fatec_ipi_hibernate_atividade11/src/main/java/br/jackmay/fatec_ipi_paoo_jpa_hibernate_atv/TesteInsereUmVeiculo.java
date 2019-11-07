package br.jackmay.fatec_ipi_paoo_jpa_hibernate_atv;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import br.jackmay.fatec_ipi_paoo_jpa_hibernate_atv.model.beans.Veiculo;
import br.jackmay.fatec_ipi_paoo_jpa_hibernate_atv.model.persistence.JPAUtil;


public class TesteInsereUmVeiculo {
	public static void main(String[] args) {
		EntityManager manager = JPAUtil.getEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		Veiculo v = new Veiculo ();
		v.setModelo("448");
		v.setMarca("Ferrari");
		v.setCor("Vermelha");
		manager.persist(v);
		transaction.commit();
		manager.close();
		JPAUtil.close();
	}
}
