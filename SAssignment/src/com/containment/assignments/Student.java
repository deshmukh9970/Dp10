package com.containment.assignments;

//Student class has
//roll, name and Department object should have id and name. Assign and
//print individual values in main method

public class Student {
	
	private int sroll;
	private String sname;
	private Department department;
	
	Student()
	{
		
	}

	Student(int sroll,String sname,Department department)
	{
		this.sroll=sroll;
		this.sname=sname;
		this.department=department;
	}
	
	
	public void setSroll(int sroll)
	{
		this.sroll=sroll;
	}
	
	public int getSroll()
	{
		return sroll;
	}
	
	public void setSname(String sname)
	{
		this.sname=sname;
	}
	
	public String getSname()
	{
		return sname;
	}
	
	public void setDepartment(Department department)
	{
		this.department=department;
	}
	
	public Department getDepartment()
	{
		return department;
	}
	
	public String toString()
	{
		return "Student roll: "+sroll+" Sname : "+sname+" Department : "+department;
	}
	
}
