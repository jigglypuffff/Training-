package com.cg.training.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.training.dao.BankRepository;
import com.cg.training.model.Bank;

@Service
public class BankServiceImpl implements BankService {

	@Autowired
	BankRepository bankDao;
	
	
	@Override
	public Bank createBank(Bank bank) {
		return bankDao.save(bank);
		
		
	}

	@Override
	public List<Bank> getBankDetails() {
		
		return bankDao.findAll();
	}

	public Optional<Bank> getBankDetailById(Integer id) 
	{
		Optional<Bank> bank = bankDao.findById(id);
		
		return bank;
		
		
	}

}
