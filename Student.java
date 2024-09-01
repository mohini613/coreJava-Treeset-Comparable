package com.Treeset.Comparable;
import java.util.Comparator;
import  lombok.Data;
@Data
public class Student implements Comparator{
	 private int S_Id;
	 
	 private String S_Name;
	 
	 private String S_Subject;
	
	 @Override
	 public int compare(Object o1, Object o2) {
	 	Student S1= (Student)o1;
	 	
	 	Student S2= (Student)o2;
	 	
	 	return -S1.getS_Name().compareTo(S2.getS_Name());
	 	//return e1.getE_Name().compareTo(e2.getE_Name());//alphabetical order also ascending and descening order because of "-" and"+"	sign
	 	//return (int)(e1.getSalary()-e2.getSalary());// ascending and descening order because of "-" and"+"	sign
	    // return (int)(e1.getSalary()-e2.getSalary());             //-e1.getE_Id()+e2.getE_Id();

	 }

	String getS_Name() {
		// TODO Auto-generated method stub
		return null;
	}

	 void setS_Id(int i) {
		// TODO Auto-generated method stub
		
	}

	public void setS_Name(String string) {
		// TODO Auto-generated method stub
		
	}

	public void setS_Subject(String string) {
		// TODO Auto-generated method stub
		
	}

	public int getS_Id() {
		// TODO Auto-generated method stub
		return 0;
	}

	public Object getS_Subject() {
		// TODO Auto-generated method stub
		return null;
	}
}







 
 

