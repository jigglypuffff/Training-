package com.training.april17;

import java.util.Scanner;

public class RearrangeString 
{
	
	public static void main(String args[]) 
	{
		char temp;
		String str="";
		System.out.println("Enter a string:");
		Scanner sc=new Scanner(System.in);
		String input=sc.next();
		char [] arr=input.toCharArray();
		int count=0;
		int length=input.length();
		
		for(int i=0;i<length-1;i++)
		{
			if(arr[i]!=arr[i+1])
			{
				System.out.println(input);	
			}
		}
		
		for(int i=1;i<length-1;i++)
		{
			if(arr[i]==arr[i+1])
			{
				count++;
				continue;
			}
			else {
				temp=arr[i];
				arr[i]=arr[i+1];
				arr[i+1]=temp;
				str=String.valueOf(arr);
			}
		}
		try {
			if(count!=3)
			{
				for(int j=0;j<length-1;j++)
				{
					if(str.charAt(j)==str.charAt(j+1))
					{
						System.out.println("null");
						break;
					}
					else
					{
						System.out.println("output:"+str);
						break;
					}
				}
			}
			else 
				{
					System.out.println(str);
				}
		}
		catch (StringIndexOutOfBoundsException e) 
		{
			System.out.println("null");
			sc.close();
		}
		
	}

}


