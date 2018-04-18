package com.training.day1;


import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class StringPalindrome {

	public static void main(String args[])
	{
		
		
		String pattern;
		
		
		
		 Scanner s = new Scanner(System.in);
		    String[] wordlist = new String[10];
		
		    for(int i = 0; i < wordlist.length;i++)
		    {
		        System.out.println(i);
		        System.out.println("Enter The 10 words");
		        wordlist[i] = s.nextLine();
		    }
		    for(String names:wordlist)
		    {
		        System.out.println(names);
		    }
		
		pattern=s.next();//Input the pattern 
		
		StringBuilder inputreverse = new StringBuilder();
		 
        
		inputreverse.append(pattern);
 
        
		inputreverse = inputreverse.reverse();
        
       
		
        if(pattern.contentEquals(inputreverse))
        {
        	
        	System.out.println("Is a palindrome string");
        }
        else
        {
        	System.out.println("Not a palindrome string");
        }
		
        char[] ss=pattern.toCharArray();
      
        Arrays.sort(ss);
        
        System.out.println(ss);
	}
}



