package com.polymorprism.classwork;

public class TypePromation {

	static void display(int n)
	{
		System.out.println("In Char ");
		System.out.println("Char "+n);
	}
	
	static void display(int a,double b)
	{
		System.out.println("In int "+a);
		System.out.println("double "+b);
	}
	
	static void display(long a,float b)
	{
		System.out.println("In long "+a);
		System.out.println("float "+b);
	}
	
	public static void main(String[] args) {
		
		display(8,6.4);
		display(9l,4.2f);
		
		//but the method display(int, double) in the type TypePromation is not applicable for the arguments (long, double)
		//display(8l,6.4); (yu go int to long but not go long to int //decreasing order not possible)
		
		//The method display(int, double) is ambiguous for the type TypePromation
		//display(8,4.5f);
		
		//char convert to int value asci
		display('A');
		
		
	}
	
	
	
}
