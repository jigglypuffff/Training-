package com.cg.training.model;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
public class Bank {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer bankId;
	private BigDecimal amount;

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

	@Override
	public String toString() {
		return "Bank [bankId=" + bankId + ", amount=" + amount + "]";
	}

	public Bank(Integer bankId, BigDecimal amount) {
		super();
		this.bankId = bankId;
		this.amount = amount;
	}

	public Bank() {
		super();

	}

	public Bank(Integer bankId) {
		super();
		this.bankId = bankId;
	}

}
