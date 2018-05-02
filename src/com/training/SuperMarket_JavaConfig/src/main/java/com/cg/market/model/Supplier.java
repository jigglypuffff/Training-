package com.cg.market.model;


/**
 * @author aishwarya
 *
 */
public class Supplier {

	/**
	 * 
	 */
	private int supplierId;
	/**
	 * 
	 */
	private String supplierName;
	/**
	 * 
	 */
	private String supplierAddress;
	/**
	 * 
	 */
	private int quantityOrder;
	/**
	 * 
	 */
	private int orderId;
	/**
	 * 
	 */
	private double amount;

	public Supplier() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Supplier(final int supplierId, final String supplierName,final String supplierAddress,final int quantityOrder,final int orderId,
			final double amount) {
		super();
		this.supplierId = supplierId;
		this.supplierName = supplierName;
		this.supplierAddress = supplierAddress;
		this.quantityOrder = quantityOrder;
		this.orderId = orderId;
		this.amount = amount;
	}

	public double getAmount() {
		return amount;
	}

	public int getOrderId() {
		return orderId;
	}

	public int getQuantityOrder() {
		return quantityOrder;
	}

	public String getSupplierAddress() {
		return supplierAddress;
	}

	public int getSupplierId() {
		return supplierId;
	}

	public String getSupplierName() {
		return supplierName;
	}

	public void setAmount(final double amount) { 
		this.amount = amount;
	}

	public void setOrderId(final int orderId) {
		this.orderId = orderId;
	}

	public void setQuantityOrder(final int quantityOrder) {
		this.quantityOrder = quantityOrder;
	}

	public void setSupplierAddress(final String supplierAddress) {
		this.supplierAddress = supplierAddress;
	}

	public void setSupplierId(final int supplierId) {
		this.supplierId = supplierId;
	}

	public void setSupplierName(final String supplierName) {
		this.supplierName = supplierName;
	}

	@Override
	public String toString() {
		return "Supplier [supplierId=" + supplierId + ", supplierName=" + supplierName + ", supplierAddress="
				+ supplierAddress + ", quantityOrder=" + quantityOrder + ", orderId=" + orderId + ", amount=" + amount
				+ "]";
	}

}
