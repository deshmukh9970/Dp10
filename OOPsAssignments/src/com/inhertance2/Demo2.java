package com.inhertance2;

import com.inhertance.AccessModifer;

public class Demo2 extends AccessModifer{
	
	public static void main(String[] args) {
		
		Demo2 obj= new Demo2();
		
		 //System.out.println(obj.a); // private variable is not access out side package
	   // System.out.println(obj.b);  // default variable is not access out side package
	    System.out.println(obj.c);
	    System.out.println(obj.d);
	
	//obj.test(); // private method is not access out side package
	//obj.show();  // default method is not access out side package
	obj.info();
	obj.check();
	
		
	}

}
