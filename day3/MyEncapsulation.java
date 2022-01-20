package com.bajaj.day3;

//I have private variable
//Those variable should be access by class only

//Employee
//Laptop - private userId and private password
//Employee

class Employee1
{
	//Do not share your private details to anyone
	//private
	private String username;
	private int password;
	
	//different user can login
	//IT
	//Employee
	//Manager
	//Method should be public
	public void login(String username, int password)
	{
		System.out.println("Working on System!!");
	}
}
public class MyEncapsulation {
	public static void main(String args[])
	{
		Employee1 e1=new Employee1();
		e1.login("root",12345);
	}

}
