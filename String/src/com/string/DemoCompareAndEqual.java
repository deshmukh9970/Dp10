package com.string;

public class DemoCompareAndEqual {
	
	public static void main(String[] args) {
		
		String s1="java";
		String s2="java";
		
		System.out.println(s1==s2); //here compare refrance 
		System.out.println(s1.equals(s2)); //here compare value
		
//		s1=s1.concat("programs");
		
		String s3=new String("java"); // two id crated fist is heap and secnd is scp
		
		System.out.println(s3==s2); //here compare refrance 
		System.out.println(s3.equals(s2)); //here compare value
	}

}
