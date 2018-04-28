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
		//customer class
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		CustomerService custSer = context.getBean("custService",CustomerService.class);
		
		//supplier class
		ApplicationContext context1 = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		SupplierService sSer = context1.getBean("supplierServ",SupplierService.class);
		
		//retailer class
		ApplicationContext context2 = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		RetailerService rSer = context2.getBean("retailerServ",RetailerService.class);
		
		//goods class
		ApplicationContext context3 = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		GoodsService gSer = context3.getBean("goodsServ",GoodsService.class);
		
		
		
		

		Customer customer = new Customer(1, "Arjav", "Thane", "cash");// new customer entries entered in customer object

		Supplier serv = new Supplier(2, "Ashish", "Thane", 10, 1001, 100);// new supplier entries entered in supplier
																			// object

		Retailer retail = new Retailer(101, "Sammy", "Thane"); //new retailer entries
		
		Goods goods = new Goods(100,"Tv","1",2000.0);


		

		SupplierDaoImpl supp = new SupplierDaoImpl();

		CustomerDaoImpl cust = new CustomerDaoImpl();
		
		 

		Map<Integer, Customer> map = cust.getMap();

		

		custSer.addCustomer(customer);// Add customer

		assertEquals(1, map.size());// Test Case To Validate Data Is Getting Added

		custSer.removeCustomer(customer);//remove customer

		System.out.println(map.size()); 
		
		Map<Integer, Supplier> map2 = supp.getMap();

		sSer.addSupplier(serv);// Add Supplier

		assertEquals(1, map2.size());// Test Case To Validate Data Is Getting Added

		// supSer.removeSupplier(serv);
		
		GoodsDaoImpl good = new GoodsDaoImpl();
		
		Map<Integer,Goods> map3 = good.getMap();
		
		gSer.addGoods(goods);
		
		assertEquals(1, map3.size());

	}

}
