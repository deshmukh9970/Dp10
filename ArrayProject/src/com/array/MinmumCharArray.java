package com.array;

import java.util.Arrays;

public class MinmumCharArray {
	
	public static void mincharArray(char arr[])
	{
		char min=arr[0];
		for(int i=0;i<arr.length;i++) 
		{
			if(min>arr[i])
			{
				min=arr[i];
			}
		}
		System.out.println("Minmum Char : "+min);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char arr[]= {'z','c','k','l'};
		System.out.println(Arrays.toString(arr));
		
		 mincharArray(arr);
		 

	}

}
