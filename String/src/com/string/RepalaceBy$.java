package com.string;

public class RepalaceBy$ {

	 static void replaceVol(String s)
	 {
		 char ch[]=s.toCharArray();
		 for(int i=0;i<ch.length;i++)
		 {
			 char c=ch[i];
			 if(c=='A'|c=='E'|c=='I'|c=='O'|c=='U'|c=='a'|c=='e'|c=='i'|c=='o'|c=='u')
			 {
				ch[i]='$';
			 }
			
		 }
		System.out.println(ch);
	 }
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="jAva is BaD ProGram if you Cant UnderSTand";
		replaceVol(str);

	}

}
