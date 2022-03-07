package com.collabera.capstone.service;

import java.util.List;

import com.collabera.capstone.model.TripBooking;

public interface ITripBookingService {
	
	public TripBooking insertTripBooking(TripBooking tripBooking);
	public TripBooking updateTripBooking(TripBooking tripBooking);
	public void deleteTripBooking(int tripBookingId);
	public List<TripBooking> viewAllTripsCustomer();
	public float calculateBill(int customerId);

}
