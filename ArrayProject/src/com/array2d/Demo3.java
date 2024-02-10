package com.array2d;

import java.util.Scanner;

public class Demo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
    // int arr[][]= new int[][] {{1,1,1},{2,2,2}}; //anonomis
		
		Scanner sc=new Scanner(System.in);
		
		int arr[][]=new int[2][2];
		
		//normal input passsing  
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Enter value row "+(i+1)+" :");
			for(int j=0;j<arr[i].length;j++)
			{
				arr[i][j]=sc.nextInt();
			}
			System.out.println();
		}
		
		
		
		//normal print 
				for(int i=0;i<arr.length;i++)
				{
					for(int j=0;j<arr[i].length;j++)
					{
						System.out.print(arr[i][j]+" ");
					}
					System.out.println();
				}

	}

}
