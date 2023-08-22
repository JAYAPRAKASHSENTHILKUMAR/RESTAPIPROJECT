package com.example.day5.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.day5.model.HotelModel;
import com.example.day5.repository.HotelRepo;

@Service
public class HotelService {
	
	@Autowired
	public HotelRepo hrepo;
	
	//post the data
	public String saveHotel(HotelModel h)
	{
		hrepo.save(h);
		return "Data is saved to database";
	}
	
	//get the data
	
	public List<HotelModel> getHotel()
	{
		return hrepo.findAll();
	}
	
	//update the data(put)
	
	public HotelModel updateHotel(HotelModel ha)
	{
		return hrepo.saveAndFlush(ha);
	}
	
	//delete the data
	
	public boolean deleteHotel(int hotel_id)
	{
		System.out.println("Deleted");
		hrepo.deleteById(hotel_id);
		return false;
	}
	
	// with id
	
	public Optional<HotelModel>getHotelId1(int hotelId){
		Optional<HotelModel>Hotel=hrepo.findById(hotelId);
		if(Hotel.isPresent()) {
			return Hotel;}
		else {
				return null;
			}
		
		
	}
	}


	