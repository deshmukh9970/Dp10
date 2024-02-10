package com.super_this_constructor.assignments;

import java.util.Scanner;

public class StudentMain {
	
	static Scanner sc = new Scanner(System.in);
	
	public static void enterDetalis(Student i)
	{
		System.out.println("Enter Id : ");
		i.setId(sc.nextInt());
		
		System.out.println("Enter Name : ");
		i.setName(sc.next());
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student s= new Student();
		
		enterDetalis(s);
		
		Student s2= new Student();
		
		enterDetalis(s2);
		
		System.out.println("Student Information S1 : "+s.getName()); // Here printing because of toString Method
		System.out.println("Student Information S2 : "+s.getId());

	}

}
