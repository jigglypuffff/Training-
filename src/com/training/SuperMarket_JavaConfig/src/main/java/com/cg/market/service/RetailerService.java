package com.cg.market.service;

import com.cg.market.model.Retailer;

/**
 * @author aishwarya
 *
 */
public interface RetailerService {

	/**
	 * @param retailer
	 * @return
	 */
	public Retailer addRetailer(Retailer retailer);

	/**
	 * @return
	 */
	/*public List<Customer> clist();

	*//**
	 * @return
	 *//*
	public List<Supplier> slist();

	*//**
	 * @return
	 *//*
	public List<Goods> glist();*/
	
	/**
	 * @param retailer
	 * @return
	 */
	public Retailer removeRetailer(final Retailer retailer);

	/**
	 * @param retailer
	 * @return
	 */
	public Retailer updateRetailer(final Retailer retailer);

}
