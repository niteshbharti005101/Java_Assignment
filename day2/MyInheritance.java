package com.bajaj.day2;

//extends - inherits the property of base class to derived class
//extending the properties of another class
//variable
//method

//1 rule - we always have two or more classes to be inherited

//Single level inheritance
class A
{
	//method
	//method overloading
	// we can have any number of method with same name but different parameters
	
	int a;
	//one
	A(int a)
	{
		this.a=a;
	}
	//two
	A()
	{
		
	}
	//three
	A(int a,int b)
	{
		
	}
	public A(int i, int j, int k) {
		// TODO Auto-generated constructor stub
	}
	public void printA() {
		System.out.println("A class");
	}
}

//extends
//class name
class B extends A
{
	B(int a)
	{
		//super is keyword
		// it is used to send back the value to parent class
		// calling the parent call constructor
		
		//calling the constructor of A class
		super(a);
		System.out.println("A  ");
		System.out.println("b  ");
		System.out.println("c ");
		
	}
	public void printB()
	{
		System.out.println("B class "+a);
	}
}
public class MyInheritance {
	
	public static void main(String args[])
	{
		B obj = new B(200);
		System.out.println(obj.a);
		//extending the method
		obj.printB();
		obj.printA();
	}

}
