package com.day6.controller;

import java.util.Scanner;

public class BankController {
	
	static Scanner scan=new Scanner(System.in);


	public static void main(String[] args) {
		
				
		System.out.println("Welcome To CG Bank");
		System.out.println("1-Add Customer");
		System.out.println("2-Perform Transactions");
		System.out.println("3-Exit");
		System.out.println("----------------------------------------------");
		
		int choice = scan.nextInt();
		
		switch(choice)
		{
		case 1 : System.out.println("Add Customers"); 
		addCustomers();
		break;
		
		case 2: System.out.println("Perform Transactions");
		performTransactions();
		break;
		
		case 3: System.out.println("Exit");
		break;
		}

	}
	
	


	private static void  addCustomers() {
		
		System.out.println("Enter your first name");
		String fname= scan.next();
		
		System.out.println("Enter your last name");
		String lname= scan.next();
		
		System.out.println("Enter your mobile no");
		String no= scan.next();
		
		System.out.println("Enter your phone no");
		String phone= scan.next();
		
		System.out.println("Enter your email id");
		String email= scan.next();
		
		System.out.println("Enter the street");
		String street=scan.next();
		
		System.out.println("Enter house number");
		String houseNo=scan.next();
		
		System.out.println("Enter city and zipcode");
		String city=scan.next();
		String zip=scan.next();
		
		System.out.println("Thank you :) ");
	}
	
	
	private static void performTransactions() {
		
		System.out.println("What transaction you want to perform?");
		System.out.println("1-Withdraw");
		System.out.println("2-Deposit");
		System.out.println("3-Check Balance");
		System.out.println("Exit");
		System.out.println("----------------------------------------------");
		
		System.out.println("Enter your choice");
		int choice=scan.nextInt();
		
		switch(choice)
		{
		case 1 : System.out.println("Withdraw"); 
		Withdraw();
		break;
		
		case 2: System.out.println("Deposit");
		Deposit();
		break;
		
		case 3: System.out.println("Check Balance");
		Check_Balance();
		break;
		
		case 4:System.out.println("Exit");
		}
		
		
	}




	private static void Check_Balance() {
		// TODO Auto-generated method stub
		
	}




	private static void Deposit() {
		// TODO Auto-generated method stub
		
	}




	private static void Withdraw() {
		// TODO Auto-generated method stub
		
	}

}
