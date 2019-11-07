package br.jackmay.fatec_ipi_paoo_jpa_hibernate_atv;

import javax.persistence.Persistence;

public class TesteCriarBaseETabelas {

	public static void main(String[] args) {
		Persistence.createEntityManagerFactory("bossiniPU");

	}

}
