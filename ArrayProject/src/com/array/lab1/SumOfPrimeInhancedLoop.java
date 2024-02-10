package com.array.lab1;

import java.util.Arrays;
import java.util.Scanner;

public class SumOfPrimeInhancedLoop {
	


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
				
				//Inhanced Loop
				int sum=0;
				for(int x:arr)
				{
					if(checkPrime(x))
					{
						sum=sum+x;
						
					}
				}
				System.out.println("Sum "+sum);
				
				sc.close();

			}
	

}
