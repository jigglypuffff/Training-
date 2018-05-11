package com.cg.model;



/**
 * @author aishwarya
 *
 */
public class Retailer {

	/**
	 * 
	 */
	private int retailerId;
	/**
	 * 
	 */
	private String retailerName;
	/**
	 * 
	 */
	private String retailerAddress;
	
	
	
	
	public Retailer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Retailer(final int retailerId, final String retailerName,final String retailerAddress) {
		super();
		this.retailerId = retailerId;
		this.retailerName = retailerName;
		this.retailerAddress = retailerAddress;
	}

	
	@Override
	public String toString() {
		return "Retailer [retailerId=" + retailerId + ", retailerName=" + retailerName + ", retailerAddress="
				+ retailerAddress + "]";
	}

}

