package com.day7.repository;

public class CheckingAccImpl implements AccountDao {

	double money;
	int rate;
	int period;

	@Override
	public double findInterest() {
		//double interest = (money*period*(application.properties.checkingAccRate))/100;
		
		double interest = (money*period*rate)/100;
		return interest;
	}

}
