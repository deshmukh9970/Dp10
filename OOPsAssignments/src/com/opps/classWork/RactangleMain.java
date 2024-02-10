package com.opps.classWork;

import java.util.Scanner;

public class RactangleMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Reactangle obj=new Reactangle();
		
		obj.setMethod(4, 2);
		obj.display();
		
	// using scanner 	
		Reactangle obj1=new Reactangle();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter l : ");
		int l=sc.nextInt();
		
		System.out.println("Enter b : ");
		int b=sc.nextInt();
		
		obj1.setMethod(l, b);
		obj1.display();
		
//		int ares=obj.calArea();
//		int peris=obj.calPerimeter();
		
//		System.out.println("Area  :"+ares);
//		System.out.println("peri :"+peris);

	}

}
