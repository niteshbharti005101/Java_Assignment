package com.bajaj.day4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

//Collection--collection is collection of class which help to create ,update , delete ,sort, insert 
//many type of data , int , string , long, object 

//Collections
//Comparable
//Comparator
class Employees implements Comparable<Employees>
{
	public Employees(int rollno, String name) {
		super();
		this.rollno = rollno;
		this.name = name;
	}
	
	
	int rollno;
	String name;
	
	//If 1st value greater return 1
	//If 1st value smaller return -1
	//If both are same return 0
	@Override
	public int compareTo(Employees e1) {
		// TODO Auto-generated method stub
		if(this.rollno>e1.getRollno())
		{
			return 1;
		}
		else if(this.rollno<e1.getRollno())
		{
			return -1;
		}
		else
		{
		return 0;
		}
	}
	@Override
	public String toString() {
		return "Employees [ID = " + rollno + ", Name = " + name + "]";
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
	
}
public class BankApplicationFinal {
	static Scanner sc = new Scanner(System.in);
	
//	public ArrayList<Employees> add(ArrayList<Employees> ls)
//	{
//		System.out.print("Enter the value for ID: ");
//		int id=sc.nextInt();
//		System.out.print("Enter the value for Name: ");
//		String name=sc.next();
//		ls.add(new Employees(id,name));
//		return ls;
//	}
//	public ArrayList<Employees> create(ArrayList<Employees> ls)
//	{
//		System.out.println("Ceating the employee details");
//		System.out.print("Please Enter the number of employees you want to add: ");
//		int no=sc.nextInt();
//		System.out.println("Please Enter the employee details one-by-one");
//		for(int i=0;i<no;i++)
//		{
//			add(ls);
//		}
//		return ls;
//	}
	public static void main(String args[])
	{
		List<Employees> ls=new ArrayList<Employees>();
		Scanner sc = new Scanner(System.in);
			
			while(true)
			{			
				System.out.println("\nSelect your choice");
				System.out.println("Enter 1 for Create");
				System.out.println("Enter 2 for Append");
				System.out.println("Enter 3 for Delete");
				System.out.println("Enter 4 for Update");
				System.out.println("Enter 5 for Search by name");
				System.out.println("Enter 6 for Sort ASC");
				System.out.println("Enter 7 for Sort DESC");
				System.out.println("Enter 8 for Exit");
				int choice = sc.nextInt();
				if(choice == 1)
				{
					create(ls);
					System.out.println("\nThe Employee details after creating are: ");
					display(ls);
				}
				else if(choice == 2)
				{
					add(ls);
					System.out.println("\nThe Employee details after adding are: ");
					display(ls);
				}
				else if(choice == 3)
				{
					delete(ls);
					System.out.println("\nThe Employee details after deleting are: ");
					display(ls);
				}
				else if(choice == 4)
				{
					update(ls);
					System.out.println("\nThe Employee details after updating are: ");
					display(ls);
				}
				else if(choice == 5)
				{
					search(ls);
				}
				else if(choice == 6)
				{
					Collections.sort(ls);
					System.out.println("\nThe Employee details after ascending sorting are: ");
					display(ls);
				}
				else if(choice == 7)
				{
					Collections.sort(ls,Collections.reverseOrder());
					System.out.println("\nThe Employee details after descending sorting are: ");
					display(ls);
				}
				else if(choice == 8)
				{
					System.out.println("Exiting the application");
					break;
				}
				else {
					System.out.println("Wrong Input Provided");
				}			
			}

	}
	private static void display(List<Employees> ls) {
		// TODO Auto-generated method stub
		for(Employees str:ls)
		{
			System.out.println(str.toString());
		}
	}
	private static void search(List<Employees> ls) {
		// TODO Auto-generated method stub
		System.out.println("The Employee details are");
		display(ls);
		System.out.println("Please Enter the name of the Employee which you want to search: ");
		String sname = sc.next();
		int temp=-1;
		for(Employees str:ls)
		{
			if(str.name.equalsIgnoreCase(sname)) 
			{ 
				System.out.println(str.name+" found having Employee ID "+str.rollno+"\n");
				temp=1;
				break;
			}
		}
		if(temp!=1)
		{
			System.out.print("Employee not found.\n");
		}
	}
	
	private static void update(List<Employees> ls) {
		// TODO Auto-generated method stub
			System.out.println("The Employee details are");
			display(ls);
			System.out.println("\nPlease Enter the ID for employee which you want to update: ");
			int id1 = sc.nextInt();
			int temp=0,index=0;
			for(Employees str:ls)
			{
				if(str.rollno==id1)
				{
					index=ls.indexOf(str);
					temp=1;
					System.out.println("\nEmployee ID matched");
					System.out.println("Please Select 1 if you wish to change Employee ID");
					System.out.println("Please Select 2 if you wish to change Employee name");
					System.out.println("Please Select 3 if you wish to change both Employee ID and Employee name");
					int ch=sc.nextInt();
					switch(ch)
					{
					case 1:
						System.out.print("Please Enter the new Employee ID: ");
						int empID=sc.nextInt();
						ls.set(index, new Employees(empID,str.name));
						break;
					case 2:
						System.out.print("Please Enter the new Employee name: ");
						String empname=sc.next();
						ls.set(index, new Employees(str.rollno,empname));
						break;
					case 3:
						System.out.print("Please Enter the new Employee ID: ");
						int empID1=sc.nextInt();
						System.out.print("Please Enter the new Employee name: ");
						String empname1=sc.next();
						ls.set(index, new Employees(empID1,empname1));
						break;
					default:
						System.out.print("Wrong choice Entered.\n");
						break;
					}
					break;
				}
			}
			if(temp!=1)
			{
				System.out.println("ID not found\n");
			}
	}
	private static void delete(List<Employees> ls) {
	// TODO Auto-generated method stub
		System.out.println("The Employee details are");
		display(ls);
		System.out.println("\nPlease Enter the ID for employee which you want to delete: ");
		int id1 = sc.nextInt();
		int temp=0,index=0;
		for(Employees str:ls)
		{
			if(str.rollno==id1)
			{
				index=ls.indexOf(str);
				temp=1;
				break;
			}
		}
		if(temp!=1)
		{
			System.out.println("ID not found\n");
		}
		else {
		ls.remove(index);
		}
	
}
	private static void add(List<Employees> ls) {
		// TODO Auto-generated method stub
		System.out.print("Enter the value for ID: ");
		int id=sc.nextInt();
		System.out.print("Enter the value for Name: ");
		String name=sc.next();
		ls.add(new Employees(id,name));
		
	}
	private static void create(List<Employees> ls) {
		// TODO Auto-generated method stub
		System.out.println("Ceating the employee details");
		System.out.print("Please Enter the number of employees you want to add: ");
		int no=sc.nextInt();
		System.out.println("Please Enter the employee details one-by-one");
		for(int i=0;i<no;i++)
		{
			add(ls);
		}
		
	}
	}
