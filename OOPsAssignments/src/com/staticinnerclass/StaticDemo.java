package com.staticinnerclass;

class Outer
{
	static int value=10;
	String msg="Hello";
	
	void display()
	{
		System.out.println("value "+value);
		System.out.println("msg "+msg);
	}
	
	static class Inner
	{
		static int data=100;
		String msg1="Welcome";
		
		void show()
		{
			System.out.println("value "+value);
			//System.out.println("msg "+msg); //cant accept becuse of instanc value of outer class
		 	// display(); // can not call instance method
			
			System.out.println("data "+data);
			System.out.println("msg1 "+msg1); // instance value of inner class you can call in instance method
			
			
			//object crated
			Outer o=new Outer();
		    System.out.println("msg "+o.msg);
		    o.display();
			
		} 
		
		static void print()
		{
			System.out.println("Inner Static");
		}
		
	}
	
}

public class StaticDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//Outer.Inner i2=new Outer().new Inner();
		
		// crate REfrance and call of Outer class
		Outer.Inner i=new Outer.Inner();
		i.show();
		
		Outer.Inner.print(); //static method call of inner class

	}

}
