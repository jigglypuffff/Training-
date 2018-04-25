package com.day7.service;

import com.day7.repository.AccountDao;
import com.day7.repository.FlexSavingAccImpl;

public class FlexAccServImpl implements AccountService {

	
	AccountDao fAccDao= new FlexSavingAccImpl();
	
	@Override
	public double findInterest() {
		
		
		return fAccDao.findInterest();
		
	}




}
