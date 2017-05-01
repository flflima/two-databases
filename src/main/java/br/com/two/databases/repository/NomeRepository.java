package br.com.two.databases.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import br.com.two.databases.model.Nome;

@Repository
public interface NomeRepository {

	void salvar(Nome nome);

	List<Nome> findAll();
}
