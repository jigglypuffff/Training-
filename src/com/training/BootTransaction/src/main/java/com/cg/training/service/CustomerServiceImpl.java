package com.cg.training.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.training.dao.BankRepository;
import com.cg.training.dao.CustomerRepository;
import com.cg.training.model.Bank;
import com.cg.training.model.Customer;
import com.cg.training.model.CustomerWrapper;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	CustomerRepository customerDao;
	@Autowired
	BankRepository bankRepository;

	@Override
	public Customer createCustomer(final CustomerWrapper customer) {

		final Optional<Bank> bankOpt = bankRepository.findById(customer.getbId());
		final Bank bank = bankOpt.get();

		if (bank != null) {
			final Customer cust = customer.getCustomer();
			cust.setBankId(bank);
			return customerDao.save(cust);
		} else
		{
			return null;
		}
	}

	@Override
	public List<Customer> getCustomers() {
		return customerDao.findAll();
	}

}
