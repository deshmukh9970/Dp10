package com.array.lab;

import java.util.Arrays;
import java.util.Scanner;

public class CharacterMinMaxFind {

	
	 static void maxminCheck(char arr[])
	 {
		 char max=arr[0];
		 char min=arr[0];
		 for(int i=0;i<arr.length;i++)
		 {
			 if(max<arr[i])
			 {
				 max=arr[i];
			 }
			 else if(min>arr[i])
			 {
				 min=arr[i];
			 }
		 }
		 
		 System.out.println("Max : "+max);
		 System.out.println("Min : "+min);
	 }
	
	
	public static void main(String[] args) {
		
		 Scanner sc=new Scanner(System.in);
		 
		 System.out.println("Enter Size");
		 int size=sc.nextInt();
		 
		 char arr[]=new char[size];
		 
		 System.out.println("Enter Element");
		 for(char i=0;i<arr.length;i++)
		 {
			 arr[i]=sc.next().charAt(0);
		 }
		 
		 System.out.println(Arrays.toString(arr));
		 sc.close();
		  
		 
		 maxminCheck(arr);
		

	}

}
