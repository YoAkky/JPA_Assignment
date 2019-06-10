package com.cg.jpastart.entities;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class AuthorOp {

	public static void main(String[] args) {

		EntityManagerFactory factory = Persistence
				.createEntityManagerFactory("JPA-PU");
		EntityManager em = factory.createEntityManager();
		em.getTransaction().begin();
		
		Author author= new Author();
		
		author.setFirstName("Akash");
		author.setMiddleName("Narayan");
		author.setLastName("Navghane");
		author.setPhoneNo(1996);
		
		em.persist(author);

		System.out.println("Added Author to database.");
		em.getTransaction().commit();
		
		int id = 3;
		 Author author1 = em.find(Author.class, id);
		 athh.setPhoneNo(2019);
		 em.getTransaction().begin();
		 em.merge(author1);
		 em.getTransaction().commit();
		 System.out.println("Updated to database.");
		
		em.close();
		factory.close();
	}

}
