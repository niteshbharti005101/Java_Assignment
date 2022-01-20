package com.bajaj.day2;

//POJO - plain old Java Object
//Model class

//hold the data of Person
class Person
{
	private String name;
	private int age;
	private int salary;
	private String address;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", salary=" + salary + ", address=" + address + "]";
	}
	public Person(String name, int age, int salary, String address) {
		super();
		this.name = name;
		this.age = age;
		this.salary = salary;
		this.address = address;
	}
	
	
}

public class MyMain {
	public static void main(String args[])
	{
		Person o1 = new Person("Nitesh",22,10000,"Bokaro");
		System.out.println(o1.toString());
		
		Person o2 = new Person("Mohit",20,5000,"Bokaro");
		System.out.println(o2.toString());
		
		Person o3 = new Person("Ravi",20,15000,"Pune");
		System.out.println(o3.toString());
		
		Person o4 = new Person("Rajesh",20,10000,"Delhi");
		System.out.println(o4.toString());
		
		Person o5 = new Person("Rohan",20,25000,"Bangalore");
		System.out.println(o5.toString());
	}

}
