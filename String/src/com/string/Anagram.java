package com.string;

import java.util.Arrays;

public class Anagram {
	
	static void sortArray(char ch[])
	{
		for(int i=0;i<ch.length;i++)
		{
			for(int j=i+1;j<ch.length;j++)
			{
				if(ch[j]<ch[i]) 
				{
					char c=ch[i];
					ch[i]=ch[j];
					ch[j]=c;
				}
			}
		}
	}
	
	static boolean cheackAngram(String s1,String s2)
	{
		if(s1.length() != s2.length())
		{
			return false;
		}else
		{
			s1=s1.toLowerCase();
			s2=s2.toLowerCase();
			
			char ch1[]=s1.toCharArray();
			char ch2[]=s2.toCharArray();
			
			sortArray(ch1);
			sortArray(ch2);
			
			if(Arrays.equals(ch1,ch2))
			{
				return true;
			}else
			{
				return false;
			}
			
			
			
		}
	}
	
	
	static boolean cheackAngram2(String s1,String s2)
	{
		if(s1.length() != s2.length())
		{
			return false;
		}else
		{
			s1=s1.toLowerCase();
			s2.toLowerCase();
			
			char ch1[]=s1.toCharArray();
			char ch2[]=s2.toCharArray();
			
			Arrays.sort(ch1);
			Arrays.sort(ch2);
			
			for(int i=0;i<ch1.length;i++)
			{
				if(ch1[i] !=ch2[i])
				{
					return false;
				}
			}
			
			return true;
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="race";
		String str1="acer";
		
		if(cheackAngram(str, str1))
		{
			System.out.println("Angram ");
		}
		else
		{
			System.out.println("Not Angram");
		}

	}

}
