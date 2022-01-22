package com.bajaj.day5;

//Object Oriented language
//Java 1.8 force us to do functional programming

class Calc
{
	int a;
	int b;
	
	public void sum(int a,int b)
	{
		int c=a+b;
		System.out.println(c);
	}
	
	public void subtraction(int a, int b)
	{
		int c=a-b;
		System.out.println(c);
	}
	public void multiplication(int a, int b)
	{
		int c=a*b;
		System.out.println(c);
	}
}

interface FunctionType
{
	public void execute();
}
@FunctionalInterface
interface FindLengthType
{
	public int abc(String s);
}
public class MyLamda {
	
	public static void main(String args[])
	{
		//value to variable
		int a=10;
		System.out.println(a);
		
		//we are going to the function behaviour of code)
//		int code=public void sum(int a,int b)
//		{
//			int c=a+b;
//			System.out.println(c);
//		}
		//code.execute(10,20);
		
		
		//we are going to the function behaviour of code)
		FunctionType code= () -> System.out.println("Hello World");
		
		//No need for Access Specifier
		//No need to give return type
		//No need to give method or function name
		//Single line no need for opening and closing braces
		//Put lambda symbol after the parameter
		
		code.execute();
		
		
//		Calc c= new Calc();
//		c.sum(10,20);
//		c.subtraction(20, 10);
		
		
		//Find the length of string
		//Hello
		
		//FindLengthType findtype = (String str) -> str.length();
		FindLengthType findtype = str -> str.length();
		
		//No need for return type also
		//For single parameters, no need for braces also
		System.out.println(findtype.abc("Nitesh"));
	}
}
