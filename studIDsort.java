package com.Treeset.Comparable;
import java.util.Comparator;

public class studIDsort implements Comparator{

			@Override
			public int compare(Object o1, Object o2) {
				// TODO Auto-generated method stub
				Student S1=(Student)o1;
		        Student	S2=(Student)o2;
				if(S1.getS_Id()>S2.getS_Id()) {
					return 1;
				}
				else if(S1.getS_Id()<S2.getS_Id()) {
					return -1;
					}
				else 
					return 0;
			
			}
	}


