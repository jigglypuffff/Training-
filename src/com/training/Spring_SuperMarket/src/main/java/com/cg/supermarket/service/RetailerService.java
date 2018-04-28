package com.cg.supermarket.service;

import java.util.List;

import com.cg.supermarket.model.Customer;
import com.cg.supermarket.model.Goods;
import com.cg.supermarket.model.Supplier;

/**
 * @author trainee
 *
 */
public interface RetailerService {


	List<Goods> viewGoods();
	List<Customer> viewCustomer();
	List<Supplier> viewSupplier();
}
