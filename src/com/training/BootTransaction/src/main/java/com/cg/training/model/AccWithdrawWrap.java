package com.cg.training.model;

import java.math.BigDecimal;

public class AccWithdrawWrap {

	private Integer bankId;
	/**
	 * 
	 */
	private BigDecimal amount;
	/**
	 * 
	 */
	private Account account;
	/**
	 * 
	 */
	private Integer customerId;
	public Integer getBankId() {
		return bankId;
	}
	public void setBankId(Integer bankId) {
		this.bankId = bankId;
	}
	public BigDecimal getAmount() {
		return amount;
	}
	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}
	public Account getAccount() {
		return account;
	}
	public void setAccount(Account account) {
		this.account = account;
	}
	public Integer getCustomerId() {
		return customerId;
	}
	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}
	@Override
	public String toString() {
		return "AccWithdrawWrap [bankId=" + bankId + ", amount=" + amount + ", account=" + account + ", customerId="
				+ customerId + "]";
	}
	public AccWithdrawWrap(Integer bankId, BigDecimal amount, Account account, Integer customerId) {
		super();
		this.bankId = bankId;
		this.amount = amount;
		this.account = account;
		this.customerId = customerId;
	}
	public AccWithdrawWrap() {
		super();
		// TODO Auto-generated constructor stub
	}

	


}
