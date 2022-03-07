package com.collabera.capstone.service.impl;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.collabera.capstone.model.Admin;
import com.collabera.capstone.model.TripBooking;
import com.collabera.capstone.repository.IAdminRepository;
import com.collabera.capstone.repository.ITripBookingRepository;
import com.collabera.capstone.service.IAdminService;

@Service
public class AdminServiceImpl implements IAdminService {
	@Autowired
	IAdminRepository adminRepo;
	
	@Autowired
	ITripBookingRepository tripBookingRepo;

	@Override
	public Admin insertAdmin(Admin admin) {
		// TODO Auto-generated method stub
		return adminRepo.save(admin);
	}

	@Override
	public Admin updateAdmin(Admin admin) {
		// TODO Auto-generated method stub
		return adminRepo.save(admin);
	}

	@Override
	public void deleteAdmin(int adminId) {
		// TODO Auto-generated method stub		
		adminRepo.deleteById(adminId);
	}

	@Override
	public List<TripBooking> getAllTrips(int customerId) {
		// TODO Auto-generated method stub
		return tripBookingRepo.findByCustomerId(customerId);
	}

	@Override
	public List<TripBooking> getTripsCabwise() {
		// TODO Auto-generated method stub
		return tripBookingRepo.findAll(Sort.by("Driver"));
	}

	@Override
	public List<TripBooking> getTripsCustomerwise() {
		// TODO Auto-generated method stub
		return tripBookingRepo.findAll(Sort.by("customerId"));
	}

	@Override
	public List<TripBooking> getTripsDatewise() {
		// TODO Auto-generated method stub
		return tripBookingRepo.findAll(Sort.by("fromDateTime"));
	}

	@Override
	public List<TripBooking> getAllTripsForDays(int customerId, LocalDateTime fromDate, LocalDateTime toDate) {
		// TODO Auto-generated method stub
		return tripBookingRepo.getAllTripsForDays(customerId, fromDate, toDate);
	}
	

}
