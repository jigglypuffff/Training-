package com.cg.market.model;

/**
 * @author aishwarya
 *
 */
public class Customer {

	/**
	 Customer id  
	 */
	private int customerId;
	/**
	 Customer name 
	 */
	private String customerName;
	/**
	 customer address 
	 */
	private String customerAddress;
	/**
	 payment mode 
	 */
	private String paymentMode;

	public Customer() {
		super();
		
	}

	public Customer(final int customerId,final String customerName, final String customerAddress,final String paymentMode) {
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

	public void setCustomerAddress(final String customerAddress) {
		this.customerAddress = customerAddress;
	}

	public void setCustomerId(final int customerId) {
		this.customerId = customerId;
	}

	public void setCustomerName(final String customerName) {
		this.customerName = customerName;
	}

	public void setPaymentMode(final String paymentMode) {
		this.paymentMode = paymentMode;
	}

	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", paymentMode=" + paymentMode
				+ "]";
	}

}
