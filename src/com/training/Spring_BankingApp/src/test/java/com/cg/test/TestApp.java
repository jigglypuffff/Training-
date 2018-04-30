package com.cg.test;

import static org.junit.Assert.assertEquals;

import java.util.Map;

import org.apache.log4j.Logger;
import org.junit.jupiter.api.Test;

import com.day7.model.Address;
import com.day7.model.Contact;
import com.day7.model.Customer;
import com.day7.repository.CustomerDaoImpl;
import com.day7.service.CustomerService;
import com.day7.service.CustomerServiceImpl;

class TestApp {

	final public static Logger log = Logger.getLogger("test logger");
	@Test
	public void testBankApp() {
		final CustomerService iserv = new CustomerServiceImpl();

		final Contact contact = new Contact("8054056356", "9920680901", "ash@gmail.com");
		final Address address = new Address("Viviana", "115", "208019", "Thane");

		final Customer customer = new Customer("101", "Ash", "Sawant", 500, contact, address);
		final Customer customer2 = new Customer("102", "Aishwarya", "Sawant", 500, contact, address);

		final CustomerDaoImpl bank = new CustomerDaoImpl();
		final Map<String, Customer> map = bank.getMap();

		assertEquals(0, map.size());

		iserv.addCustomer(customer,map);
		iserv.addCustomer(customer2,map);

		log.info(map.size());

		assertEquals(2, map.size());

	}

}
