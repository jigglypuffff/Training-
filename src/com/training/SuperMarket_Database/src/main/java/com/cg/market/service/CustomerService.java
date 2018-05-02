package com.cg.market.service;

import com.cg.market.model.Customer;

public interface CustomerService {

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
