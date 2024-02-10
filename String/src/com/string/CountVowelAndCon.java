package com.string;

public class CountVowelAndCon {
	
	static void findvolAndcol(String s)
	{
		int vcount=0;
		int ccount=0;
		s=s.toUpperCase(); //conver to s is upper case
		char ch[]=s.toCharArray();
		
		
		for(char c:ch)
		{
			if(c==' '| c=='.')
				continue;
			
			if(c=='A'|c=='E'|c=='I'|c=='O'|c=='U')
			{
			    	vcount++;
			}
			else
			{
				ccount++;
			}
		}
		
		System.out.println("vowel count : "+vcount);
		System.out.println("consol count : "+ccount);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

             String str="Programming is fun.for not me";
             findvolAndcol(str);
	}

}
