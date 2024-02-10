package com.array.pair;

import java.util.Arrays;

public class SumofPairFind {
	
	static void findPair(int arr[],int fsum)
	{
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]+arr[j]==fsum)
				{
					System.out.println(arr[i]+","+arr[j]);
				}
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  int arr[]= {5,4,6,9,8,1,4,2};
		  int fsum=7;
		  
		  System.out.println(Arrays.toString(arr));
		  
		  findPair(arr,fsum);
		  
	}

}
