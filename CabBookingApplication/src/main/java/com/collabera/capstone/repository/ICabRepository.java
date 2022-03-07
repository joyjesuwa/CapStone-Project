package com.collabera.capstone.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.collabera.capstone.model.Cab;

@Repository
public interface ICabRepository extends JpaRepository<Cab, Integer> {

	
//	  public Cab insertCab(Cab cab); 
//	  public Cab updateCab(Cab cab); 
//	  public void deleteCab(int cabId); 
	public List<Cab> findByCarType(String carType); 
	public int countByCarType(String carType);
	 
}
