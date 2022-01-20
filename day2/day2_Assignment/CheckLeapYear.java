package com.Bajaj2.JavaPrograms;

import java.util.*;
public class CheckLeapYear {
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.print("Please Enter an year: ");
		int a = sc.nextInt();
		if(a%400==0)
		{
			System.out.println(a+" is a leap year.");
		}
		else if(a%100==0)
		{
			System.out.println(a+" is not a leap year.");
		}
		else if(a%4==0)
		{
			System.out.println(a+" is a leap year.");
		}
		else
		{
			System.out.println(a+" is not a leap year.");
		}
		
	}
}
