package com.opps.extraAssignment.lab;

//3.
//Assign and print the roll number, phone number and address of two students
//having names "Sam" and "John" respectively by creating two objects of class 'Student'.

public class Student1 {
	
	String name;
	int roll;
	String mobile;
	String address;
	
	public void setData(String name,int roll,String mobile,String address )
	{
		this.name=name;
		this.roll=roll;
		this.mobile=mobile;
		this.address=address;
	}
	
	public void display()
	{
		System.out.println("Name : "+name);
		System.out.println("roll : "+roll);
		System.out.println("mobile : "+mobile);
		System.out.println("address : "+address);
	}
	
	
}
