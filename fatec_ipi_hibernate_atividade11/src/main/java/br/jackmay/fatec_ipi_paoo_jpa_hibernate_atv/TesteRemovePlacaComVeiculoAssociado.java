package br.jackmay.fatec_ipi_paoo_jpa_hibernate_atv;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import br.jackmay.fatec_ipi_paoo_jpa_hibernate_atv.model.beans.Placa;
import br.jackmay.fatec_ipi_paoo_jpa_hibernate_atv.model.persistence.JPAUtil;

public class TesteRemovePlacaComVeiculoAssociado {

	public static void main(String[] args) {
		EntityManager manager = JPAUtil.getEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		
		Placa placa = manager.find(Placa.class, 1L);
		manager.remove(placa);
		manager.close();		
		transaction.commit();

	}

}
