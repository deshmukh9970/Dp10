package com.array.lab;

import java.util.Arrays;
import java.util.Scanner;

//6.  Write two methods that return the average of an array with following headers.
//a.  public static int average(int[] array)
//b.  public static double average(double[] array).
//c.  Write main and invoke the 2 methods.

public class TwoMethodAvarage {
	
	public static int averageIntCheck(int arr[])
	{
		int sum=0;
		int avg=0;
		for(int i=0;i<arr.length;i++)
		{
		    sum=sum+arr[i];	
		}
		
		avg=sum/arr.length;
		return avg;
	}
	
	public static double averageDoubleCheck(double arr[])
	{
		double sum=0;
		double avg=0;
		for(int i=0;i<arr.length;i++)
		{
		    sum=sum+arr[i];	
		}
		
		avg=sum/arr.length;
		return avg;
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		   Scanner sc=new Scanner(System.in);
		   
		   System.out.println("Enter Size");
		   int size=sc.nextInt();
		   int arr[]=new int[size];
		   
		   System.out.println("Enter Elements");
		   for(int i=0;i<arr.length;i++)
		   {
			   arr[i]=sc.nextInt();
		   }
		   
		   double a[]= {1.4,54.4,60.8,9.4,};
		   
		   System.out.println(Arrays.toString(arr));
		   
		   System.out.println("int Avrage : "+averageIntCheck(arr));
		   System.out.println("double Avrage : "+averageDoubleCheck(a));
		   
		   sc.close();
	}

}
