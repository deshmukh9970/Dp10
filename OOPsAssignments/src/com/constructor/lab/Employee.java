package com.constructor.lab;

//Using Constructor

//Task for the day .
//1>Write a Java program to create Employee class with following details 
//data members  : id,ename,basicsal ,pf,hra,da  ,netsal ,deptno
//default and parametric constructors
//methods : displayEmp().calculateSal() 
//Note : pf is 10% basicsal,hra is 15% of basicsal ,da is 20% of basicsal 
//netsal=basicsal-pf+da+hra

//Write a test program in which create 2 employee object and call methods

public class Employee {
	
	
	private int id;
	private String ename ;
	private double basicsal;
	private int deptno;
	private double pf;
	private double hra;
	private double netsal;
	private double da;
	
	Employee(int id,String ename,double bascisal,int deptno)
	{
		this.id=id;
		this.ename=ename;
		this.basicsal=bascisal;
		this.deptno=deptno;
	}
	
	public double calPf()
	{
		return 0.10*basicsal;
	}
	
	public double calHra()
	{
		return 0.15*basicsal;
	}
	
	public double calDa()
	{
		return 0.20*basicsal;
	}
	
	public double netsal()
	{
		return (basicsal-calPf()+calDa()+calHra());
	}
	
	public void displayEmp()
	{
		System.out.println("This Information........");
		System.out.println("Id : "+id);
		System.out.println("Name : "+ename);
		System.out.println("Basisal : "+basicsal);
		System.out.println("Pf : "+calPf());
		System.out.println("DA : "+calDa());
		System.out.println("HRA : "+calHra());
		System.out.println("NETSALARY : "+netsal());
		
	}
	

}
