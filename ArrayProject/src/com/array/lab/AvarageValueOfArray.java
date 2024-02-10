package com.array.lab;

import java.util.Arrays;
import java.util.Scanner;

//  2 WAP to accept dimension of 1D array and create and accept data in that array. 
//Calculate the average value of array elements

public class AvarageValueOfArray {
	
	static void avrageCheck(int arr[])
	{
		int sum=0;
		int avarage=0;
		for(int i=0;i<arr.length;i++)
		{
			sum=sum+arr[i];
			
		}
		avarage=sum/arr.length;
		System.out.println("Avarge of Array is : "+avarage);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Size");
		int size=sc.nextInt();
		
		int arr[]=new int[size];
		System.out.println("Enter elements : ");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		System.out.println(Arrays.toString(arr));
		avrageCheck(arr);
		sc.close();

	}

}
