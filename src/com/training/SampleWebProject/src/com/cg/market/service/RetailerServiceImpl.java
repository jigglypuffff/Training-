package com.cg.market.service;

import java.util.List;

import com.cg.market.model.Customer;
import com.cg.market.model.Goods;
import com.cg.market.model.Retailer;
import com.cg.market.model.Supplier;
import com.cg.market.repository.RetailerDao;

public class RetailerServiceImpl implements RetailerService {

	/**
	 * 
	 */
	public RetailerDao rDao;
	
	public RetailerServiceImpl(final RetailerDao rDao)
	{
		this.rDao = rDao;
	}
	
	@Override
	public List<Customer> clist() {
		
		return rDao.clist();
	}

	@Override
	public List<Supplier> slist() {
		// TODO Auto-generated method stub
		return rDao.slist();
	}

	@Override
	public List<Goods> glist() {
		// TODO Auto-generated method stub
		return rDao.glist();
	}

	@Override
	public Retailer addRetailer(final Retailer retailer) {
		// TODO Auto-generated method stub
		return rDao.addRetailer(retailer);
		
		
		
	}

}
