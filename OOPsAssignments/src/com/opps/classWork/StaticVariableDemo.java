package com.opps.classWork;

public class StaticVariableDemo {
	
	int x=10;
	static int y=20;
	
	public void show()
	{
		int x=18;
		System.out.println("Show method Local varible: "+x);  // local variable call
		System.out.println("Global or instance variable call: "+this.x); // Global or instance variable call
		
		int y=25;
		System.out.println("Show method Local varible: "+y);
		System.out.println("Show method Static varible: "+StaticVariableDemo.y); // static variable call
	}

	public void testMemory()
	{
		x++;
		y++;
		
		System.out.println("incerment instance "+x);
		System.out.println("increment static "+y);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StaticVariableDemo s1=new StaticVariableDemo();
		s1.show();
		s1.testMemory();
		System.out.println("=================again object crate and calling=========================");

		StaticVariableDemo s2=new StaticVariableDemo();
		s2.testMemory();
	}

}
