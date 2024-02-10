package com.array;

import java.util.Arrays;

public class EvenOdd {
	
	public static void evenoddNumber(int arr[])
	{
		int earr[]=new int[arr.length];	
		int oarr[]=new int[arr.length];	
		
		int index1=0;
		int index2=0;
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2==0)
			{
				earr[index1++]=arr[i];
			} 
			else
			{
				oarr[index2++]=arr[i];
			}
			
		}
		System.out.println("Aarry Even : "+Arrays.toString(earr));
		System.out.println("Array odd: "+Arrays.toString(oarr));
		
		
		
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		   int arr[]= {78,85,56,45,85,77,88,66}; 
		   evenoddNumber(arr);
		   
	}

}
