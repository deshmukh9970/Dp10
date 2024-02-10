package com.opps.extraAssignment.lab;

//2.
//Create a class named 'Student' with String variable 'name' and integer variable 
//'roll_no'. Assign the value of roll_no as '2' and that of name as "John" by creating 
//an object of the class Student.

public class Student {

	 String name ="John";
	 int roll_no=2;
	 
	 
	 public static void main(String[] args) {
		
		 Student obj=new Student();
		 System.out.println(obj.name);
		 System.out.println(obj.roll_no);
	}
	 
	 
}
