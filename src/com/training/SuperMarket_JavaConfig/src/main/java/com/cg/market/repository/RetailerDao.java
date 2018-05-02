package com.cg.market.repository;

import java.util.List;

import com.cg.market.model.Customer;
import com.cg.market.model.Goods;
import com.cg.market.model.Retailer;
import com.cg.market.model.Supplier;

/**
 * @author aishwarya
 *
 */
public interface RetailerDao {

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

	public Retailer removeRetailer(final Retailer retailer);

	public Retailer updateRetailer(final Retailer retailer);

}
