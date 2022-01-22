package com.bajaj.day5;

import java.util.Scanner;

@FunctionalInterface
interface EvenOdd
{
	public void check();
}

@FunctionalInterface
interface Sign
{
	public void check();
}

@FunctionalInterface
interface Upper
{
	public void change();
}
public class LamdaTest {

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		
		//Check for Even Odd
		EvenOdd c = () -> {
			System.out.print("Please Enter an Integer: ");
			int n = sc.nextInt();
			if(n%2==0)
			System.out.println("The given number "+n+" is Even");
		else
			System.out.println("The given number "+n+" is Odd");
		};
		c.check();
		
		//Check for Positive Negative
		Sign c1= () -> {
			System.out.print("Please Enter an Integer: ");
			int n = sc.nextInt();
			if(n>0)
				System.out.println("Postive number");
			else if(n<0)
				System.out.println("Negative number");
			else
				System.out.println("Neither Positive nor negative");
		};
		c1.check();
		
		//Change the string in Upper Case
		Upper c2= () -> {
			System.out.print("Please Enter a String: ");
			String s = sc.next();
			System.out.println(s.toUpperCase());
		};
		c2.change();
		
		
	}
}
