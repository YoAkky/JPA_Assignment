package com.cg.author.service;

import com.cg.author.dao.AuthorDao;
import com.cg.author.dao.AuthorDaoImpl;
import com.cg.author.entities.Client;



public class AuthorServiceImpl implements AuthorService{

	private AuthorDao dao;
	
	public AuthorServiceImpl() {
		dao = new AuthorDaoImpl();
	}
	
	@Override
	public void addAuthor(Client client) {
		// TODO Auto-generated method stub
		dao.beginTransaction();
		dao.addAuthor(client);
		dao.commitTransaction();
		
	}

	@Override
	public void updateAuthor(Client client) {
		// TODO Auto-generated method stub
		dao.beginTransaction();
		dao.updateAuthor(client);
		dao.commitTransaction();
		
	}

	@Override
	public void removeAuthorById(Client client) {
		// TODO Auto-generated method stub
		dao.removeAuthorById(client);
		
		

		
	}

	@Override
	public Client findAuthorById(int aId) {
		// TODO Auto-generated method stub
		Client client = dao.getAuthorById(aId);
		return client;
	}

}
