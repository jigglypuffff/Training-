package com.cg.training.model;

import java.math.BigDecimal;

public class AccWithdrawWrap {

	private BigDecimal amount;
	private Integer account;
	private Integer bank;

	public BigDecimal getAmount() {
		return amount;
	}

	public AccWithdrawWrap() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getAccount() {
		return account;
	}

	public void setAccount(Integer account) {
		this.account = account;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public AccWithdrawWrap(BigDecimal amount, Integer account, Integer bank) {
		super();
		this.amount = amount;
		this.account = account;
		this.bank = bank;
	}

	public Integer getBank() {
		return bank;
	}

	public void setBank(Integer bank) {
		this.bank = bank;
	}

}
