package com.day7.model;

public class Account {

	double money;
	int rate;
	int period;

	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Account(double money, int rate, int period) {
		super();
		this.money = money;
		this.rate = rate;
		this.period = period;
	}

	public double getMoney() {
		return money;
	}

	public int getPeriod() {
		return period;
	}

	public int getRate() {
		return rate;
	}

	public void setMoney(double money) {
		this.money = money;
	}

	public void setPeriod(int period) {
		this.period = period;
	}

	public void setRate(int rate) {
		this.rate = rate;
	}

	@Override
	public String toString() {
		return "Account [money=" + money + ", rate=" + rate + ", period=" + period + "]";
	}

}
