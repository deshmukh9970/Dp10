package com.string;

import java.util.Arrays;

public class StringSortByArray {
	
	static void sortLength(String st[])
	{
		for(int i=0;i<st.length;i++)
		{
			for(int j=i+1;j<st.length;j++)
			{
				if(st[j].length()<st[i].length())
				{
				String temp=st[i];
				st[i]=st[j];
				st[j]=temp;
				
				}
			}
				
				
		}
		System.out.println(Arrays.toString(st));
	}
	
	static void sortLexographi(String st[])
	{
		for(int i=0;i<st.length;i++)
		{
			for(int j=i+1;j<st.length;j++)
			{
				if(st[i].compareTo(st[j])>0)
				{
				String temp=st[i];
				st[i]=st[j];
				st[j]=temp;
				
				}
			}
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str[]= {"java","Anguler","c","mysql"};
		
		System.out.println(Arrays.toString(str));
		sortLength(str);
		
		

	}

}
