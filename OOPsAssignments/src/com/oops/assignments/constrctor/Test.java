package com.oops.assignments.constrctor;

public class Test {
	
	public Test(int i) {
		System.out.println("Hello");
	}

	public void Test(int n)
	{
		System.out.println("Welcome");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Test obj=new Test(10);
		
		obj.Test(20);

	}

}
