package com.Treeset.Comparable;
import java.util.Scanner;
import java.util.TreeSet;
public class studentSort {


		public static void main(String[] args) {
			TreeSet<Student>t=null; 
			Scanner sc=new Scanner(System.in);
			  int x = 0;
			  while (true) {
			System.out.println("enter your choice");
			
			System.out.println("1.by Name sort \n 2.by Subject sort \n 3.ID sort");
			 x= sc.nextInt();
			
			switch (x) {
			case 1:
				t =new TreeSet<>(new studNameSort());
				break;
			case 2:
				t= new TreeSet<>(new studIDsort());
			break;
			
			case 3:
				t= new TreeSet<>(new studIDsort());
				break;
						
			default:
				break;
			}
			
			  
			  
			Student S1 = new Student();
			S1.setS_Id(501);
			S1.setS_Name("Mohini");
			S1.setS_Subject("AI");

			Student S2 = new Student();
			S2.setS_Id(502);
			S2.setS_Name("Sakshi");
			S2.setS_Subject("DS");

			Student S3 = new Student();
			S3.setS_Id(503);
			S3.setS_Name("Revati");
			S3.setS_Subject("CS");

			  
			  //set object into treeset
			  t.add(S1);
			  t.add(S2);
			  t.add(S3);
			  System.out.println(t);
			  	}

			  }
}
			  

