import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.day6.dao.CustomerDaoImpl;

class TestSpringAnno {


		CustomerDaoImpl test =new CustomerDaoImpl();
		@Test
		void test() {
			
			
			assertNotNull("true", test.findAll());
			
	}

}
