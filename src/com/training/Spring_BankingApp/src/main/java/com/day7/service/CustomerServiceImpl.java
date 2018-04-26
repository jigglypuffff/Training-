package com.day7.service;

import com.day7.model.Customer;
import com.day7.repository.CustomerDao;
import com.day7.repository.CustomerDaoImpl;


public class CustomerServiceImpl implements CustomerService {

	
	/**
	 * 
	 */
	public final CustomerDao custDao=new CustomerDaoImpl();



	@Override
	public void addCustomer(final Customer customer) {
		custDao.addCustomer(customer);
		
	}

	@Override
	public int viewCustomer(final String customer_id) {
		
		return custDao.viewCustomer(customer_id);
	}

	@Override
	public int performTransaction(final String user_id,final String receiver_id,final int amount) {
		
		return custDao.performTransaction(user_id, receiver_id, amount);
	}

}
