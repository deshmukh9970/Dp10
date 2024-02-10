package com.array2d.transpoe;

import java.util.Scanner;

public class SumOfRow {
	
	static void display(int arr[][])
	 {
		 for(int i=0;i<arr.length;i++)
			{
				for(int j=0;j<arr[i].length;j++)
				{
					System.out.print(arr[i][j]+" ");
				}
				System.out.println();
			}
	 }

	 static int calRowSum(int[] row)
	 {
		 int sum=0;
		 for(int x:row)
		 {
			 sum=sum+x;
			 
		 }
		 return sum;
	 }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
     Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter row");
		int row=sc.nextInt();
		
		System.out.println("Enter col");
		int col=sc.nextInt();
		
		int arr[][]=new int[row][col];
		
		//input passing 
		for(int i=0;i<arr.length;i++)
  		{
  			System.out.println("Enter value row "+(i+1)+" :");
  			for(int j=0;j<arr[i].length;j++)
  			{
  				arr[i][j]=sc.nextInt();
  			}
  			System.out.println();
  		}
		
		
		display(arr);
		
		for(int i=0;i<row;i++)
		{
			int rows=calRowSum(arr[i]);
			System.out.println("Sum of row "+(i+1)+" = "+rows);
		}
		

	}

}
