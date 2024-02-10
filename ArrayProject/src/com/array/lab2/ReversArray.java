package com.array.lab2;

import java.util.Arrays;

//Write a program to reverse an array in following manner.
//Suppose array size is even then later half should come first and first half 
//should go last. E.g. input array { 1,2,5,7,3,4} output will be { 7,3,4, 1,2,5}. 
//If array size is even then middle element should remain as it is and array will be
//reversed as above. E.g. input array { 5,22,55,21,4,54,10} output will be {4,54,10,21,5,22,55}


public class ReversArray {
	
	static void evenOddRevers(int arr[])
	{
		int index=0;
		int temp[]=new int[arr.length];
		
		for(int i=arr.length/2;i<arr.length;i++)
		{
			temp[index++]=arr[i];
			//System.out.println(arr[i]);
		}
		
		for(int i=0;i<arr.length/2;i++)
		{
			temp[index++]=arr[i];
			//System.out.println(arr[i]);
		}
	
		System.out.println(Arrays.toString(temp));
		
	}
	
	
	static void arrayRever(int arr[])
	{
		int index=0;
		int temp[]=new int[arr.length];
		
		for(int i=(arr.length/2)+1;i<arr.length;i++)
		{
			temp[index++]=arr[i];
			//System.out.println(arr[i]);
		}
		temp[index++]=arr[arr.length/2];
		
		for(int i=0;i<arr.length/2;i++)
		{
			temp[index++]=arr[i];
			//System.out.println(arr[i]);
		}
	
		System.out.println(Arrays.toString(temp));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]={ 1,2,5,7,3,4};
		System.out.println(Arrays.toString(arr));
		
		evenOddRevers(arr);
		
		int arr2[]={ 5,22,55,21,4,54,10};
		
		System.out.println(Arrays.toString(arr2));
		arrayRever(arr2);
		

	}

}
