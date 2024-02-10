package com.array2d.transpoe;

import java.util.Scanner;

public class demo {
	
	 static int[][] tranArray(int arr[][],int row,int col)
	 {
		//1st logic changed col and row position
		 int tr[][]=new int[col][row];
		 
		 for(int i=0;i<arr.length;i++)
			{
				for(int j=0;j<arr[i].length;j++)
				{
					tr[j][i]=arr[i][j];  //here store tr  j and arr i into i and j
				}
				
			}
		 
		 
		 
		 return tr;
	 }
	

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
		
		System.out.println("--------------------------------");
		
		int trans[][]=tranArray(arr, row, col);
		
		//System.out.println(trans);
		

	}

}
