package com.array2d;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int row=3;
		int col=3;
		
		int arr[][]=new int[row][col];
		
		int no=1;
		
		//logic 
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				arr[i][j]=no;
				no++;
			}
		}
		
		//here printing
		
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
		//using inhanced loop
		System.out.println("inhanced loop");
		
		for(int i=0;i<row;i++)
		{
			for(int a:arr[i])
			{
				System.out.print(a+" ");
			}
			System.out.println();
		}
		
		

	}

}
