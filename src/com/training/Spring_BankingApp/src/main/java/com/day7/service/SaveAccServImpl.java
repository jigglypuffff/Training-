package com.day7.service;

import com.day7.repository.AccountDao;
import com.day7.repository.SavingAccountImpl;

public class SaveAccServImpl implements AccountService {

	AccountDao sAccDao= new SavingAccountImpl();
	
	@Override
	public double findInterest() {
		
		return sAccDao.findInterest();
	}

}
