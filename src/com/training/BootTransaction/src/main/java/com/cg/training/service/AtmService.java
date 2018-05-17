package com.cg.training.service;

import com.cg.training.model.ATM;
import com.cg.training.model.AtmWrapper;

public interface AtmService {

	public ATM createAtm(AtmWrapper atm);
	
	public int addMoneyFromBank();
	
	public String withdrawMoney();
}
