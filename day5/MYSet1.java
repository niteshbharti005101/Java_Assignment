package com.bajaj.day5;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class MYSet1 {
	public static void main(String args[])
	{
		//Sort using comparable
		//For Complex datatypes, it's mandatory to provide sorting algorithm for TreeSet
		Set<Student> st = new TreeSet<Student>();
		st.add(new Student(3,"Pooja",2000));
		st.add(new Student(1,"Kamesh",1000));
		st.add(new Student(5,"Priya",2000));
		st.add(new Student(100,"Jiya",100));
		st.add(new Student(10,"Sam",20000));
		st.add(new Student(50,"Ayush",500));
		//st.add(new Student(50,"Ayush",500)); //Duplicate values are allowed
		//System.out.println(students);
		for(Student s:st)
		{
			System.out.println(s);
		}
		System.out.println();
		
		//Sort using comparator
		Set<Student> st1 = new TreeSet<Student>(new SortById());
		st1.add(new Student(3,"Pooja",2000));
		st1.add(new Student(1,"Kamesh",1000));
		st1.add(new Student(5,"Priya",2000));
		st1.add(new Student(100,"Jiya",100));
		st1.add(new Student(10,"Sam",20000));
		st1.add(new Student(50,"Ayush",500));
		//st.add(new Student(50,"Ayush",500)); //Duplicate values are allowed
		//System.out.println(students);
		for(Student s:st1)
		{
			System.out.println(s);
		}
		System.out.println();
	}
	
}
