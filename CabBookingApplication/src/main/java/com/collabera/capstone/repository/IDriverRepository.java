package com.collabera.capstone.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.collabera.capstone.model.Driver;

@Repository
public interface IDriverRepository  extends JpaRepository<Driver, Integer>{
	
//	public Driver insertDriver(Driver driver); 
//	public Driver updateDriver(Driver driver); 
//	public Driver deleteDriver(int driverId);
	@Query(value = "SELECT driver FROM Driver AS driver where driver.rating >= 4.5")
	public List<Driver> viewBestDriver();
//	public Driver viewDriver(int driverId);

}
