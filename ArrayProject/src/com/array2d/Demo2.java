package com.array2d;

public class Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[][]= {{1,1,1},{2,2,2}};
		
		//normal print 
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
		//inhaed print 
		System.out.println("-----------------------------------");
		for(int i=0;i<arr.length;i++)
		{
			for(int a:arr[i])
			{
				System.out.print(a+" ");
			}
			System.out.println();
		}
		

	}

}
