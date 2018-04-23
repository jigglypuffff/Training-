package com.day6.dao;

import java.util.List;

import com.day6.model.Customer;

public interface CustomerDao {

	List<Customer> findAll();

}