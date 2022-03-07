package com.collabera.capstone.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.collabera.capstone.model.Cab;
import com.collabera.capstone.model.Driver;
import com.collabera.capstone.repository.IDriverRepository;
import com.collabera.capstone.service.IDriverService;

@Service
public class DriverServiceImpl implements IDriverService {

	@Autowired
	IDriverRepository driverRepo;
	
	@Override
	public Driver insertDriver(Driver driver) {
		// TODO Auto-generated method stub
		return driverRepo.save(driver);
	}

	@Override
	public Driver updateDriver(Driver driver) {
		// TODO Auto-generated method stub
		return driverRepo.save(driver);
	}

	@Override
	public void deleteDriver(int driverId) {
		// TODO Auto-generated method stub
		driverRepo.deleteById(driverId);
	}

	@Override
	public List<Driver> viewBestDriver() {
		// TODO Auto-generated method stub
		return driverRepo.viewBestDriver();
	}

	@Override
	public Optional<Driver> viewDriver(int driverId) {
		// TODO Auto-generated method stub
		return driverRepo.findById(driverId);
	}
	@Override
	public List<Driver> showAllDriver() {
		// TODO Auto-generated method stub
		return driverRepo.findAll();
	}

}
