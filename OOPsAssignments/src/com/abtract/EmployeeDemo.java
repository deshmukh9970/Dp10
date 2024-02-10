package com.abtract;

abstract class Employee{
	
	private int id;
	private String name;
	
	static String companyName;
	
	static
	{
		companyName="HCL";
	}
	
	Employee()
	{
		
	}

	public Employee(int id, String name) {
		
		this.id = id;
		this.name = name;
	}
	
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static String getCompanyName() {
		return companyName;
	}

	public static void setCompanyName(String companyName) {
		Employee.companyName = companyName;
	}

	public abstract void work();
	
	final void display()
	{
		System.out.println("Company Name : "+companyName);
		System.out.println("Company Name : "+id);
		System.out.println("Company Name : "+name);
	}
	
	
}

class Developer extends Employee
{

	
	
	@Override
	public void work() {
		System.out.println("Developer is Wroking ");
		
	}
	
    
	
	
}

class Manger extends Employee
{

	@Override
	public void work() {
	System.out.println("Manger is also working");
		
	}
	
}

public class EmployeeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee e;
		e=new Developer();
		e.display();
		e.work();
		
		e=new Manger();
		e.display();
		e.work();
		
		

	}

}
