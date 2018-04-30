package com.cg.market.service;

import java.util.List;

import com.cg.market.model.Customer;
import com.cg.market.model.Goods;
import com.cg.market.model.Retailer;
import com.cg.market.model.Supplier;

public interface RetailerService {

	public Retailer addRetailer(Retailer retailer);

	public List<Customer> clist();

	public List<Supplier> slist();

	public List<Goods> glist();
}
