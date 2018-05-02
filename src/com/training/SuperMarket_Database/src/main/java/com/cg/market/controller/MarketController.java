package com.cg.market.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cg.market.model.Customer;
import com.cg.market.model.Goods;
import com.cg.market.model.Retailer;
import com.cg.market.model.Supplier;
import com.cg.market.service.CustomerService;
import com.cg.market.service.GoodsService;
import com.cg.market.service.RetailerService;
import com.cg.market.service.SupplierService;

public class MarketController {

	public static void main(final String[] args) {
		
		
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		final CustomerService custSer = context.getBean("custService", CustomerService.class);

		final Customer customer = context.getBean("cust", Customer.class);

		customer.setCustomerId(1);
		customer.setCustomerName("Aishwarya");
		customer.setCustomerAddress("London");
		customer.setPaymentMode("Cash");

		customer.setCustomerId(2);
		customer.setCustomerName("Yash");
		customer.setCustomerAddress("New York");
		customer.setPaymentMode("Card");
		
		custSer.addCustomer(customer);

		
		 customer.setCustomerId(2);
		 custSer.removeCustomer(customer);
		
		customer.setCustomerName("ritika");
		customer.setCustomerId(1);
		custSer.updateCustomer(customer);

		//***************************************************************************//*
		
		final GoodsService goodsSer = context.getBean("gService", GoodsService.class);

		final Goods goods = context.getBean("good", Goods.class);

		goods.setGoodsId(101);
		goods.setGoodsName("TV");
		goods.setGoodsPrice(1000);
		goods.setGoodsQuantity("1");

		goods.setGoodsId(102);
		goods.setGoodsName("Fridge");
		goods.setGoodsPrice(2000);
		goods.setGoodsQuantity("2");

		goodsSer.addGoods(goods);
		
		
		goods.setGoodsId(101);
		goodsSer.removeGoods(goods);
		
		
		goods.setGoodsName("Television");
		goods.setGoodsId(102);
		goodsSer.updateGoods(goods);
		
		
		//******************************************************************************//
		
		final SupplierService suppSer = context.getBean("sService",SupplierService.class);
		
		final Supplier supplier  = context.getBean("supp",Supplier.class);
		
		supplier.setSupplierId(1000);
		supplier.setSupplierName("Ashish");
		supplier.setSupplierAddress("Delhi");
		supplier.setQuantityOrder(4);
		supplier.setOrderId(1);
		supplier.setAmount(3000);
		
		
		supplier.setSupplierId(1001);
		supplier.setSupplierName("Param");
		supplier.setSupplierAddress("Mumbai");
		supplier.setQuantityOrder(2);
		supplier.setOrderId(2);
		supplier.setAmount(4000);
		
		suppSer.addSupplier(supplier);
		

		supplier.setSupplierId(1001);
		suppSer.removeSupplier(supplier);
		
		
		supplier.setSupplierName("Ashish Sharma");
		supplier.setSupplierId(1000);
		suppSer.updateSupplier(supplier);
		
		
		
		//*************************************************************************************//
		
		
		final RetailerService retSer =  context.getBean("rService",RetailerService.class);
		final Retailer retailer = context.getBean("ret", Retailer.class);
		
		retailer.setRetailerId(100);
		retailer.setRetailerName("Aarav");
		retailer.setRetailerAddress("USA");
		
		retSer.addRetailer(retailer);
		
		
		

	}
}
