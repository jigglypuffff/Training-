package com.cg.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.day7.model.Customer;
import com.day7.service.CustomerService;
import com.day7.service.CustomerServiceImpl;

public class BankingApp {

	public static void main(final String[] args) {
		
		final CustomerService ser = new CustomerServiceImpl();
		
		final ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		final Customer customer = (Customer) context.getBean("customer");
		
		System.out.println("Name: "+customer.getFirstName()+" "+customer.getLastName());
		
		System.out.println("The initial balance is : " +customer.getInitialBalance());
		
		System.out.println("current balance after withdraw = " +(customer.getInitialBalance()-400) );
		
		System.out.println("current balance after deposit = " +(customer.getInitialBalance()+400));
		
		System.out.println("**********");
		

		
		ser.addCustomer(customer);
		ser.viewCustomer(customer.getCustomerId());
		ser.performTransaction(customer.getCustomerId(),customer.getCustomerId(),1000);
	}

}
