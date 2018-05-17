package com.cg.training.service;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

import com.cg.training.model.Bank;
import com.cg.training.model.CustomerWrapper;
import com.cg.training.model.Customer;

public interface CustomerService {

	
	public Customer createCustomer(CustomerWrapper customer);
	public List<Customer> getCustomers();
//	Optional<Bank> getBankDetailById(Integer id);
}
