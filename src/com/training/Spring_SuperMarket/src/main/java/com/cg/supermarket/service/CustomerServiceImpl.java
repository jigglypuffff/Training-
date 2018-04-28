package com.cg.supermarket.service;

import com.cg.supermarket.model.Customer;
import com.cg.supermarket.repository.CustomerDao;

/**
 * @author trainee
 *
 */
public class CustomerServiceImpl implements CustomerService {
	CustomerDao custDao;

	@Override
	public int addCustomer(Customer customer) {

		return custDao.addCustomer(customer);
	}

	@Override
	public int removeCustomer(Customer customer) {
		// TODO Auto-generated method stub
		return custDao.removeCustomer(customer);
	}

	@Override
	public int updateCustomer() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	CustomerServiceImpl(CustomerDao custDao){
		this.custDao= custDao;
	}

}