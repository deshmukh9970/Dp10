package com.array.lab2;

import java.util.Arrays;

//Find a continuous sub array whose sum is equal to given number. 
//e.g. if given array is { 12 ,4, 2, 10 , 5 , 1 }  
//and given number is 16 then sum of subarray { 4,2,10} and {10, 5,1},{12,4} is
// equal to given number.

public class SubArray {
	
	static void checkArry(int arr[],int sum )
	{
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				
				for(int k=j+1;k<arr.length;k++)
				{
					if(arr[i]+arr[j]+arr[k]==sum)
					{
						System.out.println("{"+arr[i]+","+arr[j]+","+arr[k]+"}");
					}
				}
				
				if(arr[i]+arr[j]==sum)
				{
					System.out.println("{"+arr[i]+","+arr[j]+"}");
				}
				
				
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]={ 12 ,4, 2, 10 , 5 , 1 };
		int sum=16;
		
		System.out.println(Arrays.toString(arr));
		
		checkArry(arr, sum);
		
		

	}

}
