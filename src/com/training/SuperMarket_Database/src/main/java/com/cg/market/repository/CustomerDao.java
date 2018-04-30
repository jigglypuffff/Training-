package com.cg.market.repository;

import com.cg.market.model.Customer;

public interface CustomerDao {

	public Customer addCustomer(Customer customer);
	
	public Customer removeCustomer(Customer customer);
	
	public Customer updateCustomer(Customer customer);
	
}
