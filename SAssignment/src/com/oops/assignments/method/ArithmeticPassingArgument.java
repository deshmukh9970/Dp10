package com.oops.assignments.method;

import java.util.Scanner;

//Write java Program for arithmetic operation for each operation write separate Method using 
//parameter Passing

public class ArithmeticPassingArgument {
     int result;
	 public void add(int num1,int num2)
	    {
	    
	        result=num1+num2;
	        System.out.println("Addtion is : "+result);
	    }
	    public void sub(int num1,int num2)
	    {
	    
	        result=num1-num2;
	        System.out.println("Subtraction is : "+result);
	    }
	    public void multi(int num1,int num2)
	    {
	    
	        result=num1*num2;
	        System.out.println("Multiplication is : "+result);
	    }
	    public void div(int num1,int num2)
	    {
	    
	        result=num1/num2;
	        System.out.println("Division is : "+result);
	    }
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number1 : ");
		int num1=sc.nextInt();
		System.out.println("Enter Number2 : ");
		int num2=sc.nextInt();
		
		ArithmeticPassingArgument obj=new ArithmeticPassingArgument();
		
		obj.add(num1, num2);
		obj.sub(num1, num2);
		obj.multi(num1, num2);
		obj.div(num1, num2);
		
		

	}

}
