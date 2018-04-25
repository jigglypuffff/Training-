package com.day7.model;

public class Contact {

	private String phone;
	public Contact(String phone, String mobile, String email) {
		super();
		this.phone = phone;
		this.mobile = mobile;
		this.email = email;
	}

	private String mobile;
	private String email;

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public Contact() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
