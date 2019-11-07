package br.jackmay.fatec_ipi_paoo_jpa_hibernate_atv;

import javax.persistence.EntityManager;

import br.jackmay.fatec_ipi_paoo_jpa_hibernate_atv.model.beans.Veiculo;
import br.jackmay.fatec_ipi_paoo_jpa_hibernate_atv.model.persistence.JPAUtil;



public class TesteBuscaPorIdComGetReference {
	public static void main(String[] args) {
		EntityManager manager = JPAUtil.getEntityManager();
		Veiculo v = manager.getReference(Veiculo.class, 1L);
		System.out.println(v);
		manager.close();
		JPAUtil.close();
	}
}
