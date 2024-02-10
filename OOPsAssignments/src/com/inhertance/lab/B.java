package com.inhertance.lab;

public class B extends A{
	
	
	

	private static int p;

	//mplicit super constructor A() is undefined. Must explicitly invoke another constructor
	B()
	{
		super(p);
		System.out.println("hi");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		B obj=new B();
		

	}

}
