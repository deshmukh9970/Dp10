package com.oops.assignments.method;

import java.util.Scanner;

//12) write a java program to calculate cube for given number using no return type ,with return type,
//with parameter passing, with parameter and return type.

public class Cube {
	
	int num;
	int cube;
	public void cube1()
	{
		num=3;
		cube=num*num*num;
		System.out.println("Cube for No Parameter and No Return of Method : "+cube);
	}
	
	public int cube2()
	{
		num=4;
		return num*num*num;
	}
	
	public int cube3(int num)
	{
		this.num=num;
		return num*num*num;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	   Scanner sc=new Scanner(System.in);
	   System.out.println("Enter number : ");
	   int num=sc.nextInt();
	  
	     Cube obj=new Cube();
		 obj.cube1();
		
		int squareReturn=obj.cube2();
		System.out.println("Cube for No Parameter and Return type of Method :"+squareReturn);
      
		int squareParameterReturn=obj.cube3(num);
		System.out.println("Cube for passing Parameter and Return type of Method :"+squareParameterReturn);
		
	}


}
