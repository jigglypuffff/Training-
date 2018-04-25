package com.cg.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.day7.model.Customer;
import com.day7.service.CustomerService;
import com.day7.service.CustomerServiceImpl;

public class BankingApp {

	public static void main(String[] args) {
		
		CustomerService ser = new CustomerServiceImpl();
		
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Customer customer = (Customer) context.getBean("customer");
		//System.out.println("Name: "+customer.getFirstName()+" "+customer.getLastName());
		
		ser.addCustomer(customer);
	}

}
