package com.polymorprisam.lab;

//eid, empName, salary and department
public class Employee {
	
	private int eid;
	private String empNmae;
	private double salary;
	private Department department;
	
	Employee()
	{
		
	}
	
	Employee(int eid,String empName,double salary,Department department)
	{
		this.eid=eid;
		this.empNmae=empName;
		this.salary=salary;
		this.department=department;
		
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getEmpNmae() {
		return empNmae;
	}

	public void setEmpNmae(String empNmae) {
		this.empNmae = empNmae;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	@Override
	public String toString() {
		return "Employee eid=" + eid + ", empNmae=" + empNmae + ", salary=" + salary + ", department=" + department
				;
	}
	
	
	
	
	
	
	

}
