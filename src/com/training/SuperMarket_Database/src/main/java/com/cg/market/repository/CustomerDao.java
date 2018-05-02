package com.cg.market.repository;

import com.cg.market.model.Customer;

public interface CustomerDao {

	/**
	 * @param customer
	 * @return
	 */
	public Customer addCustomer(Customer customer);
	
	/**
	 * @param customer
	 * @return
	 */
	public Customer removeCustomer(Customer customer);
	
	/**
	 * @param customer
	 * @return
	 */
	public Customer updateCustomer(Customer customer);
	
}
