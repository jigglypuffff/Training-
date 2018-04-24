package com.day7.repository;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.day7.model.Customer;

@Repository("customerRepository")
public class CustomerDaoImpl implements CustomerDao {

	Map<String,Customer> map = new HashMap();

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
	public int performTransaction(String user_id, String receiver_id, double amount) {
		// TODO Auto-generated method stub
		return 0;
	}

}
