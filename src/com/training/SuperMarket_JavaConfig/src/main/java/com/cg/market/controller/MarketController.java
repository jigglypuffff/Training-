package com.cg.market.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//import org.springframework.context.support.ClassPathXmlApplicationContext;

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
		
		
		//ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		final ApplicationContext config= new AnnotationConfigApplicationContext(ApplicationConfig.class);
		
		/*CustomerService custSer = context.getBean("custService", CustomerService.class);

		Customer customer = context.getBean("cust", Customer.class);
*/
		final CustomerService custSer = config.getBean("customerService", CustomerService.class);

		final Customer customer = config.getBean("customer", Customer.class);
		

		
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
		
		customer.setCustomerName("vishakha");
		customer.setCustomerId(2);
		custSer.updateCustomer(customer);

		//***************************************************************************//*
		
		//GoodsService goodsSer = context.getBean("gService", GoodsService.class);

		//Goods goods = context.getBean("good", Goods.class);

		
		final GoodsService goodsSer = config.getBean("goodsService", GoodsService.class);

		final Goods goods = config.getBean("goods", Goods.class);
		
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
		
		
		//******************************************************************************
		

		//SupplierService suppSer = context.getBean("sService",SupplierService.class);
		
		//Supplier supplier  = context.getBean("supp",Supplier.class);
		
		final SupplierService suppSer = config.getBean("supplierService",SupplierService.class);
		
		final Supplier supplier  = config.getBean("supplier",Supplier.class);
		
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
		
		
		
		//************************************************************************************
		
		
		//RetailerService retSer =  context.getBean("rService",RetailerService.class);
		//Retailer retailer = context.getBean("ret", Retailer.class);
		
		
		final RetailerService retSer =  config.getBean("retailerService",RetailerService.class);
		final Retailer retailer = config.getBean("retailer", Retailer.class);
		
		retailer.setRetailerId(100);
		retailer.setRetailerName("Aarav");
		retailer.setRetailerAddress("USA");
		
		retSer.addRetailer(retailer);
		
		
		
	}
}
