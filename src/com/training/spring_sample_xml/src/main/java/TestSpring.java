import static org.junit.Assert.assertNotNull;

import org.junit.jupiter.api.Test;

import com.day6.dao.CustomerDaoImpl;

class TestSpring {

	CustomerDaoImpl test =new CustomerDaoImpl();
	@Test
	void test() {
		
		
		assertNotNull("true", test.findAll());
		
	}

	
}
