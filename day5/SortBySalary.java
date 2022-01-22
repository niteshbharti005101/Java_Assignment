package com.bajaj.day5;

import java.util.Comparator;

public class SortBySalary implements Comparator<Teacher>{

	@Override
	public int compare(Teacher t1, Teacher t2) {
		// TODO Auto-generated method stub
		if(t1.getSalary()>t2.getSalary())
		{
			return 1;
		}
		else if(t1.getSalary()<t2.getSalary())
		{
			return -1;
		}
		else
		{
			return 0;
		}
	}
}
