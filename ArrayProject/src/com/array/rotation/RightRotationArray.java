package com.array.rotation;

import java.util.Arrays;

public class RightRotationArray {
	
	static void rotatedOnce(int arr[])
	{
		int lastE=arr[arr.length-1];// Store in last element
		
		//shift to revers or left
		for(int i=arr.length-1;i>0;i--)
		{
			arr[i]=arr[i-1];
		}
		
		arr[0]=lastE; // here place to store last elements at the first
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {1,2,3,4,5};
		
		System.out.println(Arrays.toString(arr));
		System.out.println("=================================================");
		
		for(int i=0;i<3;i++)
		{
			rotatedOnce(arr);
			System.out.println(Arrays.toString(arr));
		}
		System.out.println("=================================================");
		
		System.out.println("Final Output ");
		System.out.println(Arrays.toString(arr));

	}

}
