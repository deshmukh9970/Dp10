package com.array.lab;

import java.util.Arrays;
import java.util.Scanner;

// Find the maximum number in an array

public class MaximumNumberOfArray {
	
	static void maxNumber(int arr[])
	{
		int max=arr[0];
		for(int i=0;i<arr.length;i++)
		{
		    if(max<arr[i])
		    {
		    	max=arr[i];
		    }
			
		}
		System.out.println("Max : "+max);
	}

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Size");
		int size=sc.nextInt();
		
		int arr[]=new int[size];
		System.out.println("Enter Elements : ");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		System.out.println(Arrays.toString(arr));
		
		maxNumber(arr);
		sc.close();

	}

}
