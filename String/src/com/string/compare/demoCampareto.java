package com.string.compare;

public class demoCampareto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//compare unicode  of charcter
		//compare lexicographically means like disnory
		
		String s1="Abha";
		String s2="Blae";
		
		System.out.println(s1.compareTo(s2)); //-1  s1 fistr char differance  to s2 of first char
		System.out.println(s2.compareTo(s1));//+1
		
		String s3="Abha";
		String s4="Clae";
      
		System.out.println(s3.compareTo(s4)); //-2  s3 fistr char differance  to s4 of first char
		System.out.println(s4.compareTo(s3));//+2 
		
		String s5="Abha";
		String s6="Alae";
      
		System.out.println(s5.compareTo(s6)); //-10  s5 Second char difference  to s6 of Second char
		System.out.println(s6.compareTo(s5));//+10 
	}

}
