package com.array.inhancedloop;

public class DemoInhancedForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {4,8,9,6,3};
		
		//Display element this Refrance x to point arr
		//you can not update value or add value using scanne and not refer index
		for(int x:arr)
		{
			System.out.println(x);
		}
		
		///addtion
		int sum=0;
		for(int x:arr)
		{
			if(x%2==0)
			{
				sum=sum+x;
			}
		}
        System.out.println("Sum "+sum);
        
        int multi=1;
        for(int x:arr)
		{
        	multi=x*x*x;
			
		}
        System.out.println("Multi "+multi);
       
        
	}

}
