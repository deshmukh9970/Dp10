package com.array;

import java.util.Arrays;

public class ReplaceNegative {
	
	static void negativeReplace(int arr[])
	{
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<0)
			{
				arr[i]=0;
			}
		}
		System.out.println(Arrays.toString(arr));
	}
	

	public static void main(String[] args) {
		
		int arr[]= {4,-1,9,-1,2};
		
		System.out.println("Array is ");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+", ");
		}
		System.out.println("");
		
		System.out.println("Array is After replacing ");
		
		negativeReplace(arr);
	}

}
