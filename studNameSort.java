package com.Treeset.Comparable;

import java.util.Comparator;

public class studNameSort implements Comparator{
	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		Student S1=(Student)o1;
        Student	S2=(Student)o2;
       return +S1.getS_Name().compareTo(S2.getS_Name());
}
}
