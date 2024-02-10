package com.array.lab;

import java.util.Arrays;
import java.util.Scanner;

// find out vowels in character

public class CharacterVowelsFind {
	
	static boolean checkVowels(char ch)
	{
		
		return  ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u';
	}

	public static void main(String[] args) {
		
Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Size");
		int size=sc.nextInt();
		
		char arr[]=new char[size];
		System.out.println("Enter Elements : ");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.next().charAt(0);
		}
		
		System.out.println(Arrays.toString(arr));
		
		
		  for(int i=0;i<arr.length;i++)
		  {
			  if(checkVowels(arr[i]))
			  {
				  System.out.println(arr[i]);
			  }
		  }
		  
		  sc.close();

	}

}
