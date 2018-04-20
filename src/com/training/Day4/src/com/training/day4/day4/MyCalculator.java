package com.training.day4;

import java.util.Scanner;

public class MyCalculator {
	
	static Scanner inputval=new Scanner(System.in);
	
	public static long power(final int number, final int pow)
	{
		if(pow>0)
		{
			return number*power(number,pow-1);
		}
		return 1;
	}
	
	public static void main(final String args[])
	{
		int number;
		int powerOfNum;
		
		System.out.println("Please ENter The Number");
		number=inputval.nextInt();
		
		if(number==0)
		{
			System.out.println("The number should not be 0");
			System.out.println("Please ENter The Number");
			number=inputval.nextInt();
		}
		
		
		
		else if(number<0)
		{
			System.out.println("The number cannot be negative");
			System.out.println("Please ENter The Number");
			number=inputval.nextInt();
		}
		
		
		
		System.out.println("Please ENter The Power");
		powerOfNum=inputval.nextInt();
		

	    if(powerOfNum<0)
		{
			System.out.println("The power cannot be negative");
			System.out.println("Please ENter The Power");
			powerOfNum=inputval.nextInt();
		}
		
		final long result=power(number,powerOfNum);
		System.out.println("Power Of The Entered Value is: "+result);
	}
}
