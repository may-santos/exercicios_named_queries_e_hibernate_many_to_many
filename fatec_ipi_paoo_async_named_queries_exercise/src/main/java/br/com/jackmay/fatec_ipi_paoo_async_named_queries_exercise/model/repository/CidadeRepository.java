package br.com.jackmay.fatec_ipi_paoo_async_named_queries_exercise.model.repository;

import java.util.List;
import java.util.concurrent.Future;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.scheduling.annotation.Async;

import br.com.jackmay.fatec_ipi_paoo_async_named_queries_exercise.model.beans.Cidade;

public interface CidadeRepository extends JpaRepository<Cidade, Long>{
	
	// 2. Escreva os seguintes métodos de busca usando o mecanismo de construções de query do Spring Data. Todos eles devem executar de forma assíncrona.
	
	// Buscar cidade pelo seu nome.
	@Async
	public Future < List <Cidade> > findByNome (String nome);

	// - Buscar cidade por latitude e longitude.
	@Async
	public Future < Cidade > findByLatitudeAndLongitude (String latitude, String longitude);

	// - Buscar cidades pelo seu nome, ignorando letras maiúsculas. Pesquise para descobrir como se usa IgnoreCase.
	@Async
	public Future < List <Cidade> > findByFirstnameIgnoreCase (String nome);	
	
	//3. Escreva os métodos do Exercício 1 usando a anotação Query no repositório do Spring	Data.
	
	// - Buscar cidade por latitude e longitude.
	@Query ("SELECT c FROM Cidade c WHERE c.latitude = ?1 AND c.longitude = ?2")
	public Cidade buscarCidadePorLatitudeELongitude (String latitude, String longitude);
	
	// - Buscar cidade pelo seu nome.
	@Query ("SELECT c FROM Cidade c WHERE c.nome = ?1")
	public List <Cidade> buscarCidadePorNome (String nome);
	
	// - Buscar cidades pelo seu nome, ignorando letras maiúsculas. Pesquise para descobrir como se usa IgnoreCase.
	@Query ("SELECT c FROM Cidade c WHERE LOWER(c.nome) = LOWER(:nome)")
	public List <Cidade> buscarCidadePorNomeMinusculo (@Param ("nome") String nome);
	
	// 4. Escreva os métodos do Exercício 1 usando NamedQueries.
	
	public Cidade buscarCidadePorLatitudeELongitudeNamed (@Param ("latitude") String latitude, @Param ("longitude") String longitude);
	public List <Cidade> buscarCidadePorNomeNamed (@Param ("nome") String nome);
	public List <Cidade> buscarCidadePorNomeMinusculoNamed (@Param ("nome") String nome);
	
	
	
}
