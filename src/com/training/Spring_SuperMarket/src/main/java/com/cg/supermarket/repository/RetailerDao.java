package com.cg.supermarket.repository;

import java.util.List;

import com.cg.supermarket.model.Customer;
import com.cg.supermarket.model.Goods;
import com.cg.supermarket.model.Supplier;

/**
 * @author trainee
 *
 */
public interface RetailerDao {

	List<Goods> viewGoods();
	List<Customer> viewCustomer();
	List<Supplier> viewSupplier();
	
}
