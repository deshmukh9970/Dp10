package com.string.compare;

public class StringMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="java is fun";
		System.out.println(str.length());
		
		System.out.println(str.charAt(10));
		
		System.out.println(str.charAt(str.length()-1));
		
		
		String s1="hello";
		String s2="World";
		System.out.println(s1+s2);
		System.out.println(s1.concat(s2));
		
		System.out.println(str.substring(1));
		System.out.println(str.substring(1, 6));// start index 1incude not index 6 not include letter
		
		System.out.println(str.concat("ava"));
		System.out.println(str.concat("orl"));
		
		String w1="Hi";
		String w2="hi";
		
		System.out.println(w1==w2);
		System.out.println(w1.equals(w2));
		System.out.println(w1.equalsIgnoreCase(w2)); // ignore case sencitive
		
		System.out.println(str.toLowerCase()); // string convert to lower case
		System.out.println(str.toUpperCase());// String convert to upper case
		
		System.out.println(str.lastIndexOf('a'));// find out char index
		System.out.println(str.lastIndexOf("fun"));
		
		
		String st=" ";
		
		System.out.println(st.isBlank()); // ignore the space he return ture 
		System.out.println(st.isEmpty()); //  not ignor space so return false
		
		
		String s=" java  ";
		
		System.out.println(s.trim()); // trim empty space 
		System.out.println(s+s.length());
		
		System.out.println();
		
		
		
		
		
		

		

	}

}
