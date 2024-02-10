package com.inhertance;

//using super keywoed call constuor of parent
class Parent {

	int value;
	
	Parent()
	{
		
	}
	
	Parent(int value)
	{
		System.out.println("Parent constrctor...");
		this.value=value;
		
	}
	
}

class Child extends Parent1
{
	int data;
	
	Child()
	{
		
	}
	
	Child(int value,int data)
	{
		//super(value);// call parent constrctor
		System.out.println("Child constrctor...");
		this.data=data;
		
	}
}

public class SuperDemo
{
	public static void main(String[] args) {
		
	}
}