package com.day7.model;

public class Address {

	/**
	 Street name of customer's address
	 */
	private String street;
	/**
	 houser number of customer
	 */
	private String houseNumber;
	/**
	 zip code of city 
	 */
	private String zipCode;
	/**
	 city of customer 
	 */
	private String city;

	// static List<Contact> list=new ArrayList<>();

	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Address(final String fname, final String lname, final String ph, final String mob,final String email,final String str,final String hno,final String pin,
			final String city) {

	}

	@Override
	public String toString() {
		return "Address [street=" + street + ", houseNumber=" + houseNumber + ", zipCode=" + zipCode + ", city=" + city
				+ "]";
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(final String street) {
		this.street = street;
	}

	public String getHouseNumber() {
		return houseNumber;
	}

	public void setHouseNumber(final String houseNumber) {
		this.houseNumber = houseNumber;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(final String zipCode) {
		this.zipCode = zipCode;
	}

	public String getCity() {
		return city;
	}

	public Address(final String street, final String houseNumber, final String zipCode,final String city) {
		super();
		this.street = street;
		this.houseNumber = houseNumber;
		this.zipCode = zipCode;
		this.city = city;
	}

	public void setCity(final String city) {
		this.city = city;
	}

}
