package com.cg.controller;

import com.day7.model.Customer;
import com.day7.service.CustomerService;
import com.day7.service.CustomerServiceImpl;

public class BankingApp {

	public static void main(String[] args) {
		
		CustomerService ser = new CustomerServiceImpl();
		
		Customer customer = new Customer("11","Aishwarya","Sawant",1000,"8054056356","aishwarya.sawant@capgemini.com","Thane");
		System.out.println("To add customers");
		System.out.println(customer);
		
		
	}

}
