package com.Bajaj2.JavaPrograms;

import java.util.*;
public class FindAscii {
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.print("Please Enter the Character: ");
		char ch = sc.next().charAt(0);
		int c=(int)ch;
		System.out.print("The Ascii value for "+ch+" is: "+c);
		
	}

}
