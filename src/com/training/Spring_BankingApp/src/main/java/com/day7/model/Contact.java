package com.day7.model;

public class Contact {

	/**
	 phone no of customer 
	 */
	private String phone;
	/**
	 mobile no of customer 
	 */
	private String mobile;
	/**
	 email id of customer 
	 */
	private String email;

	public Contact(final String phone,final String mobile, final String email) {
		super();
		this.phone = phone;
		this.mobile = mobile;
		this.email = email;
	}

	
	public String getPhone() {
		return phone;
	}

	public void setPhone(final String phone) {
		this.phone = phone;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(final String mobile) {
		this.mobile = mobile;
	}

	public Contact() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(final String email) {
		this.email = email;
	}

}
