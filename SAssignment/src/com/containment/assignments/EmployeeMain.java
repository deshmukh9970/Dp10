package com.containment.assignments;

//4. Create Employee class which has attributes (id, name, salary, dept,
//mydate). Where dept and mydate is class, dept has (dept_id, dept_name)
//And mydate has (day, month, year).
//Display Employee information.
//Note. Containment using constructor and getter/setter

import java.util.Scanner;

public class EmployeeMain {
	
	static Scanner sc=new Scanner(System.in);
	
	public static void enterDetalis(Employee i)
	{
		System.out.println("Enter Employee Id : ");
		i.setId(sc.nextInt());
		
		System.out.println("Enter Employee Name : ");
		i.setName(sc.next());
		
		System.out.println("Enter Employee Salary : ");
		i.setSalary(sc.nextDouble());
		
		//Here Depart object Created 
		Depart d= new Depart();
		
		System.out.println("Enter Depart Id : ");
		d.setDept_id(sc.nextInt());
		
		System.out.println("Enter Depart Name : ");
		d.setDept_name(sc.next());
		
		//Here Depart passing all Data to Employee Constructor  of Depart
		i.setDepart(d);
		
		//Here Mydate object
		Mydate m= new Mydate();
		
		System.out.println("Enter Mydate Day : ");
		m.setDay(sc.nextInt());
		
		System.out.println("Enter Mydate Month : ");
		m.setMonth(sc.nextInt());
		
		System.out.println("Enter Mydate Year : ");
		m.setYear(sc.nextInt());
		
		//Here Mydate passing all Data to Employee Constructor  of Depart
	    i.setMydate(m);
		
		
		
	}
	
	
	public static void main(String[] args) {
		
       Employee e= new Employee();
       
       enterDetalis(e); // Here Employee object passing to static method of enterDetalis
       
       System.out.println(" Employee information : "+e);
       
       
       
		
	}

}
