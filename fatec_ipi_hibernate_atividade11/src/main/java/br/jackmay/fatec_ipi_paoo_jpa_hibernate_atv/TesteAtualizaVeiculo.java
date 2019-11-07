package br.jackmay.fatec_ipi_paoo_jpa_hibernate_atv;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import br.jackmay.fatec_ipi_paoo_jpa_hibernate_atv.model.beans.Veiculo;
import br.jackmay.fatec_ipi_paoo_jpa_hibernate_atv.model.persistence.JPAUtil;



public class TesteAtualizaVeiculo {
	
	public static void main(String[] args) {
		EntityManager manager = JPAUtil.getEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		Veiculo v = manager.find(Veiculo.class, 1L);
		
		v.setModelo(v.getModelo() + " Huracan");
		v.setMarca("Lanborghini");
		v.setCor("Preta");
		
		transaction.commit();
		manager.close();
		JPAUtil.close();

	}
	
}
