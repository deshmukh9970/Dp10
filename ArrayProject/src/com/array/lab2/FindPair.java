package com.array.lab2;

import java.util.Arrays;

//Find the pair of elements whose sum is equivalent to the given sum

public class FindPair {
	
	static void checkPair(int arr[],int sum)
	{
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]+arr[j]==sum)
				{
					System.out.println(arr[i]+","+arr[j]);
				}
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {2,5,7,6,4,1,4,9,3};
		int sum=7;
		
		System.out.println(Arrays.toString(arr));
		checkPair(arr, sum);
		

	}

}