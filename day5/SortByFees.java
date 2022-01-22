package com.bajaj.day5;

import java.util.Comparator;

public class SortByFees implements Comparator<Student>{

	@Override
	public int compare(Student s1, Student s2) {
		// TODO Auto-generated method stub
		if(s1.getFees()>s2.getFees())
		{
			return 1;
		}
		else if(s1.getFees()<s2.getFees())
		{
			return -1;
		}
		else
		{
			return 0;
		}
	}
}
