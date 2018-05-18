package com.cg.training.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Customer {

	@Id
	private Integer customerId;
	
	@ManyToOne(targetEntity=Bank.class)
	Bank bankId;
	

	private String name;
	
	private int pin;
	
	
	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", bankId=" + bankId + ", name=" + name + ", pin=" + pin + "]";
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId( final Integer customerId) {
		this.customerId = customerId;
	}
	
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Customer(final int customerId,final  Bank bankId, final String name,final  int pin) {
		super();
		this.customerId = customerId;
		this.bankId=bankId;
		this.name = name;
		this.pin = pin;
	}
	public void setBankId(final Bank bankId) {
		this.bankId = bankId;
	}
	public String getName() {
		return name;
	}
	public void setName(final String name) {
		this.name = name;
	}
	public int getPin() {
		return pin;
	}
	public void setPin(final int pin) {
		this.pin = pin;
	}
	
	
}
