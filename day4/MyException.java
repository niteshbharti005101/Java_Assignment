package com.bajaj.day4;

import java.io.*;
class CustomException extends Exception
{

	public CustomException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}
	
}

//class
//variable
//method
//exception

//try - which code has the error
//catch - handle the error
//multiple catch block
//throws - whenever you want to throw exception at method level
//throw - to throw new exception created by user
//Exception class - which is parent class to every class in java
//Exception have parent as throwable

//checked exception --10
//unchecked exception --10
public class MyException {
	
	public static void myMain() //throws Exception
	{
		String a[]=new String[10];
		try {
			MyException.main(a);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void main(String args[]) //throws Exception
	{
		//Exception - it is a special condition in java
		//which break the flow
		
		
		//not an error
		int a[]=new int[1];
		String str=null;
		if(str!=null)
		{
			if(str.equalsIgnoreCase("hello"));
		}
		//try Block
		try
		{
			if(a.length==1)
			{
			a[0]=1;
			
			File f1=new File("c/:");
			f1.getAbsoluteFile();
			
			FileInputStream i1 = new FileInputStream(f1);
			}
			else
			{
				throw new CustomException("The is no space in array to fill this element.");
			}
			System.out.println("A="+a[0]);
		}
		//catch Block
		catch(ArrayIndexOutOfBoundsException e)
		{
			e.printStackTrace();
			
//			System.out.println("A="+a[1]);
		}
		catch(CustomException e)
		{
			e.printStackTrace();
			
//			System.out.println("A="+a[1]);
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
			
//			System.out.println("A="+a[1]);
		}
		catch(Exception e)
		{
			e.printStackTrace();
			
//			System.out.println("A="+a[1]);
		}
		finally
		{
			System.out.println("This is a final block.It will be executed at last.");
		}
		
	}
}
