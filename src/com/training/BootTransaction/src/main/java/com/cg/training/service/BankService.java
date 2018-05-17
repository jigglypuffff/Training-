package com.cg.training.service;

import java.util.List;
import java.util.Optional;

import com.cg.training.model.Bank;

public interface BankService {

	public Bank createBank(Bank bank);
	public List<Bank> getBankDetails();
	public Optional<Bank> getBankDetailById(Integer id);
}
