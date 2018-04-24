import static org.junit.Assert.*;

import org.junit.Test;

public class TestBank {

	FlexSavingAccImpl test1 = new FlexSavingAccImpl();
	CheckingAccImpl test2 = new CheckingAccImpl();
	SavingAccImpl test3 = new SavingAccImpl();
	
	@Test
	public void findInterest() {
		assertEquals("true",test1.findInterest(1000,4,2),80);	
		assertEquals("true",test2.findInterest(1000,5,2),100);	
		assertEquals("true",test3.findInterest(1000,6,2),120);		
	}

}
