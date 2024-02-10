package com.array.lab1;

// Find the second minimum number in an array without sorting

import java.util.Arrays;

public class SecondMinumumHightNumberWithoutSorting {
	
	static int findMinSceondHigh(int arr[])
	{
		int h=Integer.MAX_VALUE;
		int sh=Integer.MAX_VALUE;
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<h)
			{
				sh=h;
				h=arr[i];
			}
			else if(arr[i]<sh)
			{
				sh=arr[i];
			}
		}
		
		return sh;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {4,8,5,7,9,2,6};
		
		System.out.println(Arrays.toString(arr));
		int mins=findMinSceondHigh(arr);
		
		System.out.println("Second Minimum :"+mins);

	}

}
