package com.bajaj.day5;
//Student Data
//Rollno Name
//1		 a
//2		 b
//3   	 c
//4		 d

//Set , Class type
//List
//Map - Key value pair
//Keys cannot be duplicate
import java.util.*;
public class MyMap {
	
	public static void main(String args[])
	{
		//Hashtable - order is not maintained
		Map<Integer,String> m = new Hashtable<Integer,String>();
		m.put(1, "a");
		m.put(2, "b");
		m.put(3, "c");
		m.put(4, "d");
		m.put(5, "e");
		
		System.out.println(m);
		
		//HashMap - Sorted order
		Map<Integer,String> m1 = new HashMap<Integer,String>();
		m1.put(1, "a");
		m1.put(2, "b");
		m1.put(5, "c");
		m1.put(4, "d");
		m1.put(3, "e");
		
		System.out.println(m1);
		

		System.out.println();
		//Linked HashMap - act as linked list (order  is maintained)
		Map<Integer,String> m2 = new LinkedHashMap<Integer,String>();
		m2.put(1, "a");
		m2.put(2, "b");
		m2.put(5, "c");
		m2.put(3, "d");
		m2.put(4, "e");
		
		System.out.println(m2);
		
		//key is used as Set
		Set<Integer> keys = m2.keySet();
		System.out.println(keys);
		
		for(Integer i: keys)
		{
			System.out.println("key as "+i +" value "+m2.get(i));
		}
		
		System.out.println();
		//Tree map - sorted map
		Map<Integer,String> m3 = new TreeMap<Integer,String>();
		m3.put(4, "a");
		m3.put(2, "b");
		m3.put(5, "c");
		m3.put(1, "d");
		m3.put(3, "e");
		
		System.out.println(m3);
		
		//key is used as Set
		Set<Integer> keys1 = m3.keySet();
		System.out.println(keys);
		
		for(Integer i: keys1)
		{
			System.out.println("key as "+i +" value "+m3.get(i));
		}
		
		System.out.println();
		//Map for student
		Map<String,Student> map = new HashMap<String,Student>();
		
		map.put("b",new Student(1001,"Ansar",5));
		map.put("c",new Student(1002,"Ajay",1));
		map.put("e",new Student(1003,"Vijay",2));
		map.put("d",new Student(1005,"Shree",5));
		map.put("a",new Student(100,"Nath",10));
		
		Set<String> keys2 =map.keySet();
		
		//map.containsKey(keys2)
		//map.isEmpty()
		//map.remove(keys)
		//map.size()
		//map.remove(keys, keys)
		//map.replace(null,null)
		//map.values()
		//System.out.println(keys)
		
		Collection<Student> values=map.values();
		for(Student s1:values)
		{
			System.out.println(s1);
		}
		for(String str:keys2)
		{
			System.out.println("Key as "+str +" value "+map.get(str));
		}
	}
}
