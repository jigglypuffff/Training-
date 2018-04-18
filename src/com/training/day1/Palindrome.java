

//********************************************************************************* 
//	Program name : 			Palindrome
//	Program Description :	To display if the entered integer is palindrome or not.
//*********************************************************************************




package com.training.day1;


import java.io.IOException;
import java.util.*;

public class Palindrome
{
   //function to check number is Palindrome or not
   public static boolean isPalindrome(int num)
   {
       int sum,tNum;
       //find reverse number
       tNum=num;
       sum =0;
       while(tNum>0)
       {
           sum = (sum*10) + (tNum%10);
           tNum/=10;
       }
        
       if(num==sum)
           return true;
       else
           return false;
   }
    
   public static void main(String args[]) throws IOException, InputMismatchException
   {
       int num;
        
       Scanner bf=new Scanner(System.in);
        
       //input an integer number
       System.out.print("Enter any integer number: ");
       num= bf.nextInt();
             try {
            	  if(isPalindrome(num))
            		  System.out.println(num + " is a Palindrome Number.");
            	  else
            		  System.out.println(num + " is not a Palindrome Number.");
            
 }
             catch(Exception e)
             {
            	 System.out.println("Enter only positive and negative integers.");
             }
}
}
