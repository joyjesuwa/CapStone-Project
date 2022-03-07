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

import com.collabera.capstone.model.AbstractUser;
import com.collabera.capstone.model.Customer;
import com.collabera.capstone.service.impl.CustomerServiceImpl;

@RestController
public class CustomerRestController {
	
	@Autowired
	public CustomerServiceImpl customerServiceImpl;
	
	@PostMapping("/insertCustomer")
	public Customer insertCustomer(@RequestBody Customer customer) {
		// TODO Auto-generated method stub
		return customerServiceImpl.insertCustomer(customer);
	}
	
	@PutMapping("/updateCustomer")
	public Customer updateCustomer(@RequestBody Customer customer) {
		// TODO Auto-generated method stub
		return customerServiceImpl.updateCustomer(customer);
	}
	
	@GetMapping("/viewCustomer")
	public List<Customer> viewCustomer() {
		// TODO Auto-generated method stub
		return customerServiceImpl.viewCustomer();
	}
	
	@DeleteMapping("/deleteCustomer/{customerId}")
	public void deleteCustomer(@PathVariable int customerId) {
		customerServiceImpl.deleteCustomer(customerId);

	}

	
	@GetMapping("/viewCustomer/{customerId}")
	public Optional<Customer> viewCustomer(@PathVariable int customerId) {
		// TODO Auto-generated method stub
		return customerServiceImpl.viewCustomer(customerId);
	}

	@GetMapping("/validateCustomer/{username}/{password}")
	public Customer validateCustomer(@PathVariable String username, @PathVariable String password) {
		// TODO Auto-generated method stub
		return customerServiceImpl.validateCustomer(username, password);
	}
}

