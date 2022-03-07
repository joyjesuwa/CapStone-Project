package com.collabera.capstone.ui_controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.collabera.capstone.model.Cab;
import com.collabera.capstone.model.Driver;
import com.collabera.capstone.service.impl.CabServiceImpl;
import com.collabera.capstone.service.impl.DriverServiceImpl;

@Controller
public class DriverUiController {
	@Autowired
	DriverServiceImpl impl; 
	@RequestMapping("/driver")
	public String showAllDriver(Model model) {
	List<Driver> driver = (List<Driver>) impl.showAllDriver();
	model.addAttribute("driver", driver);

	return "DriverList";
	}
	
 
	@RequestMapping("/bestdriver")
	public String viewBestDriver(Model model) {
	List<Driver> driver1 = (List<Driver>) impl.viewBestDriver();
	model.addAttribute("driver1", driver1);

	return "BestDriver";
	}
}
