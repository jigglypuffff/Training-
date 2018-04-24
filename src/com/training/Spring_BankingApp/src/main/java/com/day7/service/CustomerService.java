package com.day7.service;

import com.day7.model.Customer;

public interface CustomerService {
public void addCustomer(Customer customer);
	
	public int viewCustomer(String customer_id);
	
	public int performTransaction(String user_id,String receiver_id,double amount);
	
}
