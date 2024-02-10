package com.inhertance2;
import com.inhertance.AccessModifer;

public class Demo3 {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Demo3 obj=new Demo3();
		  AccessModifer  obj=new AccessModifer(); //usig AccessModifer object accessing public method 
		
		//System.out.println(obj.a); // private variable is not access out side package
		   // System.out.println(obj.b);  // default variable is not access out side package
		   // System.out.println(obj.c);// 
		    System.out.println(obj.d);
		
		//obj.test(); // private method is not access out side package
		//obj.show();  // default method is not access out side package
		//obj.info();
		obj.check();

	}

}
