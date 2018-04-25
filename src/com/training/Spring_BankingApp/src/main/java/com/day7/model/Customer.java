package com.day7.model;

import org.springframework.stereotype.Component;

@Component
public class Customer {
	private String customerId;
	private String firstName;
	private String lastName;
	private int initialBalance;

	private Contact contact;
	private Address address;
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
	public Contact getContact() {
		return contact;
	}
	public void setContact(Contact contact) {
		this.contact = contact;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", initialBalance=" + initialBalance + ", contact=" + contact + ", address=" + address + "]";
	}
	public Customer(String customerId, String firstName, String lastName, int initialBalance, Contact contact,
			Address address) {
		super();
		this.customerId = customerId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.initialBalance = initialBalance;
		this.contact = contact;
		this.address = address;
	}
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}


}
