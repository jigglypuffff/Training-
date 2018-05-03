import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.cg.market.controller.ApplicationConfig;
import com.cg.market.model.Customer;
import com.cg.market.model.Goods;
import com.cg.market.model.Retailer;
import com.cg.market.model.Supplier;
import com.cg.market.service.CustomerService;
import com.cg.market.service.GoodsService;
import com.cg.market.service.RetailerService;
import com.cg.market.service.SupplierService;

/**
 * @author trainee
 *
 */
public class MarketTest {

	/**
	 * 
	 */
	public ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);

	/**
	 * 
	 */
	public CustomerService custService = (CustomerService) context.getBean("customerService");
	/**
	 * 
	 */
	public GoodsService goodsService = (GoodsService) context.getBean("goodsService");
	/**
	 * 
	 */
	public SupplierService supplierService = (SupplierService) context.getBean("supplierService");
	/**
	 * 
	 */
	public RetailerService retailerService = (RetailerService) context.getBean("retailerService");

	/**
	 * 
	 */
	@Test
	@SuppressWarnings("PMD.JUnitTestContainsTooManyAsserts")
	public void customerTest() {

		final Customer customer = new Customer(1, "aishwarya", "London", "cash");
		final Customer customer1 = new Customer(2, "Ash", "Paris", "Card");

		final Customer value = custService.addCustomer(customer);
		final Customer value1 = custService.addCustomer(customer1);
		
		assertEquals("true",customer, value);
		assertEquals("true",customer1, value1);
	}

	/**
	 * 
	 */
	@Test
	public void goodsTest() {

		final Goods goods = new Goods(102, "tv", "2", 2000);

		final Goods value = goodsService.addGoods(goods);
		assertEquals("true",goods, value);
	}

	/**
	 * 
	 */
	@Test
	public void supplierTest() {

		final Supplier sup = new Supplier(1000, "Ashish Sharma", "Delhi", 4, 1, 3000);

		final Supplier value = supplierService.addSupplier(sup);
		assertEquals("true",sup, value);
	}
	
	/**
	 * 
	 */
	@Test
	public void retailerTest() {

		final Retailer ret = new Retailer(100, "Aarav", "USA");

		final Retailer value = retailerService.addRetailer(ret);
		assertEquals("true",ret, value);
	}

	
	/**
	 * 
	 */
	@Test
	public void customerRemoveTest() {

		final Customer customer = new Customer(1, "aishwarya", "London", "cash");
		
		final Customer value = custService.removeCustomer(customer);
		assertEquals("true",customer, value);
	}

	/**
	 * 
	 */
	@Test
	public void goodsRemoveTest() {

		final Goods goods = new Goods(102, "Fridge", "2", 1212);

		final Goods value = goodsService.removeGoods(goods);
		assertEquals("true",goods, value);
	}

	/**
	 * 
	 */
	@Test
	public void supplierRemoveTest() {

		final Supplier sup = new Supplier(1, "shruti", "pune", 2, 1, 200);
		
		final Supplier value = supplierService.removeSupplier(sup);
		assertEquals("true",sup, value);
	}
	
	/**
	 * 
	 */
	@Test
	public void retailerRemoveTest() {

		final Retailer ret = new Retailer(100, "Aarav", "USA");

		final Retailer value = retailerService.removeRetailer(ret);
		assertEquals("true",ret, value);
	}
	
	
	/**
	 * 
	 */
	@Test
	public void supplierUpdateTest() {

		final Supplier sup = new Supplier(1, "Aishu", "USA", 2, 1, 200);
		
		final Supplier value = supplierService.updateSupplier(sup);
		assertEquals("true",sup, value);
	}

	/**
	 * 
	 */
	@Test
	public void retailerUpdateTest() {

		final Retailer ret = new Retailer(100, "Aarav", "USA");

		final Retailer value = retailerService.updateRetailer(ret);
		assertEquals("true",ret, value);
	}
}
