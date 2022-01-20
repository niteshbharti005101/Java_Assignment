package com.bajaj.helloworld;

//Keyword
//Classes
//Scanner - used to take input from user(Keyboard)

//import - used to import already written into own application
import java.util.Scanner;

//Condition is add only positive number
//1
//-1
//10

public class MyIfElse {
	public static void main(String args[]) {
		//read the input from user starts
		System.out.println("Enter a number: ");
		Scanner sc = new Scanner(System.in);
		
		//take input and store in variable
		int number = sc.nextInt();
		
		//one word input
		String str1 = sc.next();
		sc.nextFloat();
		sc.nextBoolean();
		sc.nextByte();
		sc.nextDouble();
		//one line input
		sc.nextLine();
		
		
		//add logic starts here
		//it check for given logic
		//expression : true : false
		//MyBlock
		//My{
			//block
		//}
		if(number>0)
		{
			//true
			System.out.println("Number is positive");
		}
		else {
			//false
			System.out.println("Number is not positive");
		}
		
		//true
		System.out.println("End of program");
		
		//add logic ends here
		
	}

}
