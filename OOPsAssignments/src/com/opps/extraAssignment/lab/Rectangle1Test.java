package com.opps.extraAssignment.lab;

import java.util.Scanner;

public class Rectangle1Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Rectangle1 obj=new Rectangle1();
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Length : ");
		int  length=sc.nextInt();
		
		System.out.println("Enter b : ");
		int b=sc.nextInt();
		
		obj.setData(length, b);
		obj.display();

	}

}
