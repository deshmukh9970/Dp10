package com.employee.crud;

import java.util.Scanner;

public class EmployeeMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice;

		EmployeeImplimentation e1 = new EmployeeImplimentation();

		while (true) {
			System.out.println("1.Add Books     :");
			System.out.println("2.Update Books  :");
			System.out.println("3.Search Books  :");
			System.out.println("4.Delete Books  :");
			System.out.println("5.Display Books :");
			System.out.println("6.exit");
			System.out.println("Enter Your Choice :");
			choice = sc.nextInt();
			switch (choice) {
			case 1:
				e1.add();
				break;
			case 2:
				e1.update();
				break;
			case 3:
				e1.search();
				break;
			case 4:
				e1.delete();
				break;
			case 5:
				e1.display();
				break;
			case 6:
				System.exit(0);
			default:
				break;
			}
			
			
		}
		
		
	}

}