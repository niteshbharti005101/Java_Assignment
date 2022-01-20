package com.Bajaj2.JavaPrograms;

import java.util.*;
public class AddTwoIntegers {
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.print("Please Enter 1st Integer: ");
		int a = sc.nextInt();
		System.out.print("Please Enter 2nd Integer: ");
		int b = sc.nextInt();
		int c = a+b;
		System.out.print("The sum of the two numbers is: "+c);
		
	}

}
