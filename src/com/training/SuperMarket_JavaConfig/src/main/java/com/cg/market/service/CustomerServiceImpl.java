package com.cg.market.service;

import com.cg.market.model.Customer;
import com.cg.market.repository.CustomerDao;

/**
 * @author aishwarya
 *
 */
public class CustomerServiceImpl implements CustomerService {

	/**
	 * 
	 */
	public CustomerDao customerDao;

	/**
	 * @param customerDao
	 */
	public CustomerServiceImpl(final CustomerDao customerDao) {
		this.customerDao = customerDao;
	}

	public Customer addCustomer(final Customer customer) {

		return customerDao.addCustomer(customer);
	}

	public Customer removeCustomer(final Customer customer) {

		return customerDao.removeCustomer(customer);
	}

	public Customer updateCustomer(final Customer customer) {

		return customerDao.updateCustomer(customer);
	}

}
