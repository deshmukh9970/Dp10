package com.inhertance;

public class Manager extends Employee{
   
	private String department;
	
	
	Manager(int eid,String ename,String department)
	{
		super(eid, department);
		this.department=department;
		System.out.println("Manger");
	}
	
	
	public static void main(String[] args) {
		
		Manager m= new Manager(1,"Amar","It");
		
	}
	
}
