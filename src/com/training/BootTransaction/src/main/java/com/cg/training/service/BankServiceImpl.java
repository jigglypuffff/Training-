package com.cg.training.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.training.dao.BankRepository;
import com.cg.training.exception.BankException;
import com.cg.training.model.Bank;

@Service
public class BankServiceImpl implements BankService {

	/**
	 
	 */
	@Autowired
	BankRepository bankDao;

	@Override
	public Bank createBank(final Bank bank) {
		return bankDao.save(bank);

	}

	@Override
	public List<Bank> getBankDetails() {
		return bankDao.findAll();
	}

	public Optional<Bank> getBankDetailById(final Integer id) {

		try {
			final Optional<Bank> bank = bankDao.findById(id);
			return bank;
		} catch (BankException e) {
			throw new BankException("Id not found");

		}

	}
}
