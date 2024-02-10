package com.array.objects2;

import java.util.Scanner;

public class StudentUseInput {
	
	static Scanner sc=new Scanner(System.in);
	
	static void enterDetalis(Student s)
	{
		System.out.println("Enter Student id : ");
		s.setSid(sc.nextInt());
		
		System.out.println("Enter Student Name : ");
		s.setSname(sc.next());
		
		System.out.println("Enter marks of 3 subject");
		double m[]=new double[3];
		
		for(int i=0;i<m.length;i++)
		{
			System.out.println("Subject "+(i+1)+":");
			m[i]=sc.nextDouble();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
