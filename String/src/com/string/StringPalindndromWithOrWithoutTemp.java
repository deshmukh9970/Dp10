package com.string;

public class StringPalindndromWithOrWithoutTemp {
	
	static boolean checkPalideromWithTemp(String s)
	{
		String rev="";
		
		for(int i=s.length()-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
		}
		System.out.println(rev);
		 if(rev.equalsIgnoreCase(s))
		 {
			 return true;
		 }else
		 {
			 return false;
		 }
	}
	
	static boolean checkPalideromWithOUtTemp(String s)
	{
		String rev=" ";
		
		s=s.toLowerCase();
		for(int i=0,j=s.length()-1;i<s.length()/2;i++,j--)
		{
			if(s.charAt(i) != s.charAt(j))
			{
				return false;
			}
		}
		return true;
	}
	
	
	public static void main(String[] args) {
		
		String s="Malayalam";
		
		if(checkPalideromWithTemp(s))
		{
			System.out.println("String is Palindrom");
		}else
		{
			System.out.println("String not Palindrom");
		}
	}

}
