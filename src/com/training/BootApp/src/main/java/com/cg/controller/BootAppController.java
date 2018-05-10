package com.cg.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
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
		return custService.getCustomers();
	}

	@RequestMapping(value = "/showCustomerById/{custId}", method = RequestMethod.GET)
	public Object showById(@PathVariable int custId) {
		return custService.viewById(custId);
	}

	@RequestMapping(value = "/deleteCustomer", method = RequestMethod.DELETE)
	public int removeCustomer(@RequestBody Customer customer) {
		return custService.removeCustomer(customer);
	}

	@RequestMapping(value = "/updateCustomer",method = RequestMethod.PUT)
	public Customer updateCustomer(@RequestBody Customer customer) {
		return custService.updateCustomer(customer);
	}
}
