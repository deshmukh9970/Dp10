package com.array;

import java.util.Arrays;
import java.util.Scanner;

public class SumOfPrime {

	static boolean checkPrime(int num) {

		if (num <= 1) {
			return false;
		} else {
			for (int i = 2; i < num/2; i++) {
				if (num % 2 == 0) {
					return false;
				}
			}
		}
		return true;

	}

	public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter Size");
			
			int size=sc.nextInt();
			
			int arr[]=new int[size];
			
			System.out.println("Enter Element: ");
			for(int i=0;i<arr.length;i++)
			{
				arr[i]=sc.nextInt();
			}
			
			System.out.println(Arrays.toString(arr));
			int sum=0;
			for(int i=0;i<arr.length;i++)
			{
				if(checkPrime(arr[i]))
				{
					sum=sum+arr[i];
					
				}
			}
			System.out.println("Sum "+sum);
			
			sc.close();

		}
}