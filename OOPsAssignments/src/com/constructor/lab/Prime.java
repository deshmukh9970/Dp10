package com.constructor.lab;

import java.util.Scanner;

public class Prime {
  
	 int num;
	 
	 Prime(int num)
	 {
		this.num=num;
	 }
	 
	 

	 
	 public boolean check()
	 {
		 
			int count=0;
			for(int i=1;i<=num;i++)
			{
				
				for(int j=2;j<=i;j++)
				{
					if(i%j==0)
					{
						count++;
					}
	    		}
				
				
			}
			
			if(count==1)
			{
				return true;
			}else
			{
				return false;
			}
 
		 
		
	
	 }
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter Number : ");
//		int n=sc.nextInt();
		
		//int num =10;
		Prime obj=new Prime(10);
		
		if(obj.check())
		{
			System.out.println("prime");
		}else {
			System.out.println("prime not");
		}
		
		
		
		

		
		
		
	}

}
