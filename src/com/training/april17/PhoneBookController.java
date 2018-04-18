package com.training.april17;

import java.util.ArrayList;
import java.util.Scanner;

public class PhoneBookController {

	public static void display()
	{
		System.out.println("Enter The Choice");
		System.out.println("============================");
		System.out.println("1-Add a user");
		System.out.println("2-View all users");
		System.out.println("3-View user by number");
		System.out.println("4-Delete a user");
		System.out.println("5-Exit");
		System.out.println("============================");

	}

	public static void main(String args[])
	{
		ArrayList<Person> p = new ArrayList<Person>();
		
		Scanner sc = new Scanner(System.in);
		
		while(true)
		{
			display();
			int choice =sc.nextInt();
		switch(choice)
		{
		case 1:
			Person phonebook=new Person();
		System.out.println("Enter The FirstName Of The Person");
	    String username=sc.next();
		phonebook.setFirstName(username);
		//System.out.println(phonebook.getName());
		System.out.println("Enter The LastName Of The Person");
	    String lastname=	sc.next();
	    phonebook.setLastName(lastname);
	    System.out.println("Enter The Mobile Number Of The Person");
	    String phonenumber=sc.next();
	    phonebook.setPhoneNumber(phonenumber);
	    System.out.println("Congratulations You Just Entered Details: " + phonebook.getFirstName()+" "+phonebook.getLastName()+" "+" has the number: "+phonebook.getPhoneNumber());
	    System.out.println("===============================================================");
	    p.add(phonebook);
	    
	    System.out.println(p.size());
	     break;
	    
		case 2:
			
			for(Person entity:p)
			{
				System.out.println(entity);
				System.out.println("User First Name"+ " "+entity.getFirstName());
				System.out.println("User Last Name"+" " +entity.getLastName());
				System.out.println("User Mobile Number"+" "+entity.getPhoneNumber());
			}
			
			break;
		case 3:
			System.out.println("Enter The Number Of The User:");
	    	String finduser=sc.next();
	    	int count=0;
	
	    	for(Person entity:p)
			{
				if(entity.getPhoneNumber().equalsIgnoreCase(finduser))
					{count=1;
					}
			}
	    	if (count!=0)
	    	{
				System.out.println("User Found");
	    	}
	    	else
	    	{
	    		System.out.println("No user found");
	    	}
			break;
		
		case 4:
			System.exit(0);
			break;
			}
		}
	}
}
		
		
		
	
