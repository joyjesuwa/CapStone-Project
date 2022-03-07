package com.collabera.capstone.repository;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.collabera.capstone.model.Admin;
import com.collabera.capstone.model.TripBooking;

@Repository
public interface IAdminRepository extends JpaRepository<Admin, Integer>{
	


}
