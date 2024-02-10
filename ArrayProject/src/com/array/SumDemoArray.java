package com.array;

public class SumDemoArray {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int []arr= {4,8,2,6};
		
		int sum=0;
		
		for(int i=0;i<arr.length;i++)
		{
			sum=sum+arr[i];
		}
		
		System.out.println("Array sum "+sum);

	}

}
