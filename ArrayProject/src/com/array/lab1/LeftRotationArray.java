package com.array.lab1;

//4>> WAP to left rotate the array
//ar={1,2,3,4,5}
//o/p: {3,4,5,1,2}

import java.util.Arrays;

public class LeftRotationArray {

	static void rotatedOnce(int arr[])
	{
		int firstE=arr[0];
		
	
		for(int i=0;i<arr.length-1;i++)
		{
			arr[i]=arr[i+1];
		}
		
		arr[arr.length-1]=firstE; 
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {1,2,3,4,5};
		
		System.out.println(Arrays.toString(arr));
		System.out.println("=================================================");
		
		for(int i=0;i<2;i++)
		{
			rotatedOnce(arr);
			System.out.println(Arrays.toString(arr));
		}
		System.out.println("=================================================");
		
		System.out.println("Final Output ");
		System.out.println(Arrays.toString(arr));

	}


}
