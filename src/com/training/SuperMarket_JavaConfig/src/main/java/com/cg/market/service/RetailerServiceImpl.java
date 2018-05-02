package com.cg.market.service;

import java.util.List;

import com.cg.market.model.Customer;
import com.cg.market.model.Goods;
import com.cg.market.model.Retailer;
import com.cg.market.model.Supplier;
import com.cg.market.repository.RetailerDao;

/**
 * @author aishwarya
 *
 */
public class RetailerServiceImpl implements RetailerService {

	/**
	 * 
	 */
	public RetailerDao retailerDao;
	
	public RetailerServiceImpl(final RetailerDao retailerDao)
	{
		this.retailerDao = retailerDao;
	}
	
	@Override
	public List<Customer> clist() {
		
		return retailerDao.clist();
	}

	@Override
	public List<Supplier> slist() {
		// TODO Auto-generated method stub
		return retailerDao.slist();
	}

	@Override
	public List<Goods> glist() {
		// TODO Auto-generated method stub
		return retailerDao.glist();
	}

	@Override
	public Retailer addRetailer(final Retailer retailer) {
		// TODO Auto-generated method stub
		return retailerDao.addRetailer(retailer);
	}

}
