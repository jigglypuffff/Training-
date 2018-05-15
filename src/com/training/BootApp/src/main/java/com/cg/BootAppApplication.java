package com.cg;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.cg.model.Customer;

@SpringBootApplication
public class BootAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootAppApplication.class, args);

		/*
		 * add(); show();
		 */
		// getCustomerById();
		// updateCustomer();
		deleteCustomer();

	}

	private static void add() {
		final String uri = "http://localhost:9090/customer";

		Customer customer = new Customer(4, "Aishwarya", "UK", "Credit Card");

		RestTemplate restTemplate = new RestTemplate();
		Customer result = restTemplate.postForObject(uri, customer, Customer.class);

		System.out.println(result);
	}

	private static void show() {

		final String url = "http://localhost:9090/showCustomer";

		RestTemplate restTemplate = new RestTemplate();

		List<Customer> result = restTemplate.getForObject(url, ArrayList.class);
		System.out.println(result);

	}

	private static void getCustomerById() {
		final String uri = "http://localhost:9090/showCustomerById/2";

		RestTemplate restTemplate = new RestTemplate();
		Object result = restTemplate.getForObject(uri, Object.class);

		System.out.println(result);
	}

	private static void updateCustomer() {

		RestTemplate restTemplate = new RestTemplate();

		ResponseEntity<String> exchange = restTemplate.exchange("http://localhost:9090/updateCustomer", HttpMethod.PUT,
				new HttpEntity<Integer>(2), String.class, "");

		System.out.println(exchange);

	}

	private static void deleteCustomer() {
		System.out.println("delete");

		RestTemplate restTemplate = new RestTemplate();

		ResponseEntity<String> exchange1 = restTemplate.exchange("http://localhost:9090/deleteCustomer",
				HttpMethod.DELETE, new HttpEntity<Integer>(2), String.class, "");

		System.out.println(exchange1);

	}

}
