package com.array.bubblesort;

import java.util.Arrays;

public class DemoSortArray {
	
	
	static void sortArray(int arr[])
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("i "+i);
			System.out.println("arr[i] "+arr[i]);
			for(int j=i+1;j<arr.length;j++)
			{
				System.out.println("arr[j] "+arr[j]);
				if(arr[j]<arr[i])
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
				System.out.println("j "+j);
				System.out.println("arr[j] "+arr[j]);
				System.out.println("after arr[i] "+arr[i]);
			} 
			
		}
	} 
	
	
	public static void main(String[] args) {
		
		int arr[]= {9,7,1,5,2,4};
		
		System.out.println("After Sorting:");
		System.out.println(Arrays.toString(arr));
		
		sortArray(arr);
		
		System.out.println("Before Sorting:");
		System.out.println(Arrays.toString(arr));
		
	}

}
