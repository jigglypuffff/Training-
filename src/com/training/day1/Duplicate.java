
//*********************************************************************** 
//	Program name : 			Duplicate
//	Program Description :	To display true if duplicate characters or digits 
//			        occurs in entered string or integer.
//***********************************************************************


package com.training.day1;

import java.util.Scanner;

public class Duplicate 
{
	 static Scanner s;
	        public static void main(final String [] args) 
	        {
	            String n, a[];
	            
		    
		    int l;
		    int count=0;
	            System.out.println("Enter the word or integer : ");
	            s= new Scanner(System.in);
	            n=s.nextLine();
	            a=n.split("");
	            l = a.length;
	            
	     
	            for(int i=0; i<l; i++)
	            {
	                for(int j=i+1; j<l; j++)
	                {
	                    if(a[i].equals(a[j])) 
	                    {
	                    	count++;
	                       
	                    }
	                }
	            }
	            
	            if(count>=1)
	            {
	            	System.out.println("True");   // Duplicate digits or characters found
	            }
	            else
	            {
            		  System.out.println("False");    // No Duplicate digits or characters found
	            }
	       }
}

