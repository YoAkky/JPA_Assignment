package com.cg.service;

import java.util.List;

import com.cg.entities.Hotel;

public interface HotelService {
	
	public List<Hotel> showAllHotels();

	public Hotel findById(int id);

}
