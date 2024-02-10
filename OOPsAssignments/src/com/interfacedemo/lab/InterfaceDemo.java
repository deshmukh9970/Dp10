package com.interfacedemo.lab;

//Task1>> 
//Create an example to show the usage of default, static and private method in interface

interface Emlpoyee
{
	void work();
	
	default void displayInfo()
	{  
		employeePayment();
		employeeDetalis();
		System.out.println("This Personal Data of Employee ");
	}
	
	private void employeePayment()
	{
		System.out.println("Employee Payment is 85000");
	}
	
	static void employeeDetalis()
	{
	    System.out.println("Employee Detalis");	
	}
}

class Developer implements Emlpoyee
{

	@Override
	public void work() {
		System.out.println("Developer Work is Completed");
		
	}
	
	@Override
	public void displayInfo()
	{
	     System.out.println("Developer Name Amar, id=102");	
	}
	
	
	
	
}
class Manger implements Emlpoyee
{

	@Override
	public void work() {
		System.out.println("Manger Work is Done");
		
	}
	
	public void displayInfo()
	{
	     System.out.println("Developer Manger: pramod, id=102");
	     Emlpoyee.super.displayInfo();
	}
	

	
}

public class InterfaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Emlpoyee e;
		e=new Developer();
		e.displayInfo();
		e.work();
		

		
		
		e=new Manger();
		e.displayInfo();
		e.work();

	}

}
