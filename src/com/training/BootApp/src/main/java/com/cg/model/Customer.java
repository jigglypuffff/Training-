package com.cg.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Customer {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "CustomerID")
	private int custId;
	@Column(name = "CustomerName")
	private String name;
	@Column(name = "CustomerAddress")
	private String address;
	@Column(name = "PaymentMode")
	private String paymentMode;
	public int getCustId() {
		return custId;
	}
	public void setCustId(int custId) {
		this.custId = custId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPaymentMode() {
		return paymentMode;
	}
	public void setPaymentMode(String paymentMode) {
		this.paymentMode = paymentMode;
	}
	@Override
	public String toString() {
		return "Customer [custId=" + custId + ", name=" + name + ", address=" + address + ", paymentMode=" + paymentMode
				+ "]";
	}
	public Customer(int custId, String name, String address, String paymentMode) {
		super();
		this.custId = custId;
		this.name = name;
		this.address = address;
		this.paymentMode = paymentMode;
	}
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
