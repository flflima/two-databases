package br.com.two.databases.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import br.com.two.databases.model.Nome;
import br.com.two.databases.repository.NomeRepository;

@Repository
public class NomeDao extends GenericDaoImpl<Nome, Long> implements NomeRepository {
	
	@PersistenceContext(unitName="nome")
	public EntityManager entityManager;

    public void setEntityManager(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public EntityManager getEntityManager() {
        return entityManager;
    }   
    
	@Override
	public List<Nome> findAll() {
		return this.entityManager.createNamedQuery("Nome.getNomes", Nome.class).getResultList();
	}

	@Override
	public void salvar(Nome nome) {
		super.create(nome, this.entityManager);
	}
}
