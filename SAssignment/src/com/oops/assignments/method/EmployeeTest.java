package com.oops.assignments.method;

import java.util.Scanner;

public class EmployeeTest {
	

	public static void main(String[] args) {

		Employee obj=new Employee();
		obj.setData(4, "Vivek", 45000, "RND in Pharma");
		obj.display();

	   System.out.println("************************************");
	   System.out.println("****Scanner Using**********");
	   
	   Scanner sc=new Scanner(System.in);
	   System.out.println("Enter id : ");
	   int id=sc.nextInt();
	   
	   System.out.println("Enter name : ");
	   String name=sc.next();
	   
	   System.out.println("Enter salary : ");
	   double salary=sc.nextDouble();
	   
	   System.out.println("Enter Digination : ");
	   String degination=sc.next();
	   
	   Employee obj1=new Employee();
		obj1.setData(id, name, salary, degination);
		obj1.display();
	   
	}

}
