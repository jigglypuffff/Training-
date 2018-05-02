import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.cg.market.controller.ApplicationConfig;
import com.cg.market.model.Customer;
import com.cg.market.model.Goods;
import com.cg.market.model.Supplier;
import com.cg.market.service.CustomerService;
import com.cg.market.service.GoodsService;
import com.cg.market.service.RetailerService;
import com.cg.market.service.SupplierService;

public class MarketTest {

	ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);


	CustomerService custService = (CustomerService) context.getBean("customerService");
	GoodsService goodsService = (GoodsService) context.getBean("goodsService");
	SupplierService supplierService = (SupplierService) context.getBean("supplierService");
	RetailerService retailerService = (RetailerService) context.getBean("retailerService");



@Test
public void customerTest() {

	Customer customer = new Customer(1, "aishwarya", "London", "cash");
	
	Customer value=custService.addCustomer(customer);
	assertEquals(customer, value);
}

@Test
public void goodsTest() {

	Goods goods = new Goods(102, "tv", "2",2000);

	Goods value=goodsService.addGoods(goods);
	assertEquals(goods, value);
}


@Test
public void supplierTest() {

	Supplier sup = new Supplier(1000, "Ashish Sharma", "Delhi", 4 ,1,3000);
	
	Supplier value=supplierService.addSupplier(sup);
	assertEquals(sup, value);
}


@Test
public void customerRemoveTest() {

	Customer customer = new Customer(1, "aishwarya", "London", "cash");
//	Customer customer = new Customer(2, "Yash", "New York", "cash");
	
	Customer value=custService.removeCustomer(customer);
	assertEquals(customer, value);
}


@Test
public void goodsRemoveTest() {

	Goods goods = new Goods(102, "Fridge", "2",1212);

	Goods value=goodsService.removeGoods(goods);
	assertEquals(goods, value);
}
@Test
public void supplierRemoveTest() {

	Supplier sup = new Supplier(1, "shruti", "pune", 2,1,200);
	//	CustomerDao customerService;
	Supplier value=supplierService.removeSupplier(sup);
	assertEquals(sup, value);
}

	
	
	}


