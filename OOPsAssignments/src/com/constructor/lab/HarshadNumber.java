package com.constructor.lab;

import java.util.Scanner;

// 153 is divisible by sum of this digit is called HarshadNumber;

public class HarshadNumber {
	int onum;
	HarshadNumber(int onum)
	{
		this.onum=onum;
	}
	
	public boolean checkNumber()
	{
		int num=onum;
	     int temp=num;
	     int sum=0;
	     while(num!=0)
	     {
	    	 int rem=num%10;
	    	 sum=sum+rem;
	    	 num=num/10;
	     }
	     
	     if(temp%sum==0)
	     {
	    	 return true;
	     }
	     else {
	    	 return false;
	     }
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number ");
		int n=sc.nextInt();
		HarshadNumber obj=new HarshadNumber(n); //156 is hardshad
		
		if(obj.checkNumber())
		{
			System.out.println(obj.onum+" is HarshadNumber");
		}else {
			System.out.println(obj.onum+" Not HarshadNumber");
		}

	}

}
