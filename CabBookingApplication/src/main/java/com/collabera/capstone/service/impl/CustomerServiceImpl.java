package com.collabera.capstone.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.collabera.capstone.model.Customer;
import com.collabera.capstone.model.TripBooking;
import com.collabera.capstone.repository.ICustomerRepository;
import com.collabera.capstone.service.ICustomerService;

@Service
public class CustomerServiceImpl implements ICustomerService {
	
	@Autowired
	ICustomerRepository customerRepo;

	@Override
	public Customer insertCustomer(Customer customer) {
		// TODO Auto-generated method stub
		return customerRepo.save(customer);
	}

	@Override
	public Customer updateCustomer(Customer customer) {
		// TODO Auto-generated method stub
		return customerRepo.save(customer);
	}

	@Override
	public void deleteCustomer(int customerId) {
		// TODO Auto-generated method stub
		customerRepo.deleteById(customerId);
	}

	@Override
	public List<Customer> viewCustomer() {
		// TODO Auto-generated method stub
		return customerRepo.findAll();
		}

	@Override
	public Optional<Customer> viewCustomer(int customerId) {
		// TODO Auto-generated method stub
		return customerRepo.findById(customerId);
	}

	@Override
	public Customer validateCustomer(String username, String password) {
		// TODO Auto-generated method stub
		return customerRepo.validateCustomer(username, password);
	}

}
