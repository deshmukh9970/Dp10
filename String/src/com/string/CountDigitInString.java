package com.string;

public class CountDigitInString {
	
	static void countDigit(String s)
	{
		int count=0;
		char ch[]=s.toCharArray();
		
		for(char c:ch)
		{
			if(c>=48 && c<=57)
			{
				count++;
			}
		}
		System.out.println("Digit Count "+count);
	}
	
	static void countDigitInbulid(String s)
	{
		int count=0;
		for(int i=0;i<s.length();i++)
		{
			if(Character.isDigit(s.charAt(i)))
			{
				count++;
			}
		}
		System.out.println("Digit count inBulid method "+count);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="java i45 program485";
		
		countDigit(str);
		countDigitInbulid(str);

	}

}
