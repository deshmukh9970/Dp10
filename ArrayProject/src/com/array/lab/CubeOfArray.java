package com.array.lab;

import java.util.Arrays;

// Print cube of each number in array

import java.util.Scanner;

public class CubeOfArray {

	static void cubeCalulet(int arr[]) 
	{
         for(int i=0;i<arr.length;i++)
         {
        	 arr[i]=arr[i]*arr[i]*arr[i];
        	 
         }
         System.out.println("With cube array");
         System.out.println(Arrays.toString(arr));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Size");
		int size = sc.nextInt();

		int arr[] = new int[size];

		System.out.println("Enter Element : ");
		for (int i = 0; i < arr.length; i++) 
		{
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Array without cube ");
		System.out.println(Arrays.toString(arr));
		cubeCalulet(arr);
		
		sc.close();

	}

}
