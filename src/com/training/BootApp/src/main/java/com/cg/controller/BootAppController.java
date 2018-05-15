package com.cg.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cg.model.Customer;
import com.cg.model.Goods;
import com.cg.service.CustomerServiceImpl;
import com.cg.service.GoodsServiceImpl;

@RestController
public class BootAppController {

	@Autowired
	CustomerServiceImpl custService;
	@Autowired
	GoodsServiceImpl goodsService;
	
	
	@RequestMapping(value = "/customer", method = RequestMethod.POST)
	public void add(@RequestBody Customer customer) {
		custService.add(customer);
	}
	
	
	/*@RequestMapping(value = "/customer", method = RequestMethod.POST)
	public ResponseEntity<String> add(@RequestBody Customer customer)
	{
	    System.out.println(customer);
	    return new ResponseEntity(HttpStatus.CREATED);
	}*/

	@RequestMapping(value = "/showCustomer", method = RequestMethod.GET)
	public List<Customer> show() {
		return custService.getCustomers();
	}

	@RequestMapping(value = "/showCustomerById/{custId}", method = RequestMethod.GET)
	public Object showById(@PathVariable int custId) {
		return custService.viewById(custId);
	}

	@RequestMapping(value = "/deleteCustomer", method = RequestMethod.DELETE)
	public int removeCustomer(@RequestBody Integer customerId) {
		return custService.removeCustomer(customerId);
	}

	@RequestMapping(value = "/updateCustomer",method = RequestMethod.PUT)
	public Customer updateCustomer(@RequestBody Integer customerId) {
		return custService.updateCustomer(customerId);
	}
	
	/**********************************************************************************************/
	
	
	@RequestMapping(value= "/addGoods", method = RequestMethod.POST)
	public void addGoods(@RequestBody Goods goods)
	{
		goodsService.addGoods(goods);
	}
	
	@RequestMapping(value= "/viewGoods", method = RequestMethod.GET)
	public List<Goods> showAllGoods()
	{
		return goodsService.viewGoods();	
	}
	
	@RequestMapping(value= "/viewGoodsById{goodsId}", method = RequestMethod.GET)
	public Goods showGoodsById(@PathVariable int goodsId)
	{
		return goodsService.viewGoodsById(goodsId);
	}
	
	@RequestMapping(value= "/deleteGoods",method=RequestMethod.DELETE)
	public int removeGoods(@RequestBody Goods goods)
	{
		return goodsService.deleteGoods(goods);
	}
	
	@RequestMapping(value= "/updateGoods",method = RequestMethod.PUT)
	public Goods updateGoods(@RequestBody Goods goods)
	{
		return goodsService.updateGoods(goods);
	}
	
	/***************************************************************************************************/
}
