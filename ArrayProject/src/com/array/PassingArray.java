package com.array;

import java.util.Arrays;

public class PassingArray {
	
	static void suareElement(int arr[])
	{
		
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=arr[i]*arr[i];
		}
		System.out.println("Inside Method: ");
		System.out.println("Suare of Array "+Arrays.toString(arr));
	}
	
      void Element(int arr[])
	{
		
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=arr[i]*arr[i];
		}
		System.out.println("Inside Method: ");
		System.out.println("Suare of Array "+Arrays.toString(arr));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {4,9,8,7,4};
		System.out.println(Arrays.toString(a));
		System.out.println("==============================");
		suareElement(a);
		
		System.out.println("Anonimus arry");
		
		PassingArray p=new PassingArray();
		//System.out.println(""+p.Element(new int[]{1,2,3,4}));
		
		

	}

}
