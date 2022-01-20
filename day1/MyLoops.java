package com.bajaj.helloworld;

//for
//while
//do while
//Array - Start with zero
public class MyLoops {
	public static void main(String args[]) {
		//for block
		//keyword - used for for loop
		//start value
		//condition
		//increment or decrement
		
		//entry control loop
		for(int i=0;i<=10;i++)
		{
			System.out.println(i);
		}
		
		//entry control loop
		int i = 0; //start value
		while(i<=10) //condition
		{
			System.out.println(i);
			i=i+1; //increment
		}
		
		//exit control loop
		int j = 0;
		do
		{
			System.out.println(j);
			j=j+1;
		}
		while(j<=10);
	}
}
