package com.cg.training.model;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Transaction {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer transactionId;

	private Integer customerId;

	private Integer accountId;

	private BigDecimal amount;

	private String transactionType;

	public Integer getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(Integer transactionId) {
		this.transactionId = transactionId;
	}

	public Integer getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}

	public Integer getAccountId() {
		return accountId;
	}

	public void setAccountId(Integer accountId) {
		this.accountId = accountId;
	}

	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public String getTransactionType() {
		return transactionType;
	}

	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
	}

	@Override
	public String toString() {
		return "Transaction [transactionId=" + transactionId + ", customerId=" + customerId + ", accountId=" + accountId
				+ ", amount=" + amount + ", transactionType=" + transactionType + "]";
	}

	public Transaction(Integer customerId, Integer accountId, BigDecimal amount, String transactionType) {
		super();

		this.customerId = customerId;
		this.accountId = accountId;
		this.amount = amount;
		this.transactionType = transactionType;
	}

	public Transaction() {
		super();
		// TODO Auto-generated constructor stub
	}

}
