package com.oops.assignments;

public class TestMain {
	
	
	public void add(int a,int b)
	{
		System.out.println("Sum "+(a+b));
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student  s1=new Student();
		Student  s=new Student();
		
		System.out.println("roll number "+s.roll);
		System.out.println("Name is :"+s.name);
		
		//change value of instance variable
		s1.name="Prasad";
		s1.roll=20;
		
		System.out.println("roll number "+s.roll);
		System.out.println("Name is :"+s.name);
		
		
		
		
		//Anonymus Object calling method
		new TestMain().add(5,7);
		
		// Anonymus Object
		new TestMain();
		
		
		
		

	}

}
