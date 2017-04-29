package br.com.two.databases.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import br.com.two.databases.model.Nome;

public interface NomeRepository extends PagingAndSortingRepository<Nome, Long> {

}
