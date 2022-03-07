package com.collabera.capstone.ui_controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.collabera.capstone.model.Cab;
import com.collabera.capstone.model.Customer;
import com.collabera.capstone.service.impl.CabServiceImpl;
import com.collabera.capstone.service.impl.CustomerServiceImpl;
@Controller
public class CustomerUiController {
	@Autowired
	CustomerServiceImpl impl; 
	@RequestMapping("/custom")
	public String viewCustomer(Model model) {
	List<Customer> cust1 = (List<Customer>) impl.viewCustomer();
	model.addAttribute("cust", cust1);

	return "Customer";
	}

}
