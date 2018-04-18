package com.training.april17;

public class LambdaExp
{

		//Functional Interface
		interface CheckOdd{  
		public boolean isOdd(int number);  
		}  

		//Functional Interface
		interface CheckPrime{  
		public boolean isPrime(int number);  
		}  

		//Functional Interface
		interface CheckPalindrome{  
		public boolean isPalindrome(int number);  
		} 

		public static void main(String[] args) 
		{

		int no = 11;  

		//lambda expression to check if a number is even/odd.  
		CheckOdd check1 = (number)->{  
		if(no%2 == 0)
		return false;
		else return true;
		};  
		System.out.println("No is odd : "+check1.isOdd(no));  

		//lambda expression to check if a number is prime/not.
		CheckPrime prime1 = (number)->{  
		for(int i = 2; i <= no/2; i++)      
		{
		if(no%i == 0)
		return false;
		}
		return true;
		};
		System.out.println("No is prime : "+prime1.isPrime(no));

		//lambda expression to check if a number is palindrome.
		
		CheckPalindrome palindrome1 = (number)->{
			int remainder = 0,reverse = 0;
		while(no > 0)
		{
		remainder = number % 10;
		number = number / 10;
		reverse = reverse * 10 + remainder;
		}
		if(no == reverse) 
			return true;
		else 
			return false;
		
		};

		}
		

}
