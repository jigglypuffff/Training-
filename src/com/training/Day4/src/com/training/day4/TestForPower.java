package com.training.day4;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;

public class TestForPower {

		static PowerTest test=new PowerTest();
			@Test
			public void power()
			{
				assertEquals("true",test.power(2,3),8);	
			}
		}

