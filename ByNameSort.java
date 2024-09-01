package com.Treeset.Comparable;

import java.util.Comparator;

public class ByNameSort implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		
employee e1=(employee)o1;
		
		employee e2=(employee)o2;
		return -e1.getE_Name().compareTo(e2.getE_Name());//alphabetical order and in descending order
	}


	}

