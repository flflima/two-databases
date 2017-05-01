package br.com.two.databases.dao;

import java.io.Serializable;

import javax.persistence.EntityManager;

import org.springframework.stereotype.Repository;

@Repository
public interface GenericDao<T, PK extends Serializable> {
	T create(T t, EntityManager entityManager);

	T read(PK id, EntityManager entityManager);

	T update(T t, EntityManager entityManager);

	void delete(T t, EntityManager entityManager);
}