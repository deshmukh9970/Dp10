package com.localaIneerClass;

class Outer
{
	
	private static int data=20;
	
	void display()
	{
		class Inner
		{
			
			private int value=10;
			
			void show()
			{
				System.out.println(data);
				System.out.println(value);
			}
			
				
		}
		
		Inner i=new Inner();
		i.show();
	}
	
	
}

public class LocalClassDemo {
	
	public static void main(String[] args) {
		
		Outer o=new Outer();
		o.display();
		
	}

}
