package com.array.lab;

import java.util.Arrays;
import java.util.Scanner;

// Traverse the array and find the sum of odd elements in an array

public class SumOfOddNumber {
	
	 static void oddNumber(int arr[])
	 {
		 int sum=0;
		 for(int i=0;i<arr.length;i++)
		 {
			 if(arr[i]%2 !=0 )
			 {
				 sum=sum+arr[i];
			 }
		 }
		 System.out.println("Sum of Odd Number : "+sum);
		 System.out.println(Arrays.toString(arr));
	 }
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Size");
		int size=sc.nextInt();
		
		int arr[]=new int[size];
		
		System.out.println("Enter element : ");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		oddNumber(arr);
		
		sc.close();
		

	}

}
