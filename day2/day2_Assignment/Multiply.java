package com.Bajaj2.JavaPrograms;

import java.util.*;
public class Multiply {
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.print("Please Enter 1st number: ");
		float a = sc.nextFloat();
		System.out.print("Please Enter 2nd number: ");
		float b = sc.nextFloat();
		float c = a*b;
		System.out.print("The product of two numbers is: "+c);
		
	}
}
