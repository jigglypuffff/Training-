package com.cg.market.repository;

import com.cg.market.model.Retailer;

/**
 * @author aishwarya
 *
 */
public interface RetailerDao {

	/**
	 * @param retailer
	 * @return
	 */
	 Retailer addRetailer(Retailer retailer);

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

	 Retailer removeRetailer(final Retailer retailer);

	 /**
	 * @param retailer
	 * @return
	 */
	Retailer updateRetailer(final Retailer retailer);

}
