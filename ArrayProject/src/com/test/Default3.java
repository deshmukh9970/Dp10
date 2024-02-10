package com.test;


	
	
	//Q3.) Create a code to explain why default method
	// was added in interface and what problem was faced due to this?

	//Ans := Default method Added Beacuse of providing add extra functionlity of Separate class .
//	      indroduced by java 8 feature to add default method in interface
	// Probleam := faced to default method causing Ambiguity or DiamondProbleam.
	// Solved :=you can Write Public void display method to  own and call using
//	           className.super.methodname(); to avoid ambiguty issue.
	              

	 interface Student
	{
	   void show();
	   
	   default void display()
	  {
	     System.out.println("I am Default method of Student");
	  }

	}

	interface Teacher
	{
	   void show();
	   
	   default void display()
	  {
	     System.out.println("I am Default method of Teacher");
	  }

	}

	public class Default3 implements Student,Teacher //
	{
	  
	   public void show()
	  { 
	   System.out.println(" Show method implementation");
	  }  

	  public void display()
	 {
	     System.out.println("implementation");
	     Student.super.display();
	     Teacher.super.display();
	 }

	 public static void main(String[] args)
	 {

	   Student s;
	   s=new Default3(); 
	   s.show();
	   s.display();

	   Teacher t;
	  t=new Default3(); 
	   t.show();
	   t.display();
	  }


	   
	   
	}




