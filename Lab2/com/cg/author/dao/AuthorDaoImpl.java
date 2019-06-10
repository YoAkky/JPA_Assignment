package com.cg.author.dao;

import javax.persistence.EntityManager;

import com.cg.author.entities.Client;


public class AuthorDaoImpl implements AuthorDao {
	
	private EntityManager entityManager;

	public AuthorDaoImpl() {
		entityManager = JPAUtil.getEntityManager();
	}


	@Override
	public void beginTransaction() {
		entityManager.getTransaction().begin();
		
	}

	@Override
	public void commitTransaction() {
		entityManager.getTransaction().commit();
		
	}

	@Override
	public void addAuthor(Client client) {
		entityManager.persist(client);
		
	}

	@Override
	public void updateAuthor(Client client) {
		entityManager.merge(client);
		
	}

	@Override
	public void removeAuthorById(Client client) {
		entityManager.remove(client);
		
	}

	@Override
	public Client getAuthorById(int aId) {
		Client client = entityManager.find(Client.class, aId);
		return client;
	}

}
