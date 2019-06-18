package com.cg.entities;

import java.io.Serializable;

import javax.persistence.Entity;

@Entity
public class Hotel implements Serializable {
	
	private int id;
	private String name;
	private String rating;
	private int rate;
	private int availablerooms;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRating() {
		return rating;
	}
	public void setRating(String rating) {
		this.rating = rating;
	}
	public int getRate() {
		return rate;
	}
	public void setRate(int rate) {
		this.rate = rate;
	}
	public int getAvailablerooms() {
		return availablerooms;
	}
	public void setAvailablerooms(int availablerooms) {
		this.availablerooms = availablerooms;
	}
	public Hotel(int id, String name, String rating, int rate,
			int availablerooms) {
		super();
		this.id = id;
		this.name = name;
		this.rating = rating;
		this.rate = rate;
		this.availablerooms = availablerooms;
	}
	@Override
	public String toString() {
		return "Hotel [id=" + id + ", name=" + name + ", rating=" + rating
				+ ", rate=" + rate + ", availablerooms=" + availablerooms + "]";
	}
	public Hotel() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	

}
