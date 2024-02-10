package com.constructor.lab;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student s=new Student(24,"Amar",65,60,62,68,70);
	    s.displayStudents();
	    
	    Student s1=new Student(24,"Pramod",35,48,42,41,40);
	    s1.displayStudents();
	    
	    s.compareGrade(s1);
	    
	    
	}

}
