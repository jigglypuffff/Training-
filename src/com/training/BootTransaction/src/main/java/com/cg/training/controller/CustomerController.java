package com.cg.training.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cg.training.model.CustomerWrapper;
import com.cg.training.model.Customer;
import com.cg.training.service.BankService;
import com.cg.training.service.CustomerService;

@RestController
public class CustomerController {

	@Autowired
	BankService bankSer;
	@Autowired
	CustomerService custSer;

	@RequestMapping(value = "/addcustomer", method = RequestMethod.POST)
	public Customer addCustomer(@RequestBody CustomerWrapper customer) {
	return custSer.createCustomer(customer);
	}

	@RequestMapping(value = "/showcustomer", method = RequestMethod.GET)
	public List<Customer> showCustomer() {
		return custSer.getCustomers();
	}

}
