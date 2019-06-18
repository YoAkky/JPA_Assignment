package com.cg.dao;

import java.util.List;

import com.cg.entities.Hotel;

public interface HotelRepository {

	public List<Hotel> showAllHotels();

	public Hotel findById(int id);
}
