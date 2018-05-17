package com.cg.training.service;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.training.dao.BankRepository;
import com.cg.training.dao.CustomerRepository;
import com.cg.training.model.Bank;
import com.cg.training.model.CustomerWrapper;
import com.cg.training.model.Customer;

@Service
public class CustomerServiceImpl implements CustomerService{


	@Autowired
	CustomerRepository customerDao;
	@Autowired
	BankRepository bankRepository;
	
	@Override
	public Customer createCustomer(CustomerWrapper customer) {
		
	Optional<Bank> bankOpt =	bankRepository.findById(customer.getbId());
	Bank bank =	bankOpt.get();
	Customer cust = customer.getCustomer();
	cust.setBankId(bank);
	
	return customerDao.save(cust);
	
	}

	@Override
	public List<Customer> getCustomers() {
		return customerDao.findAll();
	}
	
	

}
