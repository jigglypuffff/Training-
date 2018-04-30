package com.cg.market.service;

import com.cg.market.model.Customer;
import com.cg.market.repository.CustomerDao;

public class CustomerServiceImpl implements CustomerService {

	CustomerDao custDao;
	
	CustomerServiceImpl(CustomerDao custDao)
	{
		this.custDao=custDao;
	}
	
	
	public Customer addCustomer(Customer customer) {
		
		return custDao.addCustomer(customer);
	}

	
	public Customer removeCustomer(Customer customer) {
		
		return custDao.removeCustomer(customer);
	}

	
	public Customer updateCustomer(Customer customer) {
		
		return custDao.updateCustomer(customer);
	}

}
