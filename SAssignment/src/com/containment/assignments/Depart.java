package com.containment.assignments;

//(dept_id, dept_name)

public class Depart {
	
	private int dept_id;
	private String dept_name;
	
	Depart()
	{
		
	}

    Depart(int dept_id, String dept_name) 
    {
		
		this.dept_id = dept_id;
		this.dept_name = dept_name;
	}

	public int getDept_id() {
		return dept_id;
	}

	public void setDept_id(int dept_id) {
		this.dept_id = dept_id;
	}

	public String getDept_name() {
		return dept_name;
	}

	public void setDept_name(String dept_name) {
		this.dept_name = dept_name;
	}

	
	public String toString() {
		return "Depart dept_id=" + dept_id + ", dept_name=" + dept_name;
	}
    
    
	
	

}
