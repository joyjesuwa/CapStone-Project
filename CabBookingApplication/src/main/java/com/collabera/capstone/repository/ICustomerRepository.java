package com.collabera.capstone.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.collabera.capstone.model.Customer;

@Repository
public interface ICustomerRepository extends JpaRepository<Customer, Integer>{
	
//	public Customer insertCustomer(Customer customer);
//	public Customer updateCustomer(Customer customer);
//	public Customer deleteCustomer(int customerId);
//	public List<Customer> viewCustomer();
//	public Customer viewCustomer(int customerId);
	@Query(value = "SELECT customer FROM Customer AS customer where customer.username = ?1 AND customer.password = ?2")
	public Customer validateCustomer(String username,String password);

}
