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


final class Person extends String
{
	final int a =10;
	final public void print()
	{
		a=20;
	}
}

class Employe extends Person
{
	@Override
	public void print()
	{
		
	}
}

public class MyFinal {

}
