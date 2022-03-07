package com.collabera.capstone.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.collabera.capstone.model.Cab;
import com.collabera.capstone.repository.ICabRepository;
import com.collabera.capstone.service.ICabService;

@Service
public class CabServiceImpl implements ICabService {

	@Autowired
	ICabRepository cabRepo;

	@Override
	public Cab insertCab(Cab cab) {
		// TODO Auto-generated method stub
		return cabRepo.save(cab);
	}

	@Override
	public Cab updateCab(Cab cab) {
		// TODO Auto-generated method stub
		return cabRepo.save(cab);
	}

	@Override
	public void deleteCab(int cabId) {
		// TODO Auto-generated method stub
		cabRepo.deleteById(cabId);
	}

	@Override
	public List<Cab> viewCabsOfType(String carType) {
		// TODO Auto-generated method stub
		return cabRepo.findByCarType(carType);
	}

	@Override
	public List<Cab> Displayall() {
		// TODO Auto-generated method stub
		return cabRepo.findAll();
	}

	@Override
	public int countCabsOfType(String carType) {
		// TODO Auto-generated method stub
		 return cabRepo.countByCarType(carType); 
	}

}
