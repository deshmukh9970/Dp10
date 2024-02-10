package com.array;

public class DemoArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//int arr[]={10,25,54};   //complier automaticall add // new int[]
		//int arr[]=new int[]{10,25,54};  //you can also write this
		
		int []arr=new int[3];
		   
		
		
		arr[0]=10;
		arr[1]=25;
		arr[2]=54;
		// arr[3]=40; array out bond exception occur
		
		for(int i=0;i<arr.length;i++) // or for(int i=0;i<=arr.length-1;i++) Assign = of i<= that time length-1;
		{
			System.out.println(arr[i]);
		}
		

	}

}
