package com.employee.crud;

import java.util.Scanner;

public class EmployeeImplimentation implements EmployeeInterface {
	
	
	Scanner sc = new Scanner(System.in);
	Employee e[] = new Employee[5];
	int id;
	double salary;
	String name;
	int count = 0;

	int size = 0;

	@Override
	public void add() {
		// TODO Auto-generated method stub
		
		System.out.println("Enter the Number Employee :");
		size = sc.nextInt();
		for (int i = 0; i < size; i++) {
			System.out.println("Enter Employee Id :");
			id = sc.nextInt();
			System.out.println("Enter Employee Name :");
			name = sc.next();
			System.out.println("Enter Employee Salary :");
			salary = sc.nextDouble();

			e[count] = new Employee(name,id,salary);
			count++;
		}

		
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		
		System.out.println("Update Employee");
		   System.out.println("Enter Employee id you want to update");
		   id=sc.nextInt();
		   for(int i=0;i<count;i++)
		   {
			   if(e[i]!=null && e[i].getId()==id)
			   {
				  System.out.println("Enter Salary you want to update");
				  salary=sc.nextInt();
				  e[i].setSalary(salary);
				
				  
			   }
		   }
		   System.out.println("succesfully Updated");
		
	}

	@Override
	public void search() {
		// TODO Auto-generated method stub
		
		System.out.println();
		System.out.println("Enter the Name Of Employee:");
		name = sc.next();
		for (int i = 0; i < count; i++) {
			if (e[i] != null && e[i].getName().equals(name))
				System.out.println(e[i]);
		}

		
	}

	@Override
	public void delete() {
		// TODO Auto-generated method stub
		
		System.out.println(" Deleted the Employee");
 	   System.out.println("Enter the Employee id: ");
 	    id=sc.nextInt();
 	    
     for(int i=0;i<count;i++)
     {
 	   if(e[i]!=null && e[i].getId()==id)
 	   {
 		   e[i]=null;
 	   }
     } 
     System.out.println("Student Record Deleted succesfully");
		
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		
		for (int i = 0; i < count; i++) {
			System.out.println(e[i]);
		}
		
	}

}
