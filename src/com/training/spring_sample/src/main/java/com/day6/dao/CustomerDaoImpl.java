package com.day6.dao;

import java.util.ArrayList;
import java.util.List;

import com.day6.model.Customer;

public class CustomerDaoImpl implements CustomerDao {

	/* (non-Javadoc)
	 * @see com.day6.dao.CustomerDao#findAll()
	 */
	@Override
	public List<Customer> findAll() {
		List<Customer> customersList = new ArrayList<>();

		Customer customer = new Customer();

		customer.setFirstName("Aishwarya");

		customer.setLastName("Sawant");

		customersList.add(customer);

		return customersList;

	}
}
