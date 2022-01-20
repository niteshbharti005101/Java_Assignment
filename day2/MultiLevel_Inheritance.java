package com.bajaj.day2;

//extends - inherits the property of base class to derived class
//extending the properties of another class
//variable
//method

//1 rule - we always have two or more classes to be inherited

//Multi level inheritance
class A1
{
	//method
	//method overloading
	// we can have any number of method with same name but different parameters
	
	int a;
	//one
	A1(int a)
	{
		this.a=a;
	}
	//two
	A1()
	{
		
	}
	//three
	A1(int a,int b)
	{
		
	}
	public A1(int i, int j, int k) {
		// TODO Auto-generated constructor stub
	}
	public void printA() {
		System.out.println("A class");
	}
}

//extends
//class name
class B1 extends A1
{
	B1(int a)
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
class C extends B1{
	
	C(int a)
	{
		super(a);
	}
	public void printC()
	{
		System.out.println("C class "+a);
	}

}

public class MultiLevel_Inheritance {
	public static void main(String args[])
	{
		C obj = new C(200);
		System.out.println(obj.a);
		//extending the method
		obj.printC();
		obj.printB();
		obj.printA();
	}
}
