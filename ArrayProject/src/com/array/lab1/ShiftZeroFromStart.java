package com.array.lab1;

import java.util.Arrays;

public class ShiftZeroFromStart {
	
	static void shiftzeroEnd(int arr[])
	{
		int count=arr.length-1;
		for(int i=0;i<arr.length-1;i++)
		{
			if(arr[i]!=0)
			{
				arr[count]=arr[i];
				count--;
			}
		}
		
		while(count>=0)
		{
			arr[count--]=0;
		}
		System.out.println(Arrays.toString(arr));
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {4,8,0,2,0,5,6};
		
		System.out.println(Arrays.toString(arr));
		shiftzeroEnd(arr);
		

	}

}
