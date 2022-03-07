package com.collabera.capstone.ui_controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.collabera.capstone.model.Cab;
import com.collabera.capstone.service.impl.CabServiceImpl;

@Controller
public class CabUiController {
	

	@Autowired
	CabServiceImpl impl; 
	@RequestMapping("/cabs")
	public String viewCabsAllTypes(Model model) {
	List<Cab> cabs = (List<Cab>) impl.Displayall();
	model.addAttribute("cab", cabs);

	return "CabList";
	}
}
	
	
