package com.cg.training.model;

import java.math.BigDecimal;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

public class ATM {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	int ATMId;
	BigDecimal amount;
	
	@ManyToOne(targetEntity=Bank.class)
	Bank bankId;

	public int getATMId() {
		return ATMId;
	}

	public void setATMId(int aTMId) {
		ATMId = aTMId;
	}

	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public Bank getBankId() {
		return bankId;
	}

	public void setBankId(Bank bankId) {
		this.bankId = bankId;
	}
	
	
	
	
}
