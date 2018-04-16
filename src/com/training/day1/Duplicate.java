
//*********************************************************************** 
//	Program name : 			Duplicate
//	Program Description :	To display true if duplicate characters or digits 
//							occurs in entered string or integer.
//***********************************************************************




package com.training.day1;

import java.util.Scanner;

public class Duplicate
{
	 static Scanner s;
	        public static void main(String [] args) 
	        {
	            String n, a[];
	            int i,j,l,count=0;
	            System.out.println("Enter the word or integer : ");
	            s= new Scanner(System.in);
	            n=s.nextLine();
	            a=n.split("");
	            l = a.length;
	            
	            for(i=0; i<l; i++)
	            {
	                for(j=i+1; j<l; j++)
	                {
	                    if(a[i].equals(a[j])) 
	                    {
	                    	count++;
	                       
	                    }
	                }
	            }
	            
	            if(count>=1)
	            {
	            	System.out.println("True");
                
	            }
	            else
	            {
            	  System.out.println("False");
	            }
	       }
}

