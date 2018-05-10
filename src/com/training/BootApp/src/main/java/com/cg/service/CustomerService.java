package com.cg.service;

import java.util.List;

import com.cg.model.Customer;

public interface CustomerService {
	public Customer add(Customer customer);

	public List<Customer> getCustomer();

	//public Customer removeCustomer(int id);
}
