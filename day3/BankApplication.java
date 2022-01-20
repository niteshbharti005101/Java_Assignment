package com.bajaj.day3;

import java.util.Scanner;
//CLI base Application
//Menu base
class Employees
{
	private int employeeID;
	private String name;
	public int getEmployeeID() {
		return employeeID;
	}
	public void setEmployeeID(int employeeID) {
		this.employeeID = employeeID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Employees(int employeeID, String name) {
		super();
		this.employeeID = employeeID;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Employees [employeeID=" + employeeID + ", name=" + name + "]";
	}
	
}


public class BankApplication {
	public static void main(String args[])
	{
		//Array
//		int a=10;
//		int b=20;
		
		//Employees value[]=new Employees[10];
		Scanner sc = new Scanner(System.in);
//		for(int i=0;i<=1;i++)
//		{
//			System.out.print("Enter the value for ID: ");
//			int id=sc.nextInt();
//			System.out.print("Enter the value for Name: ");
//			String name=sc.next();
//			
//			Employees e1 = new Employees(id,name);
//			value[i]=e1;
//		}
//		for(int i=0;i<=1;i++)
//		{
//			System.out.println("Value on location: "+value[i].toString());
//		}
		int no=0;
		Employees value[]=new Employees[no];
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
				System.out.println("Ceating the employee details");
				System.out.print("Please Enter the number of employees you want to add: ");
				no=sc.nextInt();
				value=new Employees[no];
				System.out.println("Please Enter the employee details one-by-one");
				for(int i=0;i<no;i++)
				{
					System.out.print("Enter the value for ID: ");
					int id=sc.nextInt();
					System.out.print("Enter the value for Name: ");
					String name=sc.next();
					
					Employees e1 = new Employees(id,name);
					value[i]=e1;
				}
				System.out.println();
				System.out.println("The Employee details are");
				for(int i=0;i<no;i++)
				{
					System.out.println("Value on location: "+value[i].toString());
				}
				
			}
			else if(choice==2)
			{
				System.out.println("Appending a new employee details");
				System.out.print("Enter the value for ID: ");
				int id=sc.nextInt();
				System.out.print("Enter the value for Name: ");
				String name=sc.next();
				
				Employees value1[]=new Employees[value.length+1];
				for(int i=0;i<value.length;i++)
				{
					value1[i]=value[i];
				}
				Employees e1 = new Employees(id,name);
				value1[value.length]=e1;
				
				//Updating the old one
				//value=value1;
				value=new Employees[value.length+1];
				for(int i=0;i<=value.length-1;i++)
				{
					value[i]=value1[i];
				}
				System.out.println("The updated Employee details are");
				for(int i=0;i<value.length;i++)
				{
					System.out.println("Value on location: "+value[i].toString());
				}
				
			}
			else if(choice==3)
			{
				System.out.println("The Employee details are");
				for(int i=0;i<value.length;i++)
				{
					System.out.println("Value on location: "+value[i].toString());
				}
				System.out.println("Please Enter the ID for employee which you want to delete: ");
				int id1=sc.nextInt();
				int ch=0;
				Employees value1[]=new Employees[value.length-1];
				for(int i=0;i<value.length;i++)
				{
					if(value[i].getEmployeeID()!=id1)
					{
						value1[ch]=value[i];
						ch+=1;
					}
				}
				value=value1;
				System.out.println("The updated Employee details after deletion are");
				for(int i=0;i<value.length;i++)
				{
					System.out.println("Value on location: "+value[i].toString());
				}
			}
			else if(choice==4)
			{
				System.out.println("The Employee details are");
				for(int i=0;i<value.length;i++)
				{
					System.out.println("Value on location: "+value[i].toString());
				}
				System.out.println("Please Enter the ID for employee which you want to update: ");
				int id1=sc.nextInt();
				int ch,temp=-1;
				for(int i=0;i<value.length;i++)
				{
					if(value[i].getEmployeeID()==id1)
					{
						temp=1;
						System.out.println("\nEmployee ID matched");
						System.out.println("Please Select 1 if you wish to change Employee ID");
						System.out.println("Please Select 2 if you wish to change Employee name");
						System.out.println("Please Select 3 if you wish to change both Employee ID and Employee name");
						ch=sc.nextInt();
						switch(ch)
						{
						case 1:
							System.out.print("Please Enter the new Employee ID: ");
							int empID=sc.nextInt();
							value[i].setEmployeeID(empID);
							break;
						case 2:
							System.out.print("Please Enter the new Employee name: ");
							String empname=sc.next();
							value[i].setName(empname);
							break;
						case 3:
							System.out.print("Please Enter the new Employee ID: ");
							int empID1=sc.nextInt();
							value[i].setEmployeeID(empID1);
							System.out.print("Please Enter the new Employee name: ");
							String empname1=sc.next();
							value[i].setName(empname1);
							break;
						default:
							System.out.print("Wrong choice Entered.");
							break;
						}
						break;
					}
				}
				if(temp!=1) {
					System.out.print("Employee ID not found.");
					continue;
				}
				System.out.println("The updated Employee details after deletion are");
				for(int i=0;i<value.length;i++)
				{
					System.out.println("Value on location: "+value[i].toString());
				}
			}
			else if(choice==5)
			{
				System.out.println("Please Enter the name of the Employee which you want to search: ");
				String ename=sc.next();
				int test=-1;
				System.out.println(value.length);
				for(int i=0;i<value.length;i++)
				{
					if(value[i].getName().equalsIgnoreCase(ename))
					{
						test=1;
						System.out.println(ename+" found having Employee ID "+value[i].getEmployeeID());
						break;
					}
				}
				if(test!=1) {
					System.out.print("Employee not found.");
				}
			}
			else if(choice==6)
			{
				Employees temp[]=new Employees[1];
				int n = value.length;
		        for (int i = 0; i < n-1; i++)
		        {
		            for (int j = 0; j < n-i-1; j++)
		            {
		                if (value[j].getEmployeeID() > value[j+1].getEmployeeID())
		                {
		                    // swap arr[j+1] and arr[j]
		                	
		                    temp[0] = value[j];
		                    value[j] = value[j+1];
		                    value[j+1] = temp[0];
		                }
		            }
		        }
		        System.out.println("The updated Employee details after sorting in ascending order is.");
				for(int i=0;i<value.length;i++)
				{
					System.out.println("Value on location: "+value[i].toString());
				}
			}
			else if(choice==7)
			{
				Employees temp[]=new Employees[1];
				int n = value.length;
		        for (int i = 0; i < n-1; i++)
		        {
		            for (int j = 0; j < n-i-1; j++)
		            {
		                if (value[j].getEmployeeID()  < value[j+1].getEmployeeID())
		                {
		                    // swap arr[j+1] and arr[j]
		                	
		                    temp[0] = value[j];
		                    value[j] = value[j+1];
		                    value[j+1] = temp[0];
		                }
		            }
		        }
		        System.out.println("The updated Employee details after sorting in descending order is.");
				for(int i=0;i<value.length;i++)
				{
					System.out.println("Value on location: "+value[i].toString());
				}
			}
			else if(choice==8)
			{
				System.out.println("Exiting the application");
				break;
			}
			else {
				System.out.println("Wrong Input Provided");
			}
		}
	}

}
