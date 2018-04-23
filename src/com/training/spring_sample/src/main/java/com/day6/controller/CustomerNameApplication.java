package com.day6.controller;

import com.day6.service.CustomerService;
import com.day6.service.CustomerServiceImpl;

public class CustomerNameApplication {

	public static void main(String[] args) {

		CustomerService service = new CustomerServiceImpl();

		System.out.println(service.findAll().get(0).getFirstName());

		System.out.println(service.findAll().get(0).getLastName());

	}

}
