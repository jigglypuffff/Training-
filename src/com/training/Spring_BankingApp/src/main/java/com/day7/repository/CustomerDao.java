package com.day7.repository;

import com.day7.model.Customer;


public interface CustomerDao {

	public void addCustomer(Customer customer);
	
	public int viewCustomer(String customer_id);
	
	public int performTransaction(String user_id,String receiver_id,int amount); 
	
}
