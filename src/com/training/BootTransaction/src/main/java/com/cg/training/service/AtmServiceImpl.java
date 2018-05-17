package com.cg.training.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.cg.training.dao.AtmRepository;
import com.cg.training.dao.BankRepository;
import com.cg.training.model.ATM;
import com.cg.training.model.AtmWrapper;
import com.cg.training.model.Bank;

public class AtmServiceImpl implements AtmService{

	@Autowired
	BankRepository bankDao;
	
	@Autowired
	AtmRepository atmRepo;
	@Override
	public ATM createAtm(AtmWrapper atm) {
		Optional<Bank> bankId = bankDao.findById(atm.getBankId());
		
		Bank bank = bankId.get();
		
		ATM trueatm  = atm.getAtm();
		
		trueatm.setBankId(bank);
		
		return atmRepo.save(trueatm);
		
		 
	}

	@Override
	public int addMoneyFromBank() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String withdrawMoney() {
		// TODO Auto-generated method stub
		return null;
	}

}
