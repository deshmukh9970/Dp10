package com.array2d;

import java.util.Scanner;

public class jaggedArray {

	 static void display(int arr[][])
	 {
		 for(int i=0;i<arr.length;i++)
			{
				for(int j=0;j<arr[i].length;j++)
				{
					System.out.print(arr[i][j]+" ");
				}
				System.out.println();
			}
	 }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[][]= {{1},{2,2},{3,3,3}};
		
		display(arr);
		
		int jarr1[][]=new int[3][];
	    jarr1[0]=new int[2];
	    jarr1[1]=new int[3];
	    jarr1[2]=new int[2];
	    
	  //normal input passsing  
	    
	    Scanner sc=new Scanner(System.in);
	  		for(int i=0;i<jarr1.length;i++)
	  		{
	  			System.out.println("Enter value row "+(i+1)+" :");
	  			for(int j=0;j<jarr1[i].length;j++)
	  			{
	  				jarr1[i][j]=sc.nextInt();
	  			}
	  			System.out.println();
	  		}
	  		
	  		display(jarr1);

	}

}
