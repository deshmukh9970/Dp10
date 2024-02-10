package com.oops.assignments.method;

import java.util.Scanner;

//write a java program to calculate square for given number using no return type ,with return type,
//with parameter passing, with parameter and return type.

public class Square {
	
	public void square1()
	{
		int i=2;
		int result=i*i;
		System.out.println("Square for No Parameter and No Return of Method : "+result);
	}
	
	public int square2()
	{
		int result=1;
		int i=4;
		result=i*i;
	    return result;
	}
	
	public int square3(int num)
	{
		
		int result=num*num;
	    return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	   Scanner sc=new Scanner(System.in);
	   System.out.println("Enter number : ");
	   int num=sc.nextInt();
	  
		Square obj=new Square();
		 obj.square1();
		
		int squareReturn=obj.square2();
		System.out.println("Square for No Parameter and Return type of Method :"+squareReturn);
      
		int squareParameterReturn=obj.square3(num);
		System.out.println("Square for passing Parameter and Return type of Method :"+squareParameterReturn);
		
	}

}
