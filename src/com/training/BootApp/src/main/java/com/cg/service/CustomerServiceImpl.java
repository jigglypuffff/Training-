package com.cg.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.model.Customer;
import com.cg.repo.CustomerDao;

@Service
public class CustomerServiceImpl implements CustomerService{

	@Autowired
	CustomerDao customerDao;
	
	public Customer add(Customer customer)
	{
		return customerDao.save(customer);
	}

	@Override
	public List<Customer> getCustomer() {
		
		return customerDao.findAll();
	}

	/*@Override
	public int removeCustomer(Customer customerId) {
		
		Customer customer  =  new Customer (customerDao.getOne(id));
		
		return customerDao.delete(customer);
	}
	*/
}
