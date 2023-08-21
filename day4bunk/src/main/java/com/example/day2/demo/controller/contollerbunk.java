package com.example.day2.demo.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.day2.demo.fuelstationdetails;
import com.example.day2.service.servicepetrolbunk;
@RestController
public class contollerbunk
{
	@Autowired	
	servicepetrolbunk<fuelstationdetails> fser;	
	@PostMapping("/fuelSave")	
	public fuelstationdetails saveFuelStationDe(@RequestBody fuelstationdetails pb)
	{	
		return fser.saveDetails(pb);	
		}	
	@GetMapping("/getFuel")	
	public List<fuelstationdetails>getFuelStationDe()	
	{	
		
		return fser.getDetails();
		}
	}
