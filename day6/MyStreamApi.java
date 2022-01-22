package com.bajaj.day6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Student1
{
	private int rollno;
	private String name;
	private int fees;
	@Override
	public String toString() {
		return "Student1 [rollno=" + rollno + ", name=" + name + ", fees=" + fees + "]";
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
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
	public Student1(int rollno, String name, int fees) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.fees = fees;
	}
	
	
}

//StreamAPI id class in java which is used to filter and map the data
//1,2,3,4,5,6,7,8,9
public class MyStreamApi {
	public static void main(String args[])
	{
		
		List<Student1> ls =  new ArrayList<Student1>();
		
		ls.add(new Student1(1,"Ansar",2000));
		ls.add(new Student1(200,"Pooja",1000));
		ls.add(new Student1(2,"Priya",500));
		
		List<Student1> ls1 = ls.stream()
		.filter(student->student.getFees()>500)
		.collect(Collectors.toList());
		
		
		ls1.forEach(s->System.out.println(s));
		
		
		List<String> ls2 = ls.stream()
		.filter(student->student.getFees()>500)
		.map(s->s.getName())
		.collect(Collectors.toList());
				
				
		ls2.forEach(s->System.out.println(s));
		
		List<Integer> ls3 = ls.stream()
		.filter(student->student.getFees()>500)
		.map(s->s.getRollno())
	    .collect(Collectors.toList());
				
				
		ls3.forEach(s->System.out.println(s));
		
		
		List<String> ls4 = ls.stream()
		.filter(student->student.getName().startsWith("A"))
	    .map(s->s.getName())
		.collect(Collectors.toList());
						
						
		ls4.forEach(s->System.out.println(s));
		//Stream is created with null or empty list
		//data
		//from source to destination
//		Stream<String> st = Stream.empty();
//		
//		Collection<String> col = Arrays.asList("a","b","c");
//		
////		for(String str:col)
////		{
////			System.out.println(str);
////		}
//		//col.forEach(str->System.out.println(str));
//		
//		Stream<String> stOfCol = col.stream();
//		stOfCol.forEach(s->System.out.println(s));
//		
//		//Integer Stream
//		Collection<Integer> col1 = Arrays.asList(1000,200,5000,200);
//		
////		for(String str:col)
////		{
////			System.out.println(str);
////		}
//		//col.forEach(str->System.out.println(str));
//		
//		Stream<Integer> stOfCol1 = col1.stream();
//		stOfCol1
//		.filter(s->s==200)        			//filter the data
//		.forEach(s->System.out.println(s)); //printing the value
//		
//		stOfCol1 = col1.stream();
//		Long count = stOfCol1
//		.filter(s->s==200)        			//filter the data
//		.count();
//		//.forEach(s->System.out.println(s)); //printing the value
//		System.out.println(count);
//		
//		
//		stOfCol1 = col1.stream();
//		Collection<Integer> coll = stOfCol1
//		.filter(s->s==200)        			//filter the data
//		.collect(Collectors.toList());
//		//.forEach(s->System.out.println(s)); //printing the value
//		coll.forEach(str->System.out.println(str));
	}

}

