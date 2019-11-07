package br.jackmay.fatec_ipi_paoo_jpa_hibernate_atv;

import javax.persistence.EntityManager;

import br.jackmay.fatec_ipi_paoo_jpa_hibernate_atv.model.beans.Veiculo;
import br.jackmay.fatec_ipi_paoo_jpa_hibernate_atv.model.persistence.JPAUtil;



public class TesteBuscaPorIdComFind {

	public static void main(String[] args) {
		EntityManager manager = JPAUtil.getEntityManager();
		Veiculo v = manager.find(Veiculo.class, 1L); // WHERE ID = 1;
		System.out.println(v);
		manager.close();
		JPAUtil.close();
	
	}

}
