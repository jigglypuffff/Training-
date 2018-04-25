package com.day7.model;

public class Address {

	private String street;
	private String houseNumber;
	private String zipCode;
	private String city;

	// static List<Contact> list=new ArrayList<>();

	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Address(String fname, String lname, String ph, String mob, String email, String str, String hno, String pin,
			String city) {

	}

	@Override
	public String toString() {
		return "Address [street=" + street + ", houseNumber=" + houseNumber + ", zipCode=" + zipCode + ", city=" + city
				+ "]";
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getHouseNumber() {
		return houseNumber;
	}

	public void setHouseNumber(String houseNumber) {
		this.houseNumber = houseNumber;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	public String getCity() {
		return city;
	}

	public Address(String street, String houseNumber, String zipCode, String city) {
		super();
		this.street = street;
		this.houseNumber = houseNumber;
		this.zipCode = zipCode;
		this.city = city;
	}

	public void setCity(String city) {
		this.city = city;
	}

}
