package com.array.lab1;

import java.util.Arrays;

//1>> WAP to half sort the array in ascending and half in descending

public class SortArrayAscendingDecending {
	
	static void sortAscending(int arr[])
	{
		for(int i=0;i<arr.length/2;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[j]<arr[i])
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			} 
		}
		
		
	}
	
	static void sortDscending(int arr[])
	{
		for(int i=0;i<arr.length/2;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[j]>arr[i])
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			} 
		}
		
		
	}
	
	static void sortAscendingDecending(int arr[])
	{
		for(int i=0;i<arr.length/2;i++)
		{
			for(int j=i+1;j<arr.length/2;j++)
			{
				if(arr[j]<arr[i])
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		for(int i=arr.length/2;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[j]>arr[i])
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {9,4,2,6,1,5,8,3};
		
		System.out.println(Arrays.toString(arr));
		
//		sortAscending(arr);
//		System.out.println("HAlf is Ascending");
//		System.out.println(Arrays.toString(arr));
//		
//		sortDscending(arr);
//		
//		System.out.println("HAlf is Descending");
//		System.out.println(Arrays.toString(arr));
		
		sortAscendingDecending(arr);
		System.out.println("Ascending Half and decending Half: ");
		System.out.println(Arrays.toString(arr));
		
		

	}

}
