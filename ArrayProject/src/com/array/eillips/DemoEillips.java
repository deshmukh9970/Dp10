package com.array.eillips;

public class DemoEillips {
	
	static void findSum(int arr[])
	{
		int sum=0;
		for(int x:arr)
		{
			sum=sum+x;
		}
		System.out.println("Sum : "+sum);
	}
	
	
	static void findSumUsingEllise(int ...arr)
	{
		int sum=0;
		for(int x:arr)
		{
			sum=sum+x;
		}
		System.out.println("Sum : "+sum);
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {4,5,8};
		int b[]= {4,8};
		
		findSum(a);
		findSum(b);
		
		
		// Using eillsis pass direct value argement is not fixed 
		
		findSumUsingEllise(1,4,5);
		findSumUsingEllise(8,9);
		

	}

}