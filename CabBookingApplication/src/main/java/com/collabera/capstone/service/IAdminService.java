package com.collabera.capstone.service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

import org.springframework.stereotype.Service;

import com.collabera.capstone.model.Admin;
import com.collabera.capstone.model.TripBooking;

public interface IAdminService {
	public Admin insertAdmin(Admin admin);
	public Admin updateAdmin(Admin admin);
	public void deleteAdmin(int adminId);
	public List<TripBooking> getAllTrips(int customerId);
	public List<TripBooking> getTripsCabwise();
	public List<TripBooking> getTripsCustomerwise();
	public List<TripBooking> getTripsDatewise();
	public List<TripBooking> getAllTripsForDays(int customerId,LocalDateTime fromDate,LocalDateTime toDate);
}
