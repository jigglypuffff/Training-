package com.cg.market.controller;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.cg.market.model.Customer;
import com.cg.market.model.Goods;
import com.cg.market.model.Retailer;
import com.cg.market.model.Supplier;
import com.cg.market.repository.CustomerDao;
import com.cg.market.repository.CustomerDaoImpl;
import com.cg.market.repository.GoodsDao;
import com.cg.market.repository.GoodsDaoImpl;
import com.cg.market.repository.RetailerDao;
import com.cg.market.repository.RetailerDaoImpl;
import com.cg.market.repository.SupplierDao;
import com.cg.market.repository.SupplierDaoImpl;
import com.cg.market.service.CustomerService;
import com.cg.market.service.CustomerServiceImpl;
import com.cg.market.service.GoodsService;
import com.cg.market.service.GoodsServiceImpl;
import com.cg.market.service.RetailerService;
import com.cg.market.service.RetailerServiceImpl;
import com.cg.market.service.SupplierService;
import com.cg.market.service.SupplierServiceImpl;

@Configuration
@ComponentScan("com.cg.market")
@PropertySource("classpath:database.properties")
public class ApplicationConfig {

	/**
	 * 
	 */
	@Autowired
	public Environment environment; 

	/**
	 * 
	 */
	private final String URL = "url";
	/**
	 * 
	 */
	private final String USER = "dbuser";
	/**
	 * 
	 */
	private final String DRIVER = "driver";
	/**
	 * 
	 */
	private final String PASSWORD = "dbpassword";

	@Bean
	DataSource dataSource() {
		final DriverManagerDataSource driverManagerDataSource = new DriverManagerDataSource();
		
		
		driverManagerDataSource.setUrl(environment.getProperty("url"));
		driverManagerDataSource.setUsername(environment.getProperty("dbuser"));
		driverManagerDataSource.setPassword(environment.getProperty("dbpassword"));
		driverManagerDataSource.setDriverClassName(environment.getProperty("driver"));
		return driverManagerDataSource;
	}

	@Bean
	JdbcTemplate jdbcTemplate(final DataSource dataSource)
	{
		final JdbcTemplate jdbcTemplate= new JdbcTemplate(dataSource);
		return jdbcTemplate;
	}
	
	@Bean(name = "customerService")
	public CustomerService getCustomerService(final CustomerDao customerDao)
	{
		final CustomerServiceImpl service =  new CustomerServiceImpl(customerDao);
		
		return service;
	}
	
	@Bean(name= "customerDao")
	public CustomerDao getCustomerDao(final JdbcTemplate jdbcTemplate)
	{
		final CustomerDao customerDao= new CustomerDaoImpl(jdbcTemplate);
		return customerDao;
	}
	
	@Bean(name = "customer")
	public Customer getCustomer()
	{
		return new Customer();
	//	return customer;
	}
	
/*********************************************************************************/
	
	
	@Bean(name = "goodsService")
	public GoodsService getGoodsService(final GoodsDao goodsDao)
	{
		final GoodsServiceImpl service =  new GoodsServiceImpl(goodsDao);
		
		return service;
	}
	
	@Bean(name= "goodsDao")
	public GoodsDao getGoodsDao(final JdbcTemplate jdbcTemplate)
	{
		final GoodsDao goodsDao= new GoodsDaoImpl(jdbcTemplate);
		return goodsDao;
	}
	
	
	
	@Bean(name = "goods")
	public Goods getGoods()
	{
		return new Goods();
	
	}
	
/******************************************************************************/
	
	@Bean(name = "supplierService")
	public SupplierService getSupplierService(final SupplierDao supplierDao)
	{
		final SupplierServiceImpl service =  new SupplierServiceImpl(supplierDao);
		
		return service;
	}
	
	@Bean(name= "supplierRepository")
	public SupplierDao getSupplierDao(final JdbcTemplate jdbcTemplate)
	{
		final SupplierDao supplierDao=  new SupplierDaoImpl(jdbcTemplate);
		return supplierDao;
	}
	
	
	

	@Bean(name = "supplier")
	public Supplier getSupplier()
	{
		return new Supplier();
	
	}
	
	
/*******************************************************************/
	
	
	@Bean(name = "retailerService")
	public RetailerService getRetailerService(final RetailerDao retailerDao)
	{
		final RetailerServiceImpl service =  new RetailerServiceImpl(retailerDao);
		
		return service;
	}
	
	@Bean(name= "retailerRepository")
	public RetailerDao getRetailerDao(final JdbcTemplate jdbcTemplate)
	{
		final RetailerDao retailerDao= new RetailerDaoImpl(jdbcTemplate);
		return retailerDao;
	}
	

	@Bean(name = "retailer")
	public Retailer getRetailer()
	{
		return new Retailer();
	
	}
	
	
}
