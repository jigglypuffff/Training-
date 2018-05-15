package com.cg.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.model.Customer;
import com.cg.repo.CustomerDao;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	CustomerDao customerDao;

	public Customer add(Customer customer) {
		return customerDao.save(customer);
	}
	
	
	

	@Override
	public List<Customer> getCustomers() {

		return customerDao.findAll();
	}

	/*
	 * @Override public Customer getCustomerById(int id) {
	 * 
	 * return customerDao.getOne(id); }
	 */
	public Object viewById(int id) {
		// TODO Auto-generated method stub
		Object ob = customerDao.findById(id);
		return ob;
	}

	@Override
	public int removeCustomer(Customer customer) {

		customerDao.deleteById(customer.getCustId());
		return 1;
	}

	public Customer updateCustomer(Customer customer) {

		Customer obj = customerDao.findById(customer.getCustId()).get();
		obj.setPaymentMode("Dollars");
		obj.setName("Aishwarya");
		return customerDao.save(obj);

	}

	

}
