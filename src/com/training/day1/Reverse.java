

//*********************************************************************** 
//	Program name : 			Reverse
//	Program Description :	To display reverse of each word of the entered 
//							string with no change in its position.
//***********************************************************************



package com.training.day1;
import java.util.*;
class Reverse
{
	public static void main(String[] aaa)
	{
		String s;
		String rev="";
		String temp=" ";
		Scanner ob=new Scanner(System.in);
		System.out.println("Enter String");
		s=ob.nextLine();
		
			for(int i=s.length()-1;i>=0;i--)
			rev=rev+s.charAt(i);
			String[] a=rev.split(" ");
			int j=a.length-1;
			
				while(j>=0)
				{
					temp=temp+a[j];

					temp=temp+" ";
					j--;

				}
				System.out.println(temp);
	}
}