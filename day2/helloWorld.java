package com.bajaj.day2;

//class - class is blueprint for object and divided into two part
//variable - which hold the value
//method - business logic and access to data members

//blueprint
//100

//object - real world(time) entity
//which has attribute and behaviour

//set the data
//constructor
//setter method - used to set values
//getter method - used to get or print the values

//Student data
//name
//age
//class
//subject
//school ABC School

//example
//mobile
//headphone
//mouse
//books
//keyboard


//extends - keyword
//used to extend the other class properties
//object -parent of every class in java

public class HelloWorld extends Object{
	
	//member variable - hold the data part
	private int a;
	private int b;
	private static String schoolName="ABC SChool";
	
	HelloWorld(int a,int b)
	{
		this.a=a;
		this.b=b;
	}
	
	public void setA(int a)
	{
		this.a=a;
	}
	public void setB(int b)
	{
		this.b=b;
	}
	
	//nonstatic - can have access to both static and non-static
	public void printValue()
	{
		System.out.println("Hello World");
		System.out.println(a);
		System.out.println(b);
		System.out.println(schoolName);
	}
	
	static 
	{
		System.out.println("Hello Java Static");
	}
		//method - which operates on given data
		//can have access to only static method
		public static void main(String args[])
		{
			
			//static method
			//can access with class name
			//HelloWorld.main(args);
			
			
			//creating the object
			HelloWorld h1=new HelloWorld(10,10);
			//accessing the method using class object
			h1.printValue();
			h1.schoolName="Java School";
			
			HelloWorld h2=new HelloWorld(1,1);
			h2.printValue();
			System.out.println(h1.schoolName);
			h1.printValue();
			
			System.out.println(h1.hashCode());
		}

}
