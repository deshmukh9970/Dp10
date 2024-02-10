package com.array;

import java.util.Scanner;

public class DemoScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Size ");
		int size=sc.nextInt();
		
		int []arr=new int[size];
		
		System.out.println("Enter Elemnt:");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		//display 
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Arry "+arr[i]);
		}
		
       sc.close();
	}

}
