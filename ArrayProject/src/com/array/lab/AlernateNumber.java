package com.array.lab;

import java.util.Arrays;
import java.util.Scanner;

public class AlernateNumber {
	
	static void alternateNumberCheck(int arr[])
	{
		
		for(int i=0;i<arr.length;i+=2)
		{
		   
			System.out.println(arr[i]);
		}
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
		alternateNumberCheck(arr);
		
		sc.close();

	}

}
