package com.polymorprisam.lab;

//Create a program to show how type promotion can create ambiguity in method overloadig

public class TypePromationAmbiguty {
	
  
	
	public static void Test(int a,double b)
	{
		System.out.println("Int "+a);
		System.out.println("Double "+b);
		
	}
	
	public static void Test(double a,float b)
	{
		System.out.println("double "+a);
		System.out.println("Float "+b);
	}
	
	public static void main(String[] args) {
		
		Test(10,4.5);
		Test(20.4,5.4f);
		
		//The method Test(int, double) is ambiguous for the type TypePromationAmbiguty
		//Test(10,4.5f);
		
		//TypePromationAmbiguty
		 Test(10,(double)4.5f);
		
		
		
	
	}

}
