package com.collabera.capstone.ui_controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.collabera.capstone.model.Driver;
import com.collabera.capstone.model.TripBooking;
import com.collabera.capstone.repository.ITripBookingRepository;
import com.collabera.capstone.service.impl.DriverServiceImpl;
import com.collabera.capstone.service.impl.TripBookingServiceImpl;
@Controller
public class TripBookingUiController {
	

	@Autowired
	TripBookingServiceImpl impl; 
	@RequestMapping("/trip")
	public String viewAllTripsCustomer(Model model) {
	List<TripBooking> tripb = (List<TripBooking>) impl.viewAllTripsCustomer();
	model.addAttribute("TripBooking_table", tripb);

	return "TripBookingList";
	}
}


