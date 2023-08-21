package com.example.day2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.day2.Repository.Fuelrepo;
import com.example.day2.demo.fuelstationdetails;
import com.zaxxer.hikari.util.FastList;


@Service

public class servicepetrolbunk<petrolbunk> {
	@Autowired
	              
	Fuelrepo frepo;
	public fuelstationdetails saveDetails(fuelstationdetails p)
	{
		return frepo.save(p);
	}
	public List<fuelstationdetails> getDetails()
	{
		return frepo.findAll();
	}

}
