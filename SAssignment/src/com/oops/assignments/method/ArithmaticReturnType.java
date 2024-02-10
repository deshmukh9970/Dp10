package com.oops.assignments.method;

import java.util.Scanner;

//Write java Program for arithmetic operation for each operation write separate Method using 
//parameter Passing and return type
public class ArithmaticReturnType {
	
	 int result;
	 public int add(int num1,int num2)
	    {
	    
	        result=num1+num2;
	        return result;
	    }
	    public int sub(int num1,int num2)
	    {
	    
	        result=num1-num2;
	        return result;
	        
	    }
	    public int multi(int num1,int num2)
	    {
	    
	        result=num1*num2;
	        return result;
	    }
	    public int div(int num1,int num2)
	    {
	    
	        result=num1/num2;
	        return result;
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number1 : ");
		int num1=sc.nextInt();
		System.out.println("Enter Number2 : ");
		int num2=sc.nextInt();
		
		ArithmaticReturnType obj=new ArithmaticReturnType();
		
	   int addResult=obj.add(num1, num2);//passing Scanner value And store Return type value in addResult
	   System.out.println("Addtion is : "+addResult);//print return value of add
	   
		int subResult=obj.sub(num1, num2);
		System.out.println("Subtraction is : "+subResult);
		
		int multiResult=obj.multi(num1, num2);
		System.out.println("Multiplication is : "+multiResult);
		
		int divtiResult=obj.div(num1, num2);
		System.out.println("Division is : "+divtiResult);
		

	}

}
