package com.day7.service;

import com.day7.repository.AccountDao;
import com.day7.repository.CheckingAccImpl;

public class CheckAccServImpl implements AccountDao {

	AccountDao cAccDao= new CheckingAccImpl();
	@Override
	public double findInterest() {
		
		return cAccDao.findInterest();
	}

}
