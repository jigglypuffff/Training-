package com.cg.supermarket.service;

import java.util.List;

import com.cg.supermarket.model.Customer;
import com.cg.supermarket.model.Goods;
import com.cg.supermarket.model.Supplier;
import com.cg.supermarket.repository.RetailerDao;

/**
 * @author trainee
 *
 */
public class RetailerServiceImpl implements RetailerService{
	
	RetailerDao rDao;

	@Override
	public List<Goods> viewGoods() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Customer> viewCustomer() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Supplier> viewSupplier() {
		// TODO Auto-generated method stub
		return null;
	}
	
	 RetailerServiceImpl (RetailerDao rDao)
	 {
		 this.rDao=rDao;
	 }

}
