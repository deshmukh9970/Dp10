package com.array.bubblesort;

import java.util.Arrays;

public class SecondHighestNumberWithoutSort {
	
	static int findSceondHigh(int arr[])
	{
		int h=Integer.MIN_VALUE;
		int sh=Integer.MIN_VALUE;
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>h)
			{
				sh=h;
				h=arr[i];
			}
			else if(arr[i]>sh)
			{
				sh=arr[i];
			}
		}
		
		return sh;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {4,2,3,8,1,9};
		
		
		System.out.println(Arrays.toString(arr));
		int shight=findSceondHigh(arr);
		System.out.println("Second High: "+shight);

	}

}
