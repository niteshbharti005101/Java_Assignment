package com.Bajaj2.JavaPrograms;

import java.util.*;
public class CheckLargestOfThree {
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.print("Please Enter 1st number: ");
		int a = sc.nextInt();
		System.out.print("Please Enter 2nd number: ");
		int b = sc.nextInt();
		System.out.print("Please Enter 3rd number: ");
		int c = sc.nextInt();
		if(a>b && a>c)
		{
			System.out.println(a+" is greatest among the three numbers.");
		}
		else if(b>a && b>c)
		{
			System.out.println(b+" is greatest among the three numbers.");
		}
		else if(c>a && c>b)
		{
			System.out.println(c+" is greatest among the three numbers.");
		}
		else if(a==b && b==c)
		{
			System.out.println("All three numbers are equal.");
		}
		else
		{
			System.out.println("Either of the two numbers are equal");
		}
		
	}
}
