//THIS IS THE MAIN CLASS WERE WE ARE ADDING THE CASS NAME AND SORTING
//WE HAVE CHRETED 3 SORTING CLASSES ACCORDING TO GIVEN
//EMPLOYEEE PROPERSTISE:SALARY , IDAND NAME AND WE ARE SORTING THAT 
package com.Treeset.Comparable;

import java.util.Scanner;
import java.util.TreeSet;

public class EmployeeSort {
	

	public static void main(String[] args) {
		TreeSet<employee>t=null; 
		Scanner sc=new Scanner(System.in);
		  int a = 0;
		  while (true) {
		System.out.println("enter your choice");
		
		System.out.println("1.by ID sort \n 2.by Salary Sort \n 3.ny Name sort");
		 a= sc.nextInt();
		
		switch (a) {
		case 1:
			t =new TreeSet<>(new BySortComparator());
			break;
		case 2:
			t= new TreeSet<>(new BySalarySort());
		break;
		
		case 3:
			t= new TreeSet<>(new ByNameSort());
			break;
					
		default:
			break;
		}
		
//TreeSet<employee>t=new TreeSet(new BySalarySort());//this is class name we can change it according to sorting of anything

//creating employee object
employee e1=new employee();
e1.setE_Id(101);
e1.setE_Name("Mohini");
e1.setSalary(7000000.00);
 
employee e2=new employee();
e2.setE_Id(102);
e2.setE_Name("Sakshi");
e2.setSalary(500000.00);

employee e3=new employee();
e3.setE_Id(103);
e3.setE_Name("Revati");
e3.setSalary(4000000.00);

//set object into treeset
t.add(e1);
t.add(e2);
t.add(e3);
System.out.println(t);
	}

}
}
//without taking input from user code
/*package com.Treeset.Comparable;
import java.util.TreeSet;
public class EmployeeSort {
TreeSet<employee>t=new TreeSet(new BySalarySort());//this is class name we can change it according to sorting of anything

//creating employee object
employee e1=new employee();
e1.setE_Id(101);
e1.setE_Name("Mohini");
e1.setSalary(7000000.00);

employee e2=new employee();
e2.setE_Id(102);
e2.setE_Name("Sakshi");
e2.setSalary(500000.00);

employee e3=new employee();
e3.setE_Id(103);
e3.setE_Name("Revati");
e3.setSalary(4000000.00);

//set object into treeset
t.add(e1);
t.add(e2);
t.add(e3);
System.out.println(t);
	}

}
}*/
