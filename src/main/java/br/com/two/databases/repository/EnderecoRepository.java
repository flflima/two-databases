package br.com.two.databases.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import br.com.two.databases.model.Endereco;

@Repository
public interface EnderecoRepository  {

	void salvar(Endereco endereco);

	public List<Endereco> findAll();
}
