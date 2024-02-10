package com.array.lab;

import java.util.Arrays;
import java.util.Scanner;

// Reverse the array

public class ReversArray {
	
	
	static void reversNumber(int arr[])
	{
		
	  
		for(int i=0;i<arr.length/2;i++)
		{
			int temp=arr[i];
			arr[i]=arr[arr.length-i-1];
			arr[arr.length-i-1]=temp;
			
        

		}
		System.out.println("After revers array");
		System.out.println(Arrays.toString(arr));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Size");
		
		int size=sc.nextInt();
		
		int arr[]=new int[size];
		
		System.out.println("Enter Element: ");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		System.out.println(Arrays.toString(arr));
          
		reversNumber(arr);
		sc.close();
		
	}

}
