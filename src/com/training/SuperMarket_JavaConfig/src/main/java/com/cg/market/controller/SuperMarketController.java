package com.cg.market.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.cg.market.model.Customer;
import com.cg.market.model.Goods;
import com.cg.market.model.Retailer;
import com.cg.market.model.Supplier;
import com.cg.market.service.CustomerService;
import com.cg.market.service.CustomerServiceImpl;
import com.cg.market.service.GoodsService;
import com.cg.market.service.GoodsServiceImpl;
import com.cg.market.service.RetailerService;
import com.cg.market.service.RetailerServiceImpl;
import com.cg.market.service.SupplierService;
import com.cg.market.service.SupplierServiceImpl;

public class SuperMarketController {

	
	final ApplicationContext config= new AnnotationConfigApplicationContext(ApplicationConfig.class);
	
	final CustomerServiceImpl custSer = config.getBean("customerService", CustomerServiceImpl.class);
	
	final GoodsServiceImpl goodsSer = config.getBean("goodsService", GoodsServiceImpl.class);
	
	final SupplierServiceImpl suppSer = config.getBean("supplierService",SupplierServiceImpl.class);
	
	final RetailerServiceImpl retSer =  config.getBean("retailerService",RetailerServiceImpl.class);
	
	CustomerService customerService;
	SupplierService supplierService;
	GoodsService goodsService;
	RetailerService retailerService;
	
	public SuperMarketController(CustomerService customerService) {
		this.customerService = customerService;
	}

	public SuperMarketController(SupplierService supplierService) {
		this.supplierService=supplierService;
	}

	public SuperMarketController(GoodsService goodsService) {
		this.goodsService=goodsService;
	}

	public SuperMarketController(RetailerService retailerService) {
		this.retailerService=retailerService;
	}

	public SuperMarketController() {
		// TODO Auto-generated constructor stub
	}

	public Customer addCustomer(final Customer customer) {

		return custSer.addCustomer(customer);
	}

	public Customer removeCustomer(final Customer customer) {

		return custSer.removeCustomer(customer);
	}

	public Customer updateCustomer(final Customer customer) {

		return custSer.updateCustomer(customer);
	}
	
	public Goods addGoods(final Goods goods) {

		return goodsSer.addGoods(goods);
	}

	public Goods removeGoods(final Goods goods) {

		return goodsSer.removeGoods(goods);
	}

	public Goods updateGoods(final Goods goods) {

		return goodsSer.updateGoods(goods);
	}
	

	public Supplier addSupplier(final Supplier supplier) {
		
		return suppSer.addSupplier(supplier);
	}

	
	public Supplier removeSupplier(final Supplier supplier) {
		
		return suppSer.removeSupplier(supplier);
	}

	
	public Supplier updateSupplier(final Supplier supplier) {
		
		return suppSer.updateSupplier(supplier);
	}
	public Retailer addRetailer(final Retailer retailer) {
		// TODO Auto-generated method stub
		return retSer.addRetailer(retailer);
	}

	
	public Retailer removeRetailer(final Retailer retailer) {
		
		return retSer.removeRetailer(retailer);
	}

	
	public Retailer updateRetailer(final Retailer retailer) {
		
		return retSer.updateRetailer(retailer);
	}
}
