package com.day7.model;

import org.springframework.stereotype.Component;

/**
 * @author trainee
 *
 */
@Component
public class Customer {
	/**
	 Customer Id 
	 */
	private String customerId;
	/**
	 First name of customer 
	 */
	private String firstName;
	public Customer(final String customerId,final String firstName,final String lastName,final int initialBalance) {
		super();
		this.customerId = customerId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.initialBalance = initialBalance;
	}
	/**
	 Last name of customer 
	 */
	private String lastName;
	/**
	 Initial Balance of customer 
	 */
	private int initialBalance;

	/**
	 Contact Details of customer 
	 */
	private Contact contact;
	/**
	 Address of customer 
	 */
	private Address address;
	public String getCustomerId() {
		return customerId;
	}
	public void setCustomerId(final String customerId) {
		this.customerId = customerId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(final String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(final String lastName) {
		this.lastName = lastName;
	}
	public int getInitialBalance() {
		return initialBalance;
	}
	public void setInitialBalance(final int initialBalance) {
		this.initialBalance = initialBalance;
	}
	public Contact getContact() {
		return contact;
	}
	public void setContact(final Contact contact) {
		this.contact = contact;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(final Address address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", initialBalance=" + initialBalance + ", contact=" + contact + ", address=" + address + "]";
	}
	public Customer(final String customerId, final String firstName,final String lastName,final int initialBalance,final Contact contact,
			final Address address) {
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
		
	}


}
