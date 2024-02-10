package com.inhertance;

public class Demo extends AccessModifer{
	
	public static void main(String[] args) {
		
		Demo obj=new Demo();
		
		  //System.out.println(obj.a); // private variable is not access out side class
		    System.out.println(obj.b);
		    System.out.println(obj.c);
		    System.out.println(obj.d);
		
		//obj.test(); // private method is not access out side class
		obj.show();
		obj.info();
		obj.check();
		
		
		
	}

}
