import static org.junit.Assert.assertEquals;

import java.util.Map;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cg.supermarket.model.Customer;
import com.cg.supermarket.model.Goods;
import com.cg.supermarket.model.Retailer;
import com.cg.supermarket.model.Supplier;
import com.cg.supermarket.repository.CustomerDaoImpl;
import com.cg.supermarket.repository.GoodsDaoImpl;
import com.cg.supermarket.repository.SupplierDaoImpl;
import com.cg.supermarket.service.CustomerService;
import com.cg.supermarket.service.GoodsService;
import com.cg.supermarket.service.RetailerService;
import com.cg.supermarket.service.SupplierService;

/**
 * @author AishwaryaSawant Description :Test cases to add -(customer,supplier)
 *         remove -(customer,supplier)
 */
class TestSuperMarket {

	@Test
	void test() {
	
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		CustomerService custSer = context.getBean("custService",CustomerService.class);
		
		SupplierService sSer = context.getBean("supplierServ",SupplierService.class);
		
		RetailerService rSer = context.getBean("retailerServ",RetailerService.class);
		
		GoodsService gSer = context.getBean("goodsServ",GoodsService.class);
		
		Customer customer = new Customer(1, "yash", "Thane", "cash");      // new customer entries entered in customer object
		
		Customer customer2 = new Customer(1, "aishu", "Thane", "card");

		Supplier serv = new Supplier(2, "Ashish", "Thane", 10, 1001, 100);    // new supplier entries entered in supplier
																			 // object
		
		Supplier serv2 = new Supplier(2, "Ashish", "Thane", 10, 1001, 100); 

		Retailer retail = new Retailer(101, "Sammy", "Thane");              //new retailer entries
		
		Goods goods = new Goods(100,"Tv","1",2000.0);                        //new goods entries
		
		Goods goods2 = new Goods(101,"Fridge","2",4000.0);    
		

		CustomerDaoImpl cust = context.getBean("custDao",CustomerDaoImpl.class); 
		
		Map<Integer, Customer> map = cust.getMap();

		custSer.addCustomer(customer);               // Add customer
		
		custSer.addCustomer(customer2);  

		assertEquals(1, map.size());                 // Test Case To Validate Data Is Getting Added
		
		System.out.println(map.size());

		custSer.removeCustomer(customer);            //remove customer
		
		assertEquals(1, map.size()); 

		System.out.println(map.size()); 
		
		//*********************************************************//
		
		SupplierDaoImpl supp =  context.getBean("supplierDao",SupplierDaoImpl.class);
		
		Map<Integer, Supplier> map2 = supp.getMap();

		sSer.addSupplier(serv);// Add Supplier
		
		sSer.addSupplier(serv2);

		assertEquals(1, map2.size());// Test Case To Validate Data Is Getting Added
		
		System.out.println(map.size());

		 sSer.removeSupplier(serv);
		 
		 assertEquals(1, map2.size());
		 
		 System.out.println(map.size());
		
		//*********************************************************//
		
		GoodsDaoImpl good =context.getBean("goodsDao",GoodsDaoImpl.class) ;
		
		Map<Integer,Goods> map3 = good.getMap();
		
		gSer.addGoods(goods);
		
		gSer.addGoods(goods2);
		
		assertEquals(2, map3.size());
		
		 System.out.println(map.size());
		 
		 gSer.removeGoods(goods2);
		 
		 assertEquals(1,map.size());
		 
		
		

	}

}
