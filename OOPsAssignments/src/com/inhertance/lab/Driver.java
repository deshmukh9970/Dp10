package com.inhertance.lab;

//Task 1> Create a class Car having carNo, brand, model
//every Car is alloted a Driver having driverid, name, adharNo, salary
//We have a Taxi system , Create class where each Car is alloted one driver 
//  > Create an anoymous driver which is been alloted to a car for just one day
//  > Create 3 car having a driver each (taking user input)
//Print the details of car along with the driver

public class Driver {
	
	private int driverid;
	private String name;
	private long  adharNo;
	private double salary;
	
	Driver()
	{
		
	}
	
	Driver( int driverid,String name,long  adharNo,double salary)
	{
		this.driverid=driverid;
		this.name=name;
		this.adharNo=adharNo;
		this.salary=salary;
		
	}
	
	public void setDriverid(int driverid)
	{
		this.driverid=driverid;
	}
	
	public int getDriverid()
	{
		return driverid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getAdharNo() {
		return adharNo;
	}

	public void setAdharNo(long adharNo) {
		this.adharNo = adharNo;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public String toString()
	{
		return "Driver Id "+driverid+" "+name+" "+adharNo+" "+salary;
	}
	
	
	
	

}
