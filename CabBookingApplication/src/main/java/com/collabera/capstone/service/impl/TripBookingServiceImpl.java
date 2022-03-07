package com.collabera.capstone.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.collabera.capstone.model.Driver;
import com.collabera.capstone.model.TripBooking;
import com.collabera.capstone.repository.ITripBookingRepository;
import com.collabera.capstone.service.ITripBookingService;

@Service
public class TripBookingServiceImpl implements ITripBookingService {
	
	@Autowired
	ITripBookingRepository tripBookingRepo;

	@Override
	public TripBooking insertTripBooking(TripBooking tripBooking) {
		// TODO Auto-generated method stub
		return tripBookingRepo.save(tripBooking);
	}

	@Override
	public TripBooking updateTripBooking(TripBooking tripBooking) {
		// TODO Auto-generated method stub
		return tripBookingRepo.save(tripBooking);
	}

	@Override
	public void deleteTripBooking(int tripBookingId) {
		// TODO Auto-generated method stub
		tripBookingRepo.deleteById(tripBookingId);
	}

	@Override
	public List<TripBooking> viewAllTripsCustomer() {
		// TODO Auto-generated method stub
		return tripBookingRepo.findAll();	}

	@Override
	public float calculateBill(int customerId) {
		// TODO Auto-generated method stub
		return tripBookingRepo.calculateBill(customerId);
	}


}
