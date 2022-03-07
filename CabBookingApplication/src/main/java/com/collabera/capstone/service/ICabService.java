package com.collabera.capstone.service;

import java.util.List;

import com.collabera.capstone.model.Cab;

public interface ICabService {
	
	public Cab insertCab(Cab cab);
	public Cab updateCab(Cab cab);
	public void deleteCab(int cabId);
	public List<Cab> viewCabsOfType(String carType);
	public List<Cab> Displayall();
	public int countCabsOfType(String carType);
}
