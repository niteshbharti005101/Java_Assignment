package com.bajaj.day6;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestAPI {

	public static void main(String args[])
	{
		Collection<Integer> col = Arrays.asList(1000,200,5000,200);
		col.forEach(str->System.out.println(str));
		System.out.println("\n");
		
		Stream<Integer> st = col.stream();
		Collection<Integer> col1 = st
		.distinct() //find unique or disctinct values from the list
		.collect(Collectors.toList());
		
		col1.forEach(str->System.out.println(str));
		
		
		System.out.println("\n");
		System.out.print("The minimum value is: ");
		st=col.stream();
		Optional<Integer> s= st.min((i,j)->i.compareTo(j));
		System.out.println(s.get());
		
		
		System.out.println("\n");
		System.out.print("The maximum value is: ");
		st=col.stream();
		Optional<Integer> s1= st.max((i,j)->i.compareTo(j));
		System.out.println(s1.get());
		
		Stream<Integer> st1 = col.stream();
		List<Integer> lss=st1.sorted().collect(Collectors.toList());
		lss.forEach(ss1->System.out.println(ss1));
		
		st=col.stream();
		Integer sum = st.map(e->e).reduce(0, (x,y)->x+y);
		System.out.println("\n\nSum = "+sum);
		
		//1. count
		//2. min
		//3. max
		//4. filter
		//5. map
		//6. collectors
		//7. distincts
	}
}
