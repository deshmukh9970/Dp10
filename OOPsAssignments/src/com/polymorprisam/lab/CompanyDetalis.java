package com.polymorprisam.lab;

import java.util.Scanner;

import com.opps.classWork.DeparmentDemo;


public class CompanyDetalis {
	
	static Scanner sc=new Scanner(System.in);
	
	
	 public static void deparmentDetalis(Department i)
	 {
		System.out.println("Enter Deparment id : "); 
		i.setDid(sc.nextInt());
		
		System.out.println("Enter Deparment Name : "); 
		i.setDeptName(sc.next());
		
	 }
	 
	 public static void employeeDetalis(Employee j)
	 {
		 System.out.println("Enter Employee id : "); 
			j.setEid(sc.nextInt());
		
		System.out.println("Enter Employee Name : "); 
		j.setEmpNmae(sc.next()); 
		
		System.out.println("Enter Employee Salary : "); 
		j.setSalary(sc.nextDouble());
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//using anonymous department
		Employee e1=new Employee(1,"amar",25000,new Department(102,"IT"));
		System.out.println(e1);
		
		//using Constructor
		Department d1=new Department(102,"IT");
		Department d2=new Department(103,"Account");
		Department d3=new Department(104,"MBA");
		
		
		
		Employee e2=new Employee(1,"amar",25000,d1);
		Employee e3=new Employee(2,"prmod",28000,d2);
		Employee e4=new Employee(3,"Aniket",29000,d3);
		
		
//		
//		System.out.println("using anonymous Employee : "+e2);
		System.out.println(" using Constructor Employee 2 : "+e2);
//		System.out.println(" using Constructor Employee 3 : "+e3);
//		System.out.println(" using Constructor Employee 4 : "+e4);
		
		////check the hashcode generated for department in 1st and 2 nd object
		  System.out.println("Hashcode depart 1 : "+d1.hashCode());
		  System.out.println("Hashcode depart 2 : "+d2.hashCode());
		  
		  
		//using getter and setter
			deparmentDetalis(d3);
			employeeDetalis(e4);
		
		
		
	}

}
