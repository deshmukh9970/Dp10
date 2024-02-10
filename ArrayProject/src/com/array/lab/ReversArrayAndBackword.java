package com.array.lab;

import java.util.Arrays;
import java.util.Scanner;

//5.  WAP to print reverse of an array. Also print every alternate element backwards

public class ReversArrayAndBackword {
	
	static void reversCheck(int arr[])
	{ 
		int a[]=new int[arr.length];
		for(int i=0;i<arr.length/2;i++)
		{
			int temp=arr[i];
			arr[i]=arr[arr.length-i-1];
			arr[arr.length-i-1]=temp;
		}
		
		
		for(int i=0;i<arr.length;i+=2)
		{
			System.out.println(arr[i]);
			
			a[i]=arr[i];
		}
		System.out.println(Arrays.toString(a));
		
		
	}

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size");
		int size=sc.nextInt();
		
		int arr[]=new int[size];
		System.out.println("Enter elements: ");
			for(int i=0;i<arr.length;i++)
			{
				arr[i]=sc.nextInt();
			}
			
			System.out.println(Arrays.toString(arr));
			reversCheck(arr);
			sc.close();
	}

}
