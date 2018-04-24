package com.day7.model;

import org.springframework.stereotype.Component;

@Component
public class Customer {

	private String customerId;
	private String firstName;
	private String lastName;
	private int initialBalance = 1000;
	private String contactNo;
	private String email;
	private String address;

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getInitialBalance() {
		return initialBalance;
	}

	public void setInitialBalance(int initialBalance) {
		this.initialBalance = initialBalance;
	}

	public String getContactNo() {
		return contactNo;
	}

	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", initialBalance=" + initialBalance + ", contactNo=" + contactNo + ", email=" + email + ","
				+ " address=" + address + "]";
	}

	public Customer(String customerId, String firstName, String lastName, int initialBalance, String contactNo,
			String email, String address) {
		super();
		this.customerId = customerId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.initialBalance = initialBalance;
		this.contactNo = contactNo;
		this.email = email;
		this.address = address;
	}

	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

}
