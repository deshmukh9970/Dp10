package com.array.shift;

import java.util.Arrays;

public class ShitLogicZero {
	
	static void shiftzeroEnd(int arr[])
	{
		int count=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]!=0)
			{
				arr[count]=arr[i];
				count++;
			}
		}
		
		while(count<arr.length)
		{
			arr[count++]=0;
		}
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {1,4,0,4,0,8,6};
		
		System.out.println(Arrays.toString(arr));
		
		shiftzeroEnd(arr);
		System.out.println(Arrays.toString(arr));

	}

}
