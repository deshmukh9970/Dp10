package com.containment.assignments;

//1. WAP to have Department class created with id, name . Student class has
//roll, name and Department object should have id and name. Assign and
//print individual values in main method


public class Department {
	
	private int did;
	private String dname;
	
	Department()
	{
		
	}

	Department(int did,String dname)
	{
		
	}
	
	public void setDid(int did)
	{
		this.did=did;
	}
	
	public int  getDid()
	{
		return did;
	}
	
	public void setDname(String dname)
	{
		this.dname=dname;
	}
	
	public String getDname()
	{
		return dname;
	}
	
	public String toString()
	{
		return "Deparment Id"+did+"\t Name"+dname;
	}
}
