package com.opps.classWork;

public class EmployeeTest {
	

      

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee e1=new Employee();
		System.out.println(e1);
		
		Employee e2=new Employee(101,"xyz");
		System.out.println(e2);
		e2.setSalary(52222);
		System.out.println(e2);
		
		Employee e3=new Employee(101,"xyz",12550);
		System.out.println(e3);
		e3.setSalary(58822);
		System.out.println(e3);

	}

}
