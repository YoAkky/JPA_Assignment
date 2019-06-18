package com.cg.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.dao.HotelRepository;
import com.cg.entities.Hotel;



@Service
@Transactional
public class HotelServiceImpl implements HotelService{
	
	@Autowired
	private HotelRepository repository;
	
	@Override
	public List<Hotel> showAllHotels() {
		// TODO Auto-generated method stub
		return repository.showAllHotels();
	}

	@Override
	public Hotel findById(int id) {
		// TODO Auto-generated method stub
		return repository.findById(id);
	}
	

}
