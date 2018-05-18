package com.cg.training.service;

import java.util.List;

import com.cg.training.model.Customer;
import com.cg.training.model.CustomerWrapper;

public interface CustomerService {

	
	/**
	 * @param customer
	 * @return
	 */
	 Customer createCustomer(CustomerWrapper customer);
	/**
	 * @return
	 */
	 List<Customer> getCustomers();
//	Optional<Bank> getBankDetailById(Integer id);
}
