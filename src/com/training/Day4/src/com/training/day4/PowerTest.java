package com.training.day4;

import java.util.Scanner;

public class PowerTest {
	
	static long result=1;
	static Scanner inputval=new Scanner(System.in);
	
	
	public static void main(String[] args)
	{
		int number;
		int powerOfNum;
		
		System.out.println("Please Enter The Number");
		number=inputval.nextInt();
		

		while(number==0 || number<0)
		{
			System.out.println("The number should not be 0 or negative");
			System.out.println("Please Enter The Number");
			number=inputval.nextInt();
			
		}
		
		
		System.out.println("Please Enter The Power");
		powerOfNum=inputval.nextInt();
		

	   while(powerOfNum<0)
		{
			System.out.println("The power cannot be negative");
			System.out.println("Please Enter The Power");
			powerOfNum=inputval.nextInt();
		}
		
		final long result = power(number,powerOfNum);
		System.out.println("Power Of The Entered Value is: "+result);
		
	}
	
	public static long power( int number, final int pow)
	{
		for(int i=1;i<=pow;i++)
		{
			result=result*number;
			
		}
		//result=number;
		return result;
		
	}
}
