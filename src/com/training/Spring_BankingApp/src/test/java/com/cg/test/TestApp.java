package com.cg.test;

import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;

import com.day7.repository.CustomerDaoImpl;

class TestApp {

	CustomerDaoImpl test = new CustomerDaoImpl();

	@Test
	public void testWithdraw() {
		int balance = 2000;
		int amount = 1000;
		assertTrue((balance = balance - amount) == 1000);
	}

	@Test
	public void testDeposit() {
		int balance = 1000;
		int amount = 1000;
		assertTrue((balance = balance + amount) == 2000);
	}

	
	
	
}
