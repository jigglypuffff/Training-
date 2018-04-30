package com.cg.market.model;

/**
 * @author aishwarya
 *
 */
public class Customer {

	private int customerId;
	private String customerName;
	private String customerAddress;
	private String paymentMode;

	public Customer() {
		super();
		
	}

	public Customer(int customerId, String customerName, String customerAddress, String paymentMode) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.customerAddress = customerAddress;
		this.paymentMode = paymentMode;
	}

	public String getCustomerAddress() {
		return customerAddress;
	}

	public int getCustomerId() {
		return customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public String getPaymentMode() {
		return paymentMode;
	}

	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public void setPaymentMode(String paymentMode) {
		this.paymentMode = paymentMode;
	}

	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", paymentMode=" + paymentMode
				+ "]";
	}

}
