package com.oops.assignments.constrctor;

public class CallMultileConstctor {
	
	public CallMultileConstctor()
	{
		System.out.println("1 Default Constror");
	}

	public CallMultileConstctor(int num)
	{
		this();
		System.out.println("2 Constror");
	}

	public CallMultileConstctor(int num,String name )
	{
		this(10);
		System.out.println("3 Constror");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	  
		CallMultileConstctor obj=new CallMultileConstctor(10,"xyz");// call two paramerize constructor
		
     
	}

}