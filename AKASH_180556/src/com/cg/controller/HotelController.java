package com.cg.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cg.entities.Hotel;
import com.cg.service.HotelService;

@Controller
public class HotelController {
	
	@Autowired
	private HotelService hotelService;
	
	@RequestMapping(value="/HotelDetails.obj")
	public String nextPage(@RequestParam String id, Model model)
	{
		Hotel hotel = (Hotel) hotelService.showAllHotels();;
		model.addAttribute("hotel", hotel);
		return "HotelDetails";
	}
}
