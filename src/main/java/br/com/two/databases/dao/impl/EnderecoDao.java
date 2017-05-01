package br.com.two.databases.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import br.com.two.databases.model.Endereco;
import br.com.two.databases.repository.EnderecoRepository;

@Repository
public class EnderecoDao extends GenericDaoImpl<Endereco, Long> implements EnderecoRepository {

	@PersistenceContext(unitName = "endereco")
	public EntityManager entityManager;

	public void setEntityManager(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

	public EntityManager getEntityManager() {
		return entityManager;
	}

	@Override
	public List<Endereco> findAll() {
		return this.entityManager.createNamedQuery("Endereco.getEnderecos", Endereco.class).getResultList();
	}

	@Override
	public void salvar(Endereco endereco) {
		super.create(endereco, this.entityManager);
	}

}
