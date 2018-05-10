package com.cg.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cg.model.Customer;
import com.cg.service.CustomerServiceImpl;

@RestController
public class BootAppController {

	@Autowired
	CustomerServiceImpl custService;

	@RequestMapping(value = "/customer", method = RequestMethod.POST)
	public void add(@RequestBody Customer customer) {
		custService.add(customer);
	}
	
	@RequestMapping(value = "/showCustomer", method = RequestMethod.GET)
	public List<Customer> show() {
		return custService.getCustomer();
	}
/*
	@RequestMapping(value = "/deleteCustomer", method = RequestMethod.DELETE)
	public void removeCustomer(@RequestBody int id) {
	 custService.removeCustomer(id);
	}*/
}
