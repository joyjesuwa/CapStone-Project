package com.collabera.capstone.service;

import java.util.List;
import java.util.Optional;

import com.collabera.capstone.model.Driver;

public interface IDriverService {
	
	public Driver insertDriver(Driver driver);
	public Driver updateDriver(Driver driver);
	public void deleteDriver(int driverId);
	public List<Driver> viewBestDriver();
	public Optional<Driver> viewDriver(int driverId);
	public List<Driver> showAllDriver();
}
