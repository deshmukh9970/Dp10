package com.oops.assignments.method;

import java.util.Scanner;

//8)Write java Program for arithmetic operation for each operation write separate Method.

public class ArithmeticSeparateMethod {
	int num1=45;
    int num2=20;
    int  result;
	
    public void add()
    {
    
        result=num1+num2;
        System.out.println("Addtion is : "+result);
    }
    public void sub()
    {
    
        result=num1-num2;
        System.out.println("Subtraction is : "+result);
    }
    public void multi()
    {
    
        result=num1*num2;
        System.out.println("Multiplication is : "+result);
    }
    public void div()
    {
    
        result=num1/num2;
        System.out.println("Division is : "+result);
    }
	public static void main(String[] args) {
		
    
		ArithmeticSeparateMethod obj= new ArithmeticSeparateMethod();
		
		obj.add();
		obj.sub();
		obj.multi();
		obj.div();


	}

}
