package com.day7.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.day7.model.Customer;
import com.day7.repository.CustomerDao;

@Service("customerService")
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	CustomerDao custDao;



	@Override
	public void addCustomer(Customer customer) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int viewCustomer(String customer_id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int performTransaction(String user_id, String receiver_id, int amount) {
		// TODO Auto-generated method stub
		return 0;
	}

}
