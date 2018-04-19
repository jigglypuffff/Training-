

//*********************************************************************** 
//	Program name : 			Reverse
//	Program Description :	To display reverse of each word of the entered 
//							string with no change in its position.
//***********************************************************************



package com.training.day1;
import java.util.*;
class Reverse
{
	public static void main(final String[] args)
	{
		String str;
		String rev="";
		String temp=" ";
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter String");
		str=obj.nextLine();
		
			for(int i=str.length()-1;i>=0;i--)
			rev=rev+str.charAt(i);
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
