package com.array.eillips;

public class RulesOfVarags {
	
//	you can not write two varges in method  only one
//	static void findSumUsingEllise(int ...arr,String ...)
//	{
//		int sum=0;
//		for(int x:arr)
//		{
//			sum=sum+x;
//		}
//		System.out.println("Sum : "+sum);
//	}
	
	static void findSumUsingEllise(int ...arr)
	{
		int sum=0;
		for(int x:arr)
		{
			sum=sum+x;
		}
		System.out.println("Sum : "+sum);
	}
	
//	//last of varge not first
//	static void findSumUsingEllise(int ...arr,int n1)
//	{
//		int sum=0;
//		for(int x:arr)
//		{
//			sum=sum+x;
//		}
//		System.out.println("Sum : "+sum);
//	}
	
	static void sfindSumUsingEllise(int n1,int ...arr)
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
		
		findSumUsingEllise(1,4,6,9);
		sfindSumUsingEllise(1,4,6,9);

	}

}
