package com.cg.market.service;

import java.util.List;

import com.cg.market.model.Customer;
import com.cg.market.model.Goods;
import com.cg.market.model.Retailer;
import com.cg.market.model.Supplier;

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
	public List<Customer> clist();

	/**
	 * @return
	 */
	public List<Supplier> slist();

	/**
	 * @return
	 */
	public List<Goods> glist();
}
