package com.day6.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.day6.model.Customer;

@Repository("customerRepository")
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
