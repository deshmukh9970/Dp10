package com.array;

import java.util.Scanner;

public class EvenNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Scanner sc=new Scanner(System.in);
		 
		 System.out.println("Enter Size ");
		 int size=sc.nextInt();
		 
		 int []arr=new int[size];
		 
		 System.out.println("Enter Element : ");
		 for(int i=0;i<arr.length;i++)
		 {
			 arr[i]=sc.nextInt();
			 
		 }
		 
		 //even 
		 System.out.println("Even Number in Arry : ");
		 for(int i=0;i<arr.length;i++)
		 {
			 if(arr[i]%2==0)
			 {
				
				 System.out.println(arr[i]);
			 }
		 }
			 
		 
		 sc.close();
		 
		
	}

}
