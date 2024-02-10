package com.array.lab2;

import java.util.Arrays;

//Merge the two arrays as follows
//ar1={1,2,3}
//ar2={4,5,6,7,8}
//o/p: mar1={1,4,2,5,3,6,7,8}
//mar2={1,5,3,7,8}

public class MargeArray {

	public static int[] arrayAlternative(int a[],int b[])
	{
		int len1=a.length;
		int len2=b.length;
		int mar[]=new int[len1+len2];
		int index=0;
		int i,j;
		for( i=0,j=0;i<a.length&& j<b.length;i++,j++)
		{
		   	mar[index++]=a[i];
		   	mar[index++]=b[j];
		}
		while(i<a.length)
		{
			mar[index++]=a[i++];
		}
		while(j<b.length)
		{
			mar[index++]=b[j++];
		}
		return mar;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr1[]= {1,2,3};
		int arr2[]={4,5,6,7,8};
		
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
		
		int m[]=arrayAlternative(arr1, arr2);
		System.out.println(Arrays.toString(m));
		

	}

}
