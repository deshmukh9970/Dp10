package com.inhertance.lab;

import java.util.Scanner;


public class TaxiSystem {
	
	Scanner sc=new Scanner(System.in);
	
	public void enterDetalis(Car i)
	{
		System.out.println("Enter Car No :  ");
		i.setCarNo(sc.nextInt());
		
		System.out.println("Enter Car Brand :  ");
		i.setBrand(sc.next());
		
		System.out.println("Enter Car Model :  ");
		i.setBrand(sc.next());
		
		//annymose 1st way
		
		Driver d= new Driver();
		
		System.out.println("Enter Driver id :  ");
		d.setDriverid(sc.nextInt());
		
		System.out.println("Enter Driver Name :  ");
		d.setName(sc.next());
		
		System.out.println("Enter Driver Adhar :  ");
		d.setAdharNo(sc.nextLong());
		
		System.out.println("Enter Driver Salary :  ");
		d.setSalary(sc.nextDouble());
		
		i.setDriver(d);
		
		//
		
		
	}
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   
		TaxiSystem taxi= new TaxiSystem();
		
	// 2st task	
		Car c= new Car(12,"BMw","X1",new Driver(101,"amar",4555,45200));
		
		 System.out.println(c);
		
		// 3nd task
		Car c1= new Car();
		Car c2= new Car();
		Car c3= new Car();
		
		taxi.enterDetalis(c1);
		taxi.enterDetalis(c2);
		taxi.enterDetalis(c3);
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c2);
		
		
		
		
		 
		
	}

}
