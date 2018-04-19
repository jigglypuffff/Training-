import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MyTest {

	@Test
	public void palindrome()

	{
		final Palindrome test = new Palindrome(); // Palindrome is tested

		// assert statements
		assertEquals("true", tester.palindrone(121), true);
		assertEquals("true", tester.palindrone(-121), false);
		
	}
}
