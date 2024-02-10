package com.inhertance;

public class Child1 extends Parent1 {
	String msg;
	
	Child1()
	{
		
	}
	
	
	Child1(int id,String msg)
	{
		super(id,msg);
		System.out.println("Child");
		msg="Ok";
	}

	void display()
	{
		System.out.println("Local "+msg);
		System.out.println("Local "+this.msg);
		System.out.println("Local "+super.msg);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
