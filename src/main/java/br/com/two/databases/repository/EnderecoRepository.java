package br.com.two.databases.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import br.com.two.databases.model.Endereco;

public interface EnderecoRepository extends PagingAndSortingRepository<Endereco, Long> {

}
