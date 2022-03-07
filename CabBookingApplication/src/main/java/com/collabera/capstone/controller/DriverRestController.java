package com.collabera.capstone.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.collabera.capstone.model.Driver;
import com.collabera.capstone.service.impl.DriverServiceImpl;

@RestController
public class DriverRestController {
	
	@Autowired
	DriverServiceImpl driverServiceImpl;
	
	@PostMapping("/insertDriver")
	public Driver insertDriver(@RequestBody Driver driver) {
		// TODO Auto-generated method stub
		return driverServiceImpl.insertDriver(driver);
	}

	
	@PutMapping("/updateDriver")
	public Driver updateDriver(@RequestBody Driver driver) {
		// TODO Auto-generated method stub
		return driverServiceImpl.updateDriver(driver);
	}
	
	@DeleteMapping("/deleteDriver/{driverId}")
	public void deleteDriver(@PathVariable int driverId) {
		// TODO Auto-generated method stub
		driverServiceImpl.deleteDriver(driverId);
	}
	
	@GetMapping("/viewBestDriver")
	public List<Driver> viewBestDriver() {
		// TODO Auto-generated method stub
		return driverServiceImpl.viewBestDriver();
	}
	
	@GetMapping("/viewDriver/{driverId}")
	public Optional<Driver> viewDriver(@PathVariable int driverId) {
		// TODO Auto-generated method stub
		return driverServiceImpl.viewDriver(driverId);
	}

}
