package com.day7.repository;

import java.util.Map;

import com.day7.model.Customer;


public interface CustomerDao {

	public void addCustomer(Customer customer,Map map);
	
	public int viewCustomer(String customer_id);
	
	public int performTransaction(String user_id,String receiver_id,int amount); 
	
}
