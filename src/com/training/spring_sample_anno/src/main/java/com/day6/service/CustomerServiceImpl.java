package com.day6.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.day6.dao.CustomerDao;
import com.day6.model.Customer;

@Service("customerService")
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerDao custDao;
	
	/* (non-Javadoc)
	 * @see com.day6.service.CustomerService#findAll()
	 */
	@Override
	public List<Customer> findAll(){
		return custDao.findAll();
	}
	
}
