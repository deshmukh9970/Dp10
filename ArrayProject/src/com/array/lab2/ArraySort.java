package com.array.lab2;

import java.util.Arrays;

public class ArraySort {
	
	static void checkArray(int arr[])
	{
		int index=0;
		int temp[]=new int[arr.length];
		
		
		for(int i=(arr.length/2)+1;i<arr.length;i++)
		{
			temp[index++]=arr[i];
			
		}
		
		for(int i=1;i<(arr.length/2)-1;i++)
		{
			temp[index++]=arr[i];
		}
		
		
	
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {4,1,3,9,7,5,6};
		//System.out.println(Arrays.toString(arr));
		
		checkArray(arr);
		System.out.println(Arrays.toString(arr));

	}

}
