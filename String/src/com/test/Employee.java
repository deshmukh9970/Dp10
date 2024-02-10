package com.test;

public class Employee {

	private int eid;
	private String ename;
	private Department department;
	
	Employee()
	{
		
	}
	
	public Employee(int eid, String ename, Department department) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.department = department;
	}
	
	



	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}
	
	

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", department=" + department + "]";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee e=new Employee(1, "amar", new Department(101, "IT"));
		Employee e1=new Employee(2, "Xyz", new Department(101, "ENTC"));
		Employee e2=new Employee(3, "abc", new Department(101, "Scaince"));
		
		System.out.println(e1);
		System.out.println(e);
		System.out.println(e2);
		

	}
	
	

}
