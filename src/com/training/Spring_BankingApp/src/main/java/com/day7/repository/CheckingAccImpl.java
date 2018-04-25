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

	@Override
	public String toString() {
		return "CheckingAccImpl [money=" + money + ", rate=" + rate + ", period=" + period + "]";
	}

	public double getMoney() {
		return money;
	}

	public void setMoney(double money) {
		this.money = money;
	}

	public int getRate() {
		return rate;
	}

	public void setRate(int rate) {
		this.rate = rate;
	}

	public CheckingAccImpl() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CheckingAccImpl(double money, int rate, int period) {
		super();
		this.money = money;
		this.rate = rate;
		this.period = period;
	}

	public int getPeriod() {
		return period;
	}

	public void setPeriod(int period) {
		this.period = period;
	}

}
