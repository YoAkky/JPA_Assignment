package com.cg.author.ass;

import java.util.Scanner;

import com.cg.author.entities.Client;
import com.cg.author.service.AuthorService;
import com.cg.author.service.AuthorServiceImpl;


public class Author {
	public static void main(String[] args) {

	AuthorService service = new AuthorServiceImpl();
	Client client = new Client();
	Scanner sc = new Scanner(System.in);
	int i =0;
	
	do{
	System.out.println("Enter Your Choice:");
	System.out.println("Press 1 for Add");
	System.out.println("Press 2 for Update");
	System.out.println("Press 3 for Remove");
	System.out.println("Press 4 for Find");
	
	i = sc.nextInt();
	int authorId = 1;

	String firstName;
	String middleName;
	String lastName;
	String phoneNo;
	
	
	switch(i)
	{
	case 1 : 
		System.out.println("Enter First Name:");
		firstName = sc.next();
		System.out.println("Enter Middle Name:");
	    middleName = sc.next();
		System.out.println("Enter Last Name:");
		lastName = sc.next();
		System.out.println("Enter Phone number");
		phoneNo = sc.next();
		client.setAuthorId(authorId);
		
		client.setFirstName(firstName);
		client.setMiddleName(middleName);
		client.setLastName(lastName);
		client.setPhoneNo(phoneNo);
		service.addAuthor(client);
		System.out.println("Added and author id = "+getAuthorId());
		break;
		
	case 2:
		System.out.println("Enter Author ID :");
		int aId = sc.nextInt();
		client = service.findAuthorById(aId);
		System.out.println("ID: " +client.getAuthorId());
		System.out.println("First Name : " +client.getFirstName());
		System.out.println("Middle Name : " +client.getMiddleName());
		System.out.println("Last Name : " +client.getLastName());
		System.out.println("Phone Number : " +client.getPhoneNo());
		System.out.println("Enter First Name:");
		firstName = sc.next();
		System.out.println("Enter Middle Name:");
		middleName = sc.next();
		System.out.println("Enter First Name:");
		lastName = sc.next();
		System.out.println("Enter Phone number");
		phoneNo = sc.next();
		
		client.setFirstName(firstName);
		client.setMiddleName(middleName);
		client.setLastName(lastName);
		client.setPhoneNo(phoneNo);			
		service.updateAuthor(client);
		break;
	case 3:
		System.out.println("Enter Author ID :");
		aId = sc.nextInt();
		service.removeAuthorById(client);
		
		break;
		
		
	case 4:
		System.out.println("Enter Author ID :");
		aId = sc.nextInt();		
		client = service.findAuthorById(aId);
		System.out.println("ID: " +client.getAuthorId());
		System.out.println("First Name : " +client.getFirstName());
		System.out.println("Middle Name : " +client.getMiddleName());
		System.out.println("Last Name : " +client.getLastName());
		System.out.println("Phone Number : " +client.getPhoneNo());
		break;
	}
	System.out.println("do you want to continue 1-yes 0-No");
	i = sc.nextInt();
	
	}while (i!=0);
}

	private static String getAuthorId() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
		