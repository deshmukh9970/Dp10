package com.constructor.lab;

//2>Write a Java program to create Student class with following details
//data members : rollno,name,sub1,sub2,sub3,sub4,sub5,percentage ,total ,grade
//methods : displayStudents(),calculatePercentage(),calculateGrade,comparePercentage(Student)
//
//Write a test program create two student object and find out who is getting higher percentage

public class Student {
	
	private int rollno;
	private String name;
	private int sub1;
	private int sub2;
	private int sub3;
	private int sub4;
	private int sub5;
	private double percentage;
	private double total;
	private String grade;
	
	
	Student(int rollno,String name,int sub1,int sub2,int sub3,int sub4,int sub5)
	{
		this.rollno=rollno;
		this.name=name;
		this.sub1=sub1;
		this.sub2=sub2;
		this.sub3=sub3;
		this.sub4=sub4;
		this.sub5=sub5;

	}
	
	public double calculatePercentage()
	{
		percentage=(sub1+sub2+sub3+sub4+sub5)/5;
		return percentage;
	}
	
	public void calculateGrade()
	{
		if(75<=calculatePercentage())
		{
			System.out.println("Grade : A ");
			
		}
		else if(50<=calculatePercentage())
		{
			System.out.println("Grade : B ");
			
		}
		else if(35<=calculatePercentage())
		{
			System.out.println("Grade : C ");
			
		}
		else {
			System.out.println("Fail");
			
		}
	}
	
	
	 public void compareGrade(Student s1) {
	        if (this.calculatePercentage() > s1.percentage) {
	            System.out.println(this.name + " has a higher percentage.");
	        } else if (this.calculatePercentage() < s1.percentage) {
	            System.out.println(s1.name + " has a higher percentage.");
	        } else {
	            System.out.println("Both students have the same percentage.");
	        }
	    }
     
     
     public void displayStudents()
     {
    	 System.out.println("Student Information....................");
    	 System.out.println(" RollName : "+rollno);
    	 System.out.println(" Name : "+name);
    	 System.out.println(" sub1 : "+sub1);
    	 System.out.println(" sub2 : "+sub2);
    	 System.out.println(" sub3 : "+sub3);
    	 System.out.println(" sub4 : "+sub4);
    	 System.out.println(" sub5 : "+sub5);
    	 System.out.println(" Percentage : "+calculatePercentage());
    	 System.out.println("Total : "+(sub1+sub2+sub3+sub4+sub5)+" / 500");
    	 calculateGrade();
    	 
    	 
     }

     
	
	
	
}
