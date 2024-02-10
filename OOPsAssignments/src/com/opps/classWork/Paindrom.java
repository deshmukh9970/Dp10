package com.opps.classWork;

import java.util.Scanner;

public class Paindrom {
	
	public static boolean palindrom(int num)
	{
		int temp=num;
		int rev=0;
		
		while(num !=0)
		{
			int rem=num%10;
			rev=rev*10+rem;
			num=num/10;
			
		}
		return temp==num;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number : ");
		int n=sc.nextInt();
		
		
		if(palindrom(n))
		{
			System.out.println("Number is palindrom : "+n);
		}else
		{
			System.out.println("Number is Not Palindrom "+n);
		}

	}

}
