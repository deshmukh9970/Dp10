package com.innerclass;

class Outerdemo
{
	
	void show()
	{
		System.out.println("outer class");
	}
	
    class Inner
    {
    	
    	void display()
    	{
    		System.out.println("Inner class");
    	}
    	
    }
	
}


public class Outer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Outerdemo o=new Outerdemo();
		o.show();
		
		//inerr class calling
		Outerdemo.Inner i=o.new Inner();
		i.display();
		
		//Anyomis using you cant call
		Outerdemo.Inner i2=new Outerdemo().new Inner();
		i2.display();
		
		

	}

}
