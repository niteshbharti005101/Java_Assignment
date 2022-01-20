package com.Bajaj2.JavaPrograms;

import java.util.*;
public class SwapTwoNums {
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.print("Please Enter 1st number: ");
		int a = sc.nextInt();
		System.out.print("Please Enter 2nd number: ");
		int b = sc.nextInt();
		System.out.println("The numbers before swapping are A="+a+" and B="+b);
		int c = a;
		a=b;
		b=c;
		System.out.print("The numbers after swapping are A="+a+" and 20B="+b);
		
	}
}
