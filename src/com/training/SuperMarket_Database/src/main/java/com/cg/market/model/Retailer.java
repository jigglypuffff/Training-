package com.cg.market.model;



/**
 * @author aishwarya
 *
 */
public class Retailer {

	private int retailerId;
	private String retailerName;
	private String retailerAddress;

	public Retailer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Retailer(int retailerId, String retailerName, String retailerAddress) {
		super();
		this.retailerId = retailerId;
		this.retailerName = retailerName;
		this.retailerAddress = retailerAddress;
	}

	public String getRetailerAddress() {
		return retailerAddress;
	}

	public int getRetailerId() {
		return retailerId;
	}

	public String getRetailerName() {
		return retailerName;
	}

	public void setRetailerAddress(String retailerAddress) {
		this.retailerAddress = retailerAddress;
	}

	public void setRetailerId(int retailerId) {
		this.retailerId = retailerId;
	}

	public void setRetailerName(String retailerName) {
		this.retailerName = retailerName;
	}

	@Override
	public String toString() {
		return "Retailer [retailerId=" + retailerId + ", retailerName=" + retailerName + ", retailerAddress="
				+ retailerAddress + "]";
	}

}

