package com.array;

import java.util.Arrays;

public class TestArray {
	
//	public static void sortArryStart(int arr[])
//	{
//		int count=0;
//		int i;
//		for(i=0;i<arr.length;i++)
//		{
//			
//			if(arr[i] !=0)
//			{
//				arr[count]=arr[i];
//				count++;
//			}
//		}
//		while((count<arr.length))
//		{
//			arr[count]=0;
//			count++;
//		}
//		
//		System.out.println(Arrays.toString(arr));
//	}
	
//	public static void arraySort(int arr[])
//	{
//		int count=arr.length-1;
//		for(int i=arr.length-1;i>=0;i--)
//		{
//			
//			if(arr[i] !=0)
//			{
//				arr[count]=arr[i];
//				count--;
//			}
//		}
//		while(count>=0)
//		{
//			arr[count]=0;
//		    count--;
//		}
//		
//		
//		System.out.println(Arrays.toString(arr));
//	}
	
	public static void evenSort(int arr[])
	{
		//int temp=0;
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("i = "+i);
			for(int j=i+1;j<arr.length;j++)
			{
			if(arr[i] % 2 !=0)
			{ 
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
			System.out.println("j  : "+Arrays.toString(arr));
			}
		}
//		for(int i=arr.length/2;i<arr.length;i++)
//		{
//			if(i%2 !=0)
//			{
//				System.out.println(arr[i]);
//			}
//		}
		System.out.println(Arrays.toString(arr));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//int arr[]= {2,4,0,8,0,7};
		//System.out.println(Arrays.toString(arr));
		
		int a[]= {9,2,7,4,3,8};
		System.out.println(Arrays.toString(a));
		
		//sortArryStart(arr);
		//arraySort(arr);
		
		evenSort(a);

	}

}
