package com.collabera.capstone.repository;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.collabera.capstone.model.TripBooking;

@Repository
public interface ITripBookingRepository extends JpaRepository<TripBooking, Integer> {
	
//	public TripBooking insertTripBooking(TripBooking tripBooking); 
//	public TripBooking updateTripBooking(TripBooking tripBooking); 
//	public TripBooking deleteTripBooking(int tripBookingId);
	public List<TripBooking> findByCustomerId(int customerId);
	
	@Query(value = "SELECT trip FROM TripBooking AS trip where trip.customerId = ?1 AND (fromDateTime >= ?2 OR toDateTime <= ?3)")
	public List<TripBooking> getAllTripsForDays(int customerId, LocalDateTime fromDate, LocalDateTime toDate);
	@Query(value = "SELECT sum(trip.bill) FROM TripBooking AS trip where trip.customerId = ?1")
	public float calculateBill(int customerId);


}
