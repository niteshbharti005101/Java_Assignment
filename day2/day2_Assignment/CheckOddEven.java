package com.Bajaj2.JavaPrograms;

import java.util.*;
public class CheckOddEven {
	public void check(int n) {
		if(n%2==0)
		{
			System.out.println("The number "+n+" is Even.");
		}
		else
		{
			System.out.println("The number "+n+" is Odd.");
		}
	}
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.print("Please Enter a number: ");
		int a = sc.nextInt();
		CheckOddEven obj = new CheckOddEven();
		obj.check(a);
		
	}
}
