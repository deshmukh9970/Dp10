package com.array;

public class OccuranceElement {

	static boolean searchOfElement(int arr[],int ele)
	{
		boolean  flag=false;
		//travers
		int count=0;
		for(int i=0;i<arr.length;i++)
		{
			//compare
			if(arr[i]==ele)
			{
				flag= true;
				System.out.println("postion "+i);
				count++;
				
			}
		}
		System.out.println("count "+count);
		if(!flag)
		{
			System.out.println("Not found");
		}
		return flag;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {4,6,8,6,4,2,1};
		
		searchOfElement(arr,6);
		
		
		

	}

}
