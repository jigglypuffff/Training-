package com.cg.market.service;

import com.cg.market.model.Customer;
import com.cg.market.repository.CustomerDao;

public class CustomerServiceImpl implements CustomerService {

	/**
	 * 
	 */
	public CustomerDao custDao;

	public CustomerServiceImpl() {

	}

	public CustomerServiceImpl(final CustomerDao custDao) {
		this.custDao = custDao;
	}

	public int addCustomer(final Customer customer) {

		return custDao.addCustomer(customer);
	}

	public Customer removeCustomer(final Customer customer) {

		return custDao.removeCustomer(customer);
	}

	public Customer updateCustomer(final Customer customer) {

		return custDao.updateCustomer(customer);
	}

}
