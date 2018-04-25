package com.cg.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.day7.model.Contact;
import com.day7.model.Customer;
import com.day7.service.CustomerService;
import com.day7.service.CustomerServiceImpl;

public class BankingApp {

	public static void main(String[] args) {
		
		CustomerService ser = new CustomerServiceImpl();
		
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Customer customer = (Customer) context.getBean("customer");
		Contact contact = new Contact();
		
		System.out.println("Name: "+customer.getFirstName()+" "+customer.getLastName());
		
		System.out.println("current balance after withdraw = " +(customer.getInitialBalance()-400) );
		
		System.out.println("**********");
		

		
		ser.addCustomer(customer);
		ser.viewCustomer(customer.getCustomerId());
		ser.performTransaction(customer.getCustomerId(),customer.getCustomerId(),400);
	}

}
