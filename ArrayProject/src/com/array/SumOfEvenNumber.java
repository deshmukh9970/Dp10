package com.array;

import java.util.Arrays;
import java.util.Scanner;

public class SumOfEvenNumber {
	
	
	static void sumOfnumber(int arr[])
	{
		int sumEven=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2==0)
			{
				sumEven=sumEven+arr[i];
				
			}
		}
		System.out.println(Arrays.toString(arr));
		System.out.println("Sum of even : "+sumEven);
	}

	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Size");
		int size=sc.nextInt();
		
		int []arr=new int[size];
		
		System.out.println("Enter Element : ");
		 for(int i=0;i<arr.length;i++)
		 {
			 arr[i]=sc.nextInt();
		 }
		 
		 sumOfnumber(arr);
	}

}
