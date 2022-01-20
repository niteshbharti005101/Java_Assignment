package com.bajaj.day2;


//extends - inherits the property of base class to derived class
//extending the properties of another class
//variable
//method

//1 rule - we always have two or more classes to be inherited

//Single level inheritance
class A2
{
	//method
	//method overloading
	// we can have any number of method with same name but different parameters
	
	int a;
	//one
	A2(int a)
	{
		this.a=a;
	}
	//two
	A2()
	{
		
	}
	//three
	A2(int a,int b)
	{
		
	}
	public A2(int i, int j, int k) {
		// TODO Auto-generated constructor stub
	}
	public void printA() {
		System.out.println("A class");
	}
}

//extends
//class name
class B2 extends A2
{
	B2(int a)
	{
		//super is keyword
		// it is used to send back the value to parent class
		// calling the parent call constructor
		
		//calling the constructor of A class
		super(a);
		System.out.println("Inside B constructor ");
		
	}
	public void printB()
	{
		System.out.println("B class "+a);
	}
}

//extends
//class name
class C2 extends A2
{
	C2(int a)
	{
		//super is keyword
		// it is used to send back the value to parent class
		// calling the parent call constructor
		
		//calling the constructor of A class
		super(a);
		System.out.println("Inside C constructor ");
		
	}
	public void printC()
	{
		System.out.println("C class "+a);
	}
}



public class Hierarchical_Inheritance {
	public static void main(String args[])
	{
		//Object B
		B2 obj = new B2(200);
		System.out.println(obj.a);
		//extending the method
		obj.printB();
		obj.printA();
		System.out.println();
		//Object C
		C2 obj1 = new C2(100);
		System.out.println(obj1.a);
		//extending the method
		obj1.printC();
		obj1.printA();
	}

}
