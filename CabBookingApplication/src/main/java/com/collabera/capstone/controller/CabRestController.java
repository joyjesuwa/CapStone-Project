package com.collabera.capstone.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.collabera.capstone.model.Cab;
import com.collabera.capstone.service.impl.CabServiceImpl;

@RestController
public class CabRestController {
	
	@Autowired
	public CabServiceImpl cabServiceImpl;
	
	@PostMapping("/insertCab")
	public Cab insertCab(@RequestBody Cab cab) {
		// TODO Auto-generated method stub
		return cabServiceImpl.insertCab(cab);
	}
	
	
	@PutMapping("/updateCab")
	public Cab updateCab(@RequestBody Cab cab) {
		// TODO Auto-generated method stub
		return cabServiceImpl.updateCab(cab);
	}
	
	@DeleteMapping("/deleteCab/{cabId}")
	public void deleteCab(@PathVariable int cabId) {
		// TODO Auto-generated method stub
		cabServiceImpl.deleteCab(cabId);
	}
	
	
	@GetMapping("/viewCabsOfType/{carType}")
	public List<Cab> viewCabsOfType(@PathVariable String carType) {
		// TODO Auto-generated method stub
		return cabServiceImpl.viewCabsOfType(carType);
	}
	
	@GetMapping("/countCabsOfType/{carType}")
	public int countCabsOfType(@PathVariable String carType) {
		// TODO Auto-generated method stub
		return cabServiceImpl.countCabsOfType(carType);
	}
	
	}


