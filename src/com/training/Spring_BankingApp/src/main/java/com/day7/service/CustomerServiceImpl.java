package com.day7.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.day7.model.Customer;
import com.day7.repository.CustomerDao;
import com.day7.repository.CustomerDaoImpl;

@Service("customerService")
public class CustomerServiceImpl implements CustomerService {

	
	CustomerDao custDao=new CustomerDaoImpl();



	@Override
	public void addCustomer(Customer customer) {
		custDao.addCustomer(customer);
		
	}

	@Override
	public int viewCustomer(String customer_id) {
		
		return custDao.viewCustomer(customer_id);
	}

	@Override
	public int performTransaction(String user_id, String receiver_id, int amount) {
		// TODO Auto-generated method stub
		return custDao.performTransaction(user_id, receiver_id, amount);
	}

}
