package com.cg.author.dao;

import com.cg.author.entities.Client;

public interface AuthorDao {

	public abstract void beginTransaction() ;
	public  abstract void commitTransaction();

	public abstract void addAuthor(Client client);
	public abstract void updateAuthor(Client client) ;
	public abstract void removeAuthorById(Client client);
	public abstract Client getAuthorById(int aId);
		
	

}
