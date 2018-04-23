package com.day6.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.day6.service.CustomerService;

public class CustomerNameApplication {

	public static void main(String[] args) {

		//CustomerService service = new CustomerServiceImpl();
		
		ApplicationContext appContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		CustomerService service =  appContext.getBean("customerService" , CustomerService.class);

		System.out.println(service.findAll().get(0).getFirstName());

		System.out.println(service.findAll().get(0).getLastName());

	}

}
