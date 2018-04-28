package com.cg.supermarket.repository;

import com.cg.supermarket.model.Customer;

/**
 * @author trainee
 *
 */
public interface CustomerDao {
int addCustomer(Customer customer);
int removeCustomer(Customer customer);
int updateCustomer();
}


