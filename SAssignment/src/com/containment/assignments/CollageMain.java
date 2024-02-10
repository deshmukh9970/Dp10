package com.containment.assignments;

import java.util.Scanner;

public class CollageMain {
	
	static Scanner sc= new Scanner(System.in);
	
	public static void enterDetails(Student i)
	{
		System.out.println("Enter Roll Number: ");
		i.setSroll(sc.nextInt());
		
		System.out.println("Enter Student Name : ");
		i.setSname(sc.next());
		
		// 1st Way Creating by Object  
		Department d=new Department();
		
		System.out.println("Enter Dpartment Id : ");
		d.setDid(sc.nextInt());
		
		System.out.println("Enter Department Name : ");
		d.setDname(sc.next());
		
		i.setDepartment(d); // i Student Setting Department  Here passing all data to Department object of d 
		
		//2nd way Creating  by Anonymous object
		
//		i.setDepartment(new Department());
//		
//		System.out.println("Enter Department Id: ");
//		i.getDepartment().setDid(sc.nextInt());
//		
//		System.out.println("Enter Department Name");
//		i.getDepartment().setDname(sc.next());
		
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student s1=new Student();
		enterDetails(s1);
		
		System.out.println("Student Roll : "+s1.getSroll());
		System.out.println("Student Name : "+s1.getSname());
		
		System.out.println("Department Id : "+s1.getDepartment().getDid());
		System.out.println("Department Name : "+s1.getDepartment().getDname());

	}

}
