package com.oops.assignments.method;

public class Employee {
	
	int id;
	String name;
	double sal;
	String designation;
	
	public void setData(int id,String name,double sal,String designation)
	{
		this.id=id;
		this.name=name;
		this.sal=sal;
		this.designation=designation;
	}
	
	public double calHra()
	{
		return 0.10*sal;
	}
	
	public double calDA()
	{
		return 0.15*sal;
	}
	
	public double calBasicSal()
	{
		return (sal-calHra()-calDA());
	}
	
	public void display()
	{
		System.out.println("Employee id : "+id);
		System.out.println("Employee name : "+name);
		System.out.println("Employee salary : "+sal);
		System.out.println("Employee Hra : "+calHra());
		System.out.println("Employee DA : "+calDA());
		System.out.println("Employee Basic Salary : "+calBasicSal());
	}

}
