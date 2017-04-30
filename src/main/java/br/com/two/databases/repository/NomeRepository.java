package br.com.two.databases.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import br.com.two.databases.model.Nome;

//@Transactional("mysqlTransactionManager")
@Repository
public class NomeRepository {
	
	@PersistenceContext(unitName="nome")
	public EntityManager entityManager;

    public void setEntityManager(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public EntityManager getEntityManager() {
        return entityManager;
    }   

    public void insert(Nome nome) {
        entityManager.persist(nome);
    }

    public Nome load(Long id) {
        return entityManager.find(Nome.class, id);
    }

	public List<Nome> findAll() {
		return this.entityManager.createNamedQuery("EmailDomainTrust.getNomes", Nome.class).getResultList();
	}
}
