package com.array.lab;

import java.util.Arrays;
import java.util.Scanner;

//Search the element in an array

public class SearchElement {
	
	static boolean searchNumber(int arr[],int ele)
	{
		boolean flag=false;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==ele)
			{
				flag=true;
				break;
			}
		}
		
		return flag;
	}

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Size");
		
		int size=sc.nextInt();
		
		int arr[]=new int[size];
		
		System.out.println("Enter Element: ");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		System.out.println("Which element is Search : ");
		int ele=sc.nextInt();
		
		
		
		if(searchNumber(arr,ele))
		{
			System.out.println("Element is Found");
		}
		else
		{
			System.out.println("Element is not Found");
		}
		
		
		System.out.println(Arrays.toString(arr));
		
		sc.close();
		

	}

	

}
