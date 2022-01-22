package com.bajaj.day5;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

//List - maintain the insertion order
//List - can contain duplicate values
//Set always have unique values
//HashSet  - does not maintain the insertion order
//Linked Hash set - maintain the insertion order
//TreeSet -- which will insert and sort the data(Data is stored in sorted order)

//Take three type
//Integer
//Double

public class MySet {
	
	public static void main(String args[])
	{
		Set<Student> st = new HashSet<Student>();
		st.add(new Student(3,"Pooja",2000));
		st.add(new Student(1,"Kamesh",1000));
		st.add(new Student(5,"Priya",2000));
		st.add(new Student(100,"Jiya",100));
		st.add(new Student(10,"Sam",20000));
		st.add(new Student(50,"Ayush",500));
		for(Student s:st)
		{
			System.out.println(s);
		}
		System.out.println();
		
		
		//Linked Hash set
		Set<Student> st1 = new LinkedHashSet<Student>();
		st1.add(new Student(3,"Pooja",2000));
		st1.add(new Student(1,"Kamesh",1000));
		st1.add(new Student(5,"Priya",2000));
		st1.add(new Student(100,"Jiya",100));
		st1.add(new Student(10,"Sam",20000));
		st1.add(new Student(50,"Ayush",500));
		for(Student s:st1)
		{
			System.out.println(s);
		}
		System.out.println();
		
		
		//Tree set
		Set<String> st2 = new TreeSet<String>();
		st2.add("Pooja");
		st2.add("Kamesh");
		st2.add("Priya");
		st2.add("Jiya");
		st2.add("Sam");
		st2.add("Ayush");
		st2.add("Sam"); //Duplicate values not possible(It will override the previous value)
		
		//Java 1.8 feature
		st2.forEach(
				(str)->System.out.println(str));
		System.out.println();
//		
//		for(String s:st2)
//		{
//			System.out.println(s);
//		}
		
		//For Integer values
		Set<Integer> st3 = new TreeSet<Integer>();
		st3.add(10);
		st3.add(250);
		st3.add(30);
		st3.add(99);
		st3.add(65);
		st3.add(82);
		st3.add(150); 
		
		//Java 1.8 feature
		st3.forEach(
				(str)->System.out.println(str));
		System.out.println();
		System.out.println();
		
		
		//For Double values
		Set<Double> st4 = new TreeSet<Double>();
		st4.add(1.101);
		st4.add(2.50);
		st4.add(3.120);
		st4.add(9.9999);
		st4.add(6.435);
		st4.add(8.542);
		st4.add(15.97402); 
		
		//Java 1.8 feature
		st4.forEach(
				(str)->System.out.println(str));
	}

}
