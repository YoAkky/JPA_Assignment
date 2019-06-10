package com.cg.author.service;

import com.cg.author.entities.Client;

public interface AuthorService {

	public abstract void addAuthor(Client client);
	public abstract void updateAuthor(Client client);
	public abstract void removeAuthorById(Client client);
	public abstract Client findAuthorById(int aId);
	
	
	
	
}
