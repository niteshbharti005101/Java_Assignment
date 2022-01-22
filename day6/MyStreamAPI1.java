package com.bajaj.day6;

import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MyStreamAPI1 {
	public static void main(String args[])
	{
		//Stream is created with null or empty list
		//data
		//from source to destination
		Stream<String> st = Stream.empty();
		
		Collection<String> col = Arrays.asList("a","b","c");
		
//		for(String str:col)
//		{
//			System.out.println(str);
//		}
		//col.forEach(str->System.out.println(str));
		
		Stream<String> stOfCol = col.stream();
		stOfCol.forEach(s->System.out.println(s));
		
		//Integer Stream
		Collection<Integer> col1 = Arrays.asList(1000,200,5000,200);
		
//		for(String str:col)
//		{
//			System.out.println(str);
//		}
		//col.forEach(str->System.out.println(str));
		
		Stream<Integer> stOfCol1 = col1.stream();
		stOfCol1
		.filter(s->s==200)        			//filter the data
		.forEach(s->System.out.println(s)); //printing the value
		
		stOfCol1 = col1.stream();
		Long count = stOfCol1
		.filter(s->s==200)        			//filter the data
		.count();
		//.forEach(s->System.out.println(s)); //printing the value
		System.out.println(count);
		
		
		stOfCol1 = col1.stream();
		Collection<Integer> coll = stOfCol1
		.filter(s->s==200)        			//filter the data
		.collect(Collectors.toList());
		//.forEach(s->System.out.println(s)); //printing the value
		coll.forEach(str->System.out.println(str));
	}

}
