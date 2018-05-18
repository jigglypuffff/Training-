package com.cg.training.model;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Account {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer accountId;
	
	@ManyToOne(targetEntity=Customer.class)
	private Customer customerId;
	
	private BigDecimal amount;
	
	@ManyToOne(targetEntity=Bank.class)
	private Bank bankId;

	public Integer getAccountId() {
		return accountId;
	}

	public void setAccountId(final Integer accountId) {
		this.accountId = accountId;
	}

	public Customer getCustomerId() {
		return customerId;
	}

	public void setCustomerId(final Customer customerId) {
		this.customerId = customerId;
	}

	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(final BigDecimal amount) {
		this.amount = amount;
	}

	public Bank getBankId() {
		return bankId;
	}

	public void setBankId(Bank bankId) {
		this.bankId = bankId;
	}

	@Override
	public String toString() {
		return "Account [accountId=" + accountId + ", customerId=" + customerId + ", amount=" + amount + ", bankId="
				+ bankId + "]";
	}

	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Account(Integer accountId) {
		super();
		this.accountId = accountId;
	}

	

	
	
}
