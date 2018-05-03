import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.cg.market.controller.SuperMarketController;
import com.cg.market.model.Customer;
import com.cg.market.model.Goods;
import com.cg.market.model.Retailer;
import com.cg.market.model.Supplier;

public class TestCase {

	/*public ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);
	public SuperMarketController custControl = (SuperMarketController)context.getBean("cController");
	
	public SuperMarketController goodsControl = (SuperMarketController)context.getBean("gController");
	
	public SuperMarketController suppControl = (SuperMarketController)context.getBean("sController");
	
	public SuperMarketController retControl = (SuperMarketController)context.getBean("rController");
	
	*/
	

	SuperMarketController control = new SuperMarketController();
	
	
	@Test
	@SuppressWarnings("PMD.JUnitTestContainsTooManyAsserts")
	public void customerTest() {

		final Customer customer = new Customer(1, "aishwarya", "London", "cash");
		final Customer customer1 = new Customer(2, "Ash", "Paris", "Card");

		final Customer value = control.addCustomer(customer);
		final Customer value1 = control.addCustomer(customer1);
		
		assertEquals("true",customer, value);
		assertEquals("true",customer1, value1);
	}

	/**
	 * 
	 */
	@Test
	public void goodsTest() {

		final Goods goods = new Goods(102, "tv", "2", 2000);

		final Goods value = control.addGoods(goods);
		assertEquals("true",goods, value);
	}

	/**
	 * 
	 */
	@Test
	public void supplierTest() {

		final Supplier sup = new Supplier(1000, "Ashish Sharma", "Delhi", 4, 1, 3000);

		final Supplier value = control.addSupplier(sup);
		assertEquals("true",sup, value);
	}
	
	/**
	 * 
	 */
	@Test
	public void retailerTest() {

		final Retailer ret = new Retailer(100, "Aarav", "USA");

		final Retailer value = control.addRetailer(ret);
		assertEquals("true",ret, value);
	}

	
	/**
	 * 
	 */
	@Test
	public void customerRemoveTest() {

		final Customer customer = new Customer(1, "aishwarya", "London", "cash");
		
		final Customer value = control.removeCustomer(customer);
		assertEquals("true",customer, value);
	}

	/**
	 * 
	 */
	@Test
	public void goodsRemoveTest() {

		final Goods goods = new Goods(102, "Fridge", "2", 1212);

		final Goods value = control.removeGoods(goods);
		assertEquals("true",goods, value);
	}

	/**
	 * 
	 */
	@Test
	public void supplierRemoveTest() {

		final Supplier sup = new Supplier(1, "shruti", "pune", 2, 1, 200);
		
		final Supplier value = control.removeSupplier(sup);
		assertEquals("true",sup, value);
	}
	
	/**
	 * 
	 */
	@Test
	public void retailerRemoveTest() {

		final Retailer ret = new Retailer(100, "Aarav", "USA");

		final Retailer value = control.removeRetailer(ret);
		assertEquals("true",ret, value);
	}
	
	
	/**
	 * 
	 */
	@Test
	public void supplierUpdateTest() {

		final Supplier sup = new Supplier(1, "Aishu", "USA", 2, 1, 200);
		
		final Supplier value = control.updateSupplier(sup);
		assertEquals("true",sup, value);
	}

	/**
	 * 
	 */
	@Test
	public void retailerUpdateTest() {

		final Retailer ret = new Retailer(100, "Aarav", "USA");

		final Retailer value = control.updateRetailer(ret);
		assertEquals("true",ret, value);
	}

}
