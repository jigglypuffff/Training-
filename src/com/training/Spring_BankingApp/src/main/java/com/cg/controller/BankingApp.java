package com.cg.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import java.util.logging.Logger;
import com.day7.model.Customer;
import com.day7.service.CustomerService;
import com.day7.service.CustomerServiceImpl;

public class BankingApp {

	public static final Logger log = Logger.getLogger("controller logger");
	public static void main(final String[] args) {
		
		final CustomerService ser = new CustomerServiceImpl();
		
		final ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		final Customer customer = (Customer) context.getBean("customer");
		
		log.info("Name: "+customer.getFirstName()+" "+customer.getLastName());
		
		log.info("The initial balance is : " +customer.getInitialBalance());
		
		log.info("current balance after withdraw = " +(customer.getInitialBalance()-400) );
		
		log.info("current balance after deposit = " +(customer.getInitialBalance()+400));
		
		log.info("**********");
		

		
		ser.addCustomer(customer);
		ser.viewCustomer(customer.getCustomerId());
		ser.performTransaction(customer.getCustomerId(),customer.getCustomerId(),1000);
	}

}
