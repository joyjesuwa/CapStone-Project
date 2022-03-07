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
import com.collabera.capstone.model.TripBooking;
import com.collabera.capstone.service.impl.TripBookingServiceImpl;

@RestController
public class TripBookingRestController {

	@Autowired
	public TripBookingServiceImpl tripBookingServiceImpl;
	
	@PostMapping("/insertTripBooking")
	public TripBooking insertTripBooking(@RequestBody TripBooking tripBooking) {
		// TODO Auto-generated method stub
		return tripBookingServiceImpl.insertTripBooking(tripBooking);
	}
	
	@PutMapping("/updateTripBooking")
	public TripBooking updateTripBooking(@RequestBody TripBooking tripBooking) {
		// TODO Auto-generated method stub
		return tripBookingServiceImpl.updateTripBooking(tripBooking);
	}

	@DeleteMapping("/deleteTripBooking/{tripBookingId}")
	public void deleteTripBooking(@PathVariable int tripBookingId) {
		// TODO Auto-generated method stub
		tripBookingServiceImpl.deleteTripBooking(tripBookingId);
	}

	@GetMapping("/viewAllTripsCustomer/{customerId}")
	public List<TripBooking> viewAllTripsCustomer() {
		// TODO Auto-generated method stub
		return tripBookingServiceImpl.viewAllTripsCustomer();
	}
	
	@GetMapping("/calculateBill/{customerId}")
	public Float calculateBill(@PathVariable int customerId) {
		// TODO Auto-generated method stub
		return tripBookingServiceImpl.calculateBill(customerId);
	}
	
}



