package com.inhertance;

	

public class Student {
	
	private String sname;
	
	
	
    Student(String sname) 
    {
		this.sname=sname;
		
	}
    
   

	public String getSname() {
		return sname;
	}


	public void setSname(String sname) {
		this.sname = sname;
	}


	@Override
	public String toString() {
		return "Student sname=" + sname;
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
