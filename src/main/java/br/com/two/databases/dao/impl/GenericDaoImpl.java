package br.com.two.databases.dao.impl;

import java.io.Serializable;

import javax.persistence.EntityManager;

import org.springframework.stereotype.Repository;

import br.com.two.databases.dao.GenericDao;

@Repository
public class GenericDaoImpl<T, PK extends Serializable> implements GenericDao<T, PK> {

	protected Class<T> entityClass;

	@Override
	public T create(T t, EntityManager entityManager) {
		entityManager.persist(t);
		return t;
	}

	@Override
	public T read(PK id, EntityManager entityManager) {
		return entityManager.find(entityClass, id);
	}

	@Override
	public T update(T t, EntityManager entityManager) {
		return entityManager.merge(t);
	}

	@Override
	public void delete(T t, EntityManager entityManager) {
		t = entityManager.merge(t);
		entityManager.remove(t);
	}

}
