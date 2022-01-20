package com.bajaj.day3;

//inheritance
//final - is keyword
//which make the class, variable, method as final

//final class - class cannot be extended
//final variable - value cannot be changed
//final method - cannot be override the method

//create, update, delete, insert

//CRUD - create read update and delete

//@Override 
//pre-condition -> Class should extends by another class
//both child and parent class should have same method

//Overloading

class Persons
{
	int a =10;
	public void print()
	{
		System.out.println("Class Person");
	}
	public void print(int a,int b)
	{
		System.out.println("Class Person");
	}
	public void print(int a)
	{
		System.out.println("Class Person");
	}
}

class Employee extends Persons
{
	@Override
	public void print()
	{
		//super.print();
		System.out.println("Class Employee");
	}
}

public class MyFInal1 {
	
	public static void main(String args[])
	{
		//object reference at run time
		Persons e1=new Employee();
		e1.print();
		e1.print(10);
		e1.print(10, 20);
	}

}
