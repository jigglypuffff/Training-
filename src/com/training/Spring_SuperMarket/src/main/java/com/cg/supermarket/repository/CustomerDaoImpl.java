package com.cg.supermarket.repository;

import java.util.HashMap;
import java.util.Map;

import com.cg.supermarket.model.Customer;

/**
 * @author trainee
 *
 */
public class CustomerDaoImpl implements CustomerDao {

	static Map<Integer,Customer> map =  new HashMap<>();
	@Override
	public int addCustomer(Customer customer) {
		map.put(customer.getCustomerId(), customer);
		
		return 1;
	}

	@Override
	public int removeCustomer(Customer customer) {
		map.remove(customer.getCustomerId(), customer);

		System.out.println(map.size());
	
		return 1;
	}

	@Override
	public int updateCustomer() {
		// TODO Auto-generated method stub
		return 0;
	}

	public Map<Integer, Customer> getMap() {
		// TODO Auto-generated method stub
		return map;
	}


}
