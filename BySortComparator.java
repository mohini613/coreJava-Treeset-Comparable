package com.Treeset.Comparable;

import java.util.Comparator;

public class BySortComparator implements Comparator{
//THIS CLASS IS BY ID SORT 
		
		@Override
		public int compare(Object o1, Object o2) {
			// TODO Auto-generated method stub
			employee e1=(employee)o1;
			employee e2=(employee)o2;
			if(e1.getE_Id()>e2.getE_Id()) {
				return 1;//[employee(e_Id=103, e_Name=Revati, Salary=4000000.0), employee(e_Id=102, e_Name=Sakshi, Salary=5000000.0), employee(e_Id=101, e_Name=Mohini, Salary=7000000.0)]
//IF -1
			}
			else if(e1.getE_Id()<e2.getE_Id()) {
				return -1;//OUTPUT:[employee(e_Id=101, e_Name=Mohini, Salary=7000000.0), employee(e_Id=102, e_Name=Sakshi, Salary=5000000.0), employee(e_Id=103, e_Name=Revati, Salary=4000000.0)]
//IF -1
			}
			else 
				return 0;
			//return -e1.getE_Id()+e2.getE_Id();
		}
}
