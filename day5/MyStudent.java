package com.bajaj.day5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Student implements Comparable<Student>
{
	//three sort
	//id
	private int id;
	//name
	private String name;
	//fees
	private int fees;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getFees() {
		return fees;
	}
	public void setFees(int fees) {
		this.fees = fees;
	}
	public Student(int id, String name, int fees) {
		super();
		this.id = id;
		this.name = name;
		this.fees = fees;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", fees=" + fees + "]";
	}
//	@Override
//	public int compareTo(Student s) {
//		// TODO Auto-generated method stub
//		
//		//return this.getName().compareTo(s.getName());
//		
////		if(this.getFees()>s.getFees())
////			return 1;
////		else if(this.getFees()<s.getFees())
////			return -1;
////		else
////			return 0;
//		
//		if(this.getId()>s.getId())
//			return 1;
//		else if(this.getId()<s.getId())
//			return -1;
//		else
//			return 0;
//		
//	}
	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		return this.getName().compareTo(o.getName());
	}
	
	
}
public class MyStudent {
	
	public static void main(String args[])
	{
		List<Student> st=new ArrayList<Student>();
		st.add(new Student(3,"Pooja",2000));
		st.add(new Student(1,"Kamesh",1000));
		st.add(new Student(5,"Priya",2000));
		st.add(new Student(100,"Jiya",100));
		st.add(new Student(10,"Sam",20000));
		st.add(new Student(50,"Ayush",500));
		st.add(new Student(50,"Ayush",500)); //Duplicate values are allowed
		//System.out.println(students);
		for(Student s:st)
		{
			System.out.println(s);
		}
		System.out.println();
		//call the Collections.sort method
		//pass the students list to sort method
		//implement the comparable interface
		//pass the key for sorting
		//E1>E2 == 1
		//E1<E2 == -1
		//E1==E2 == 0
		//Collections.sort(st,Collections.reverseOrder());
		Collections.sort(st, new SortByFees());
		for(Student s:st)
		{
			System.out.println(s);
		}
	}

}
