package com.array;

import java.util.Arrays;
import java.util.Scanner;

public class MinMaxNumberFind {
	
	  public static void minmaxCheck(int arr[])
	  {
		  int max=arr[0];
		  int min=arr[0];
		  for(int i=0;i<arr.length;i++)
		  {
			  if(max<arr[i])
			  {
				  max=arr[i];
			  }
			  else if(min>arr[i])
			  {
				  min=arr[i];
			  }
		  }
		  
		  System.out.println("Maxnumber is : "+max);
		  System.out.println("MinNumber is : "+min);
		  
	  }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Size ");
		int size=sc.nextInt();
		
		int arr[]=new int[size];
		
		System.out.println("Enter Element: ");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println(Arrays.toString(arr));
		
		minmaxCheck(arr);
		
		sc.close();

	}

}
