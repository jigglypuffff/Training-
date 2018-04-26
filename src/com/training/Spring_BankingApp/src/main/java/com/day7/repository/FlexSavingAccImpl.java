package com.day7.repository;

public class FlexSavingAccImpl implements AccountDao {

	/**
	 * 
	 */
	private double money;
	/**
	 * 
	 */
	private int rate;
	/**
	 * 
	 */
	private int period;
	@Override
	public double findInterest() {
		//double interest = (money*period*(application.properties.checkingAccRate))/100;
		
		final double interest = (money*period*rate)/100;
		return interest;
	}

	@Override
	public String toString() {
		return "CheckingAccImpl [money=" + money + ", rate=" + rate + ", period=" + period + "]";
	}

	public double getMoney() {
		return money;
	}

	public void setMoney(final double money) {
		this.money = money;
	}

	public int getRate() {
		return rate;
	}

	public void setRate(final int rate) {
		this.rate = rate;
	}

	public FlexSavingAccImpl() {
		super();
		// TODO Auto-generated constructor stub
	}

	public FlexSavingAccImpl(final double money,final int rate,final int period) {
		super();
		this.money = money;
		this.rate = rate;
		this.period = period;
	}

	public int getPeriod() {
		return period;
	}

	public void setPeriod(final int period) {
		this.period = period;
	}
}
