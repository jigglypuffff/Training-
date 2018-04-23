package com.day6.service;

import java.util.List;

import com.day6.dao.CustomerDao;
import com.day6.dao.CustomerDaoImpl;
import com.day6.model.Customer;

public class CustomerServiceImpl implements CustomerService {

	private CustomerDao custDao = new CustomerDaoImpl();
	
	/* (non-Javadoc)
	 * @see com.day6.service.CustomerService#findAll()
	 */
	@Override
	public List<Customer> findAll(){
		return custDao.findAll();
	}
	
}
