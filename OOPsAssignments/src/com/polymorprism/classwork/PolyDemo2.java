package com.polymorprism.classwork;

public class PolyDemo2 {
	
	//static method overloading
	static void Test(int a)
	{
		System.out.println("Hello Static");
	}
	
	static void Test(int a,int b)
	{
		System.out.println("hi Static");
	}
	
	//main method overloading because hi also static method
	public static void main(int a)
	{
		System.out.println("Call Explicity to main method");
	}
	
	public void show()
	{
		System.out.println("Hi Access modifier");
	}
	
	protected void show(int a)
	{
		System.out.println("Hello Access modifier ");
	}
	
	public static void main(String[] args) {
		
	     Test(10);
	     Test(20,10);
	     
	     main(20);
		
	}

}
