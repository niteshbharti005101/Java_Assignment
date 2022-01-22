package com.bajaj.day5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Teacher //implements Comparable<Teacher>
{
	private int id;
	private String name;
	private float salary;
	@Override
	public String toString() {
		return "Teacher [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
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
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	public Teacher(int id, String name, float salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
//	@Override
//	public int compareTo(Teacher s) {
//		// TODO Auto-generated method stub
//		if(this.getSalary()>s.getSalary())
//			return 1;
//		else if(this.getSalary()<s.getSalary())
//			return -1;
//		else
//			return 0;
//		//return 0;
//	}
	
}
public class MyTeacher {
	
	public static void main(String args[])
	{
		List<Teacher> teach= new ArrayList<Teacher>();
		teach.add(new Teacher(1001,"Nitesh",20000));
		teach.add(new Teacher(1008,"Bharti",30000));
		teach.add(new Teacher(1005,"Ravi",10000));
		teach.add(new Teacher(1011,"Rajesh",15000));
		teach.add(new Teacher(1050,"Rohan",25000));
		teach.add(new Teacher(1044,"Rajeev",35000));
		
		Collections.sort(teach,new SortBySalary());
		for(Teacher t:teach)
		{
			System.out.println(t);
		}
	}

}
