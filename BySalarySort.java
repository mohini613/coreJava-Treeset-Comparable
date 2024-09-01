package com.Treeset.Comparable;
//we are created class separate class for sorting this is for SALARRY\\
import java.util.Comparator;

public class BySalarySort implements Comparator{
@Override
	public int compare(Object o1,Object o2) {
		// TODO Auto-generated method stub
employee e1=(employee)o1;
		
		employee e2=(employee)o2;
		
		return (int)(e1.getSalary()-e2.getSalary());
	
		
	}

	}

