package com.cg.supermarket.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cg.supermarket.model.Customer;
import com.cg.supermarket.model.Goods;
import com.cg.supermarket.model.Supplier;
import com.cg.supermarket.service.CustomerService;
import com.cg.supermarket.service.GoodsService;
import com.cg.supermarket.service.RetailerService;
import com.cg.supermarket.service.SupplierService;

public class MarketController {

	public static void main(String[] args) {
		
		//TestSuperMarket test = new TestSuperMarket();
		
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		CustomerService custSer = context.getBean("custService",CustomerService.class);
	
		SupplierService sSer = context.getBean("supplierServ",SupplierService.class);
		
		RetailerService rSer = context.getBean("retailerServ",RetailerService.class);
		
		GoodsService gSer = context.getBean("goodsServ",GoodsService.class);
		
		
		Customer customer = context.getBean("cust",Customer.class);
		
		custSer.addCustomer(customer);
		
		custSer.removeCustomer(customer);
		
		
		Supplier supplier = context.getBean("supp",Supplier.class);
		
		sSer.addSupplier(supplier);
		
		sSer.removeSupplier(supplier);
		
		Goods goods = context.getBean("good", Goods.class);
		
		gSer.addGoods(goods);
		
		gSer.removeGoods(goods);
		
		
	}

}
