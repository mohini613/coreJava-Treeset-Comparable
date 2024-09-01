package com.Treeset.Comparable;
import java.util.Comparator;


import  lombok.Data;
@Data
public class employee implements  Comparator{
 private int e_Id;
 
 private String e_Name;
 
 private double Salary;
 
 
@Override
public int compare(Object o1, Object o2) {
	employee e1= (employee)o1;
	
	employee e2= (employee)o2;
	
	return e1.getE_Name().compareTo(e2.getE_Name());
	//return e1.getE_Name().compareTo(e2.getE_Name());//alphabetical order also ascending and descening order because of "-" and"+"	sign
	//return (int)(e1.getSalary()-e2.getSalary());// ascending and descening order because of "-" and"+"	sign
   // return (int)(e1.getSalary()-e2.getSalary());             //-e1.getE_Id()+e2.getE_Id();

}


String getE_Name() {
	// TODO Auto-generated method stub
	return null;
}


public int getSalary() {
	// TODO Auto-generated method stub
	return 0;
}


public int getE_Id() {
	// TODO Auto-generated method stub
	return 0;
}


public void setE_Id(int i) {
	// TODO Auto-generated method stub
	
}


public void setE_Name(String string) {
	// TODO Auto-generated method stub
	
}


public void setSalary(double d) {
	// TODO Auto-generated method stub
	
}


 
 
}
