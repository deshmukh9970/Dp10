package com.cotainment.classwork;

public class CollageMain {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Anemias object calling of course by passing constructor value
		Student s1=new Student(1,"amar",new Course(101,"Java",45000));
		
	  //Course details call using course class object	
		Course c1=new Course(102,"c++",40000);
		Course c2=new Course(103,"c",49000);
		Course c3=new Course(104,"Python",48000);
		
		//Here passing Student details and using Student constructor passing course object as c1
		Student s2= new Student(2,"Pramod",c1);
		Student s3= new Student(3,"Sahil",c2);
		Student s4= new Student(4,"Aniket",c3);
	     
		// every object has different  Hashcode 
		System.out.println( "Hashcode S2 : "+s2.hashCode());
		System.out.println( "Hashcode C1 : "+c1.hashCode());
		 
		System.out.println( "Hashcode S1 : "+s1.hashCode());
		System.out.println( "Hashcode C1 : "+c2.hashCode());
		
		
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);

	}

}
