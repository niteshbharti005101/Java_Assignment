package com.bajaj.day3;

//why objects cannot
//no direct access
//small component
//raw component

//abstract method
//which do not have body

//mobile - camera, processor
//interface

//milk
//abstract class

//Abstraction - to provide the abstraction
//Interface
//abstract class

class camera
{
	public void printCamera() {
		System.out.println("5 MP");
		}
}
//every method in the interface is abstract method
interface processor
{
	public void printProcessor();
}

//multiple inheritance is not supported by java
class Mobile extends camera implements processor
{
	//use child function
	@Override
	public void printProcessor() {
		System.out.println("A5 Chips");
		//TODO Auto-generated method stub
	}
	
}

public class MY_Inheritance2 {

}
