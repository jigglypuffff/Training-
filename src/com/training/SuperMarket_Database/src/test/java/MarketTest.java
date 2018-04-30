import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.cg.market.model.Customer;
import com.cg.market.model.Goods;
import com.cg.market.model.Retailer;
import com.cg.market.model.Supplier;

public class MarketTest {


		Customer customer=new Customer(1,"aishwarya","London","cash");
		
		Supplier supplier=new Supplier(101,"ashish","mumbai",2,111,200.2);
		
		Goods goods=new Goods(101,"TV","1",1000);
		
		Retailer retailer=new Retailer(1,"Yash","Delhi");
		
		

		@Test
		public void customerTest() {
				assertEquals(1,customer.getCustomerId());
				assertEquals("aishwarya",customer.getCustomerName());
				assertEquals("London",customer.getCustomerAddress());
				assertEquals("cash",customer.getPaymentMode());
		}
		@Test
		public void goodsTest() {
				assertEquals(101,goods.getGoodsId());
				assertEquals("TV",goods.getGoodsName());
				assertEquals("1",goods.getGoodsQuantity());
			
		}
		@Test
		public void supplierTest() {
				assertEquals(101,supplier.getSupplierId());
				assertEquals("ashish",supplier.getSupplierName());
				assertEquals("mumbai",supplier.getSupplierAddress());
				assertEquals(2,supplier.getQuantityOrder());
				assertEquals(111,supplier.getOrderId());
		}
				//assertEquals("200.2",supplier.getAmount());

		
				/*@Test
				public void retailerTest() {
						
					assertEquals(1,retailer.getRetailerName());
						assertEquals("Yash",retailer.getRetailerName());
						assertEquals("Delhi",retailer.getRetailerAddress());
		
		
		}*/

}
