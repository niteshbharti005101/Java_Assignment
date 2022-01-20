package com.bajaj.day4;


//Generic Class - pass datatype as parameters to class
//wrapper classes
class Employee<T,V,Z>
{
	//fixed int
	private T id;
	//fixed String
	private V name;
	private Z salary;
	Employee(T id,V name,Z salary)
	{
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
}
public class GenericClass {
	
	public static void main(String args[])
	{
		//Employee e1 = new Employee(1001,"Nitesh",1000);
									//long      //long
		Employee<Long,String,Long> e2 = new Employee(1001,"Nitesh",1000);
		Employee<Double,String,Long> e3 = new Employee(1001.12,"Nitesh",1000);
	}

}
