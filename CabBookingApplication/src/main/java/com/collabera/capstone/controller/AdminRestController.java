package com.collabera.capstone.controller;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;

import com.collabera.capstone.model.Admin;
import com.collabera.capstone.model.TripBooking;
import com.collabera.capstone.service.impl.AdminServiceImpl;

@RestController
public class AdminRestController {

	@Autowired
	AdminServiceImpl adminServiceImpl;
	
	
	@PostMapping("/insertAdmin")
	public Admin insertAdmin(@RequestBody Admin admin) {
		// TODO Auto-generated method stub
		return adminServiceImpl.insertAdmin(admin);
	}
	
	@PutMapping("/updateAdmin")
	public Admin updateAdmin(@RequestBody Admin admin) {
		// TODO Auto-generated method stub
		return adminServiceImpl.updateAdmin(admin);
	}
	
	
	
	@DeleteMapping("/deleteAdmin/{adminId}")
	public void deleteAdmin(@PathVariable int adminId) {
		// TODO Auto-generated method stub		
		adminServiceImpl.deleteAdmin(adminId);
	}
	
	
	@GetMapping("/getAllTrips/{customerId}")
	public List<TripBooking> getAllTrips(@PathVariable int customerId) {
		// TODO Auto-generated method stub
		return adminServiceImpl.getAllTrips(customerId);
		
	}
	
	

	@GetMapping("/getTripsCabwise")
	public List<TripBooking> getTripsCabwise() {
		// TODO Auto-generated method stub
		return adminServiceImpl.getTripsCabwise();
	}
		
	
	@GetMapping("/getTripsCustomerwise")
	public List<TripBooking> getTripsCustomerwise() {
		// TODO Auto-generated method stub
		return adminServiceImpl.getTripsCustomerwise();
	}

	@GetMapping("/getTripsDatewise")
	public List<TripBooking> getTripsDatewise() {
		// TODO Auto-generated method stub
		return adminServiceImpl.getTripsDatewise();
	}
	
	@GetMapping("/getAllTripsForDays/{customerId}/{fromDate}/{toDate}")
	public List<TripBooking> getAllTripsForDays(@PathVariable int customerId, @PathVariable @DateTimeFormat(pattern =  "yyyy-MM-dd'T'HH:mm:ss") LocalDateTime fromDate, @PathVariable @DateTimeFormat(pattern =  "yyyy-MM-dd'T'HH:mm:ss") LocalDateTime toDate) {
		// TODO Auto-generated method stub
		return adminServiceImpl.getAllTripsForDays(customerId, fromDate, toDate);
	}
}
