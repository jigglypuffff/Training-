package com.cg.service;

import java.util.List;

import com.cg.model.Customer;

public interface CustomerService {
	public Customer add(Customer customer);

	public List<Customer> getCustomers();

	public Object viewById(int id);

	public Customer updateCustomer(Integer customerId);

	int removeCustomer(Integer customerId);
}
