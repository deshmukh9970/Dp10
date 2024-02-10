package com.array;

import java.util.Arrays;
import java.util.Scanner;

public class SuqareAndCube {
	
	 public static void suqare(int arr[])
	 {
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=arr[i]*arr[i];
		}
		System.out.println("After Square ");
		System.out.println(Arrays.toString(arr));
	 }
	 
	 public static void cubeNumber(int arr[])
	 {
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=arr[i]*arr[i]*arr[i];
		}
		System.out.println("After cube  ");
		System.out.println(Arrays.toString(arr));
	 }

	public static void main(String[] args) {
		
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter Size");
		int size=sc.nextInt();
		
		int arr[]=new int[size];
		
		System.out.println("Enter Element: ");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		System.out.println(Arrays.toString(arr));
		
		System.out.println("Enter Choice");
		System.out.println("1.Square ");
		System.out.println("2.Cube ");
		 
		char userChoice=sc.next().charAt(0);
		
		switch(userChoice)
		{
		case '1':
			suqare(arr);
			break;
		case '2':
			cubeNumber(arr);
			break;
	     default:
	    	 System.out.println("Invalid choice");
		}
		
		sc.close();

	}

}
