package br.com.two.databases.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import br.com.two.databases.model.Endereco;

//@Transactional("transactionManager")
@Repository
public class EnderecoRepository  {
	
	@PersistenceContext(unitName="endereco")
	public EntityManager entityManager;

    public void setEntityManager(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public EntityManager getEntityManager() {
        return entityManager;
    }   

    public void insert(Endereco endereco) {
        entityManager.persist(endereco);
    }

    public Endereco load(Long id) {
        return entityManager.find(Endereco.class, id);
    }

	public List<Endereco> findAll() {
		return this.entityManager.createNamedQuery("EmailDomainTrust.getEmailDomains", Endereco.class).getResultList();
	}
}
