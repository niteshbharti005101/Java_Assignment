package com.bajaj.day4;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Stack;
import java.util.Vector;

//Collection - it is a collection of class which help to create, update, delete, sort, insert, 
// may type of data, int, string, long, object

//Collections
//Comparable
//Comparator
public class MyCollection {
	public static void main(String args[])
	{
		// Parent // giving the reference of child class of implementations
		// Array - add, delete, append, create
		//creating the arraylist
		List ls = new ArrayList();
		//add
		ls.add("Nitesh");
		ls.add(1);
		ls.add(10.2f);
		
		List<String> ls1 = new ArrayList<String>();
		ls1.add("Nitesh");
		ls1.add("Mahesh");
		ls1.add("Priya");
		ls1.add("Ansar");
		
		
		//display
		System.out.println(ls);
		System.out.println(ls1);
		
		//remove
		ls1.remove("GHI");
		System.out.println(ls1);
		
		//contain
		if(ls.contains("Nitesh"))
		{
			System.out.println("Found");
		}
//		System.out.println(ls1.get(2));
//		System.out.println(ls1.isEmpty());
//		System.out.println(ls1.size());
//		ls1.clear();
//		System.out.println(ls1.size());
		
		Collections.sort(ls1);
		System.out.println(ls1);
		
		Collections.sort(ls1,Collections.reverseOrder());
		System.out.println(ls1);
		
		for(String str:ls1)
		{
			System.out.println(str);
		}
		
		
		
		
		//Linked List
		List<String> ls2 = new LinkedList<String>();
		ls2.add("Nitesh");
		ls2.add("Mahesh");
		ls2.add("Priya");
		ls2.add("Ansar");
		System.out.println(ls2);
		
		//Stack
		List<String> ls3 = new Stack<String>();
		ls3.add("Nitesh");
		ls3.add("Mahesh");
		ls3.add("Priya");
		ls3.add("Ansar");
		System.out.println(ls3);
		
		
		//Vector
		List<String> ls4 = new Vector<String>();
		ls4.add("Nitesh");
		ls4.add("Mahesh");
		ls4.add("Priya");
		ls4.add("Ansar");
		System.out.println(ls4);
		
		
	}
}
