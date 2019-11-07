package br.com.jackmay.fatec_ipi_paoo_async_named_queries_exercise.model.beans;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table (name = "tb_cidade")
@NamedQuery(name = "Cidade.buscarCidadePorLatitudeELongitudeNamed", query = "SELECT c FROM Cidade c WHERE c.latitude = :latitude AND c.longitude = :longitude")
@NamedQuery(name = "Cidade.buscarCidadePorNomeNamed", query = "SELECT c FROM Cidade c WHERE c.nome = :nome")
@NamedQuery(name = "Cidade.buscarCidadePorNomeMinusculoNamed", query = "SELECT c FROM Cidade c WHERE lower(c.nome) = lower(:nome)")

public class Cidade implements Serializable{

	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long id;
	private String nome;
	private String latitude;
	private String longitude;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getLatitude() {
		return latitude;
	}
	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}
	public String getLongitude() {
		return longitude;
	}
	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}
}
