package com.cg.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.cg.entities.Hotel;



@Repository
public class HotelRepositoryImpl implements HotelRepository  {
	
	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public List<Hotel> showAllHotels() {
		String qry = "SELECT hotel FROM hoteldetails hotel";
		TypedQuery<Hotel> query = entityManager.createQuery(
				qry, Hotel.class);
		return query.getResultList();

	}

	@Override
	public Hotel findById(int id) {
		return entityManager.find(Hotel.class,id);
	}
	
	

	
}
