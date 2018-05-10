package com.cg.service;

import java.util.List;

import com.cg.model.Customer;

public interface CustomerService {
	public Customer add(Customer customer);

	public List<Customer> getCustomers();

	//public Customer getCustomerById(int id);
	
	public Object viewById(int id);

	public int removeCustomer(Customer customer);
	
	public Customer updateCustomer(Customer customer); 
}
