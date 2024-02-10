package com.containment.assignments;

//(id, name, salary, dept,
//mydate).


public class Employee {
	
	private int id;
	private String name;
	private double salary;
	private Depart depart;
	private Mydate mydate;
	
	Employee()
	{
		
	}

	Employee(int id, String name, double salary, Depart depart, Mydate mydate) 
	{
	
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.depart = depart;
		this.mydate = mydate;
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

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public Depart getDepart() {
		return depart;
	}

	public void setDepart(Depart depart) {
		this.depart = depart;
	}

	public Mydate getMydate() {
		return mydate;
	}

	public void setMydate(Mydate mydate) {
		this.mydate = mydate;
	}

	
	public String toString() {
		return "Employee id=" + id + ", name=" + name + ", salary=" + salary + ", depart=" + depart + ", mydate="
				+ mydate;
	}
	
	
	
	
	

}
