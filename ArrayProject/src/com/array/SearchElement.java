package com.array;

public class SearchElement {
	
	static boolean searchOfElement(int arr[],int ele)
	{
		boolean  flag=false;
		//travers
		for(int i=0;i<arr.length;i++)
		{
			//compare
			if(arr[i]==ele)
			{
				flag= true;
				
			}
		}
		return  flag;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {4,6,8,6,4,2,1};
		
		if(searchOfElement(arr,6))
		{
			System.out.println("Element fount ");
		}
		else
		{
			System.out.println("Elemnt not found");
		}
		
		

	}

}
