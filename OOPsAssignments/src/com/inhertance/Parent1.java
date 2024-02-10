package com.inhertance;

public class Parent1 {
    int id;
    String msg;
	
	Parent1()
	{
		msg="Hello";
	}
	
	Parent1(int id,String msg)
	{
		this();
		this.id=id;
		System.out.println("Parent ");
		
	}
	
	void display()
	{
		System.out.println("Parent method");
	}
	
}
