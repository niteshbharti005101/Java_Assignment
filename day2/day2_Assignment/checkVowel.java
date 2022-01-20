package com.Bajaj2.JavaPrograms;

import java.util.*;
public class checkVowel {
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.print("Please Enter a Character: ");
		char ch = sc.next().charAt(0);
		switch(ch)
		{
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
			System.out.println("The entered character "+ch+" is vowel.");
			break;
		default:
			System.out.println("The entered character "+ch+" is consonent.");
		}
		
	}
}
