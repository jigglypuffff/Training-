package com.cg.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.day7.model.Customer;
import com.day7.service.CustomerServiceImpl;

/**
 * @author trainee
 *
 */
public class CustomerController {
	
	//public static void main(String[] args) {}
	/**
	 * 
	 */
	final public ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
	/**
	 * 
	 */
	 final public CustomerServiceImpl customerService = (CustomerServiceImpl) context.getBean("customerService");
	/**
	 * 
	 */
	//public final Customer customer = (Customer) context.getBean("customer");
	
	/**
	 * @return
	 */
	  final String addCustomer(final String fname, final String lname,final String id)
	{
		  final Customer customer = new Customer();
		customer.setFirstName(fname);
		customer.setLastName(lname);
		customer.setCustomerId(id);
		 final Map<String, Customer> map = new HashMap();
		customerService.addCustomer(customer,map);
		System.out.println("Success ");
		return "Success";
	}

	
}
