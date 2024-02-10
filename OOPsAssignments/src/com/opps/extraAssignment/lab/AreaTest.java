package com.opps.extraAssignment.lab;

import java.util.Scanner;

public class AreaTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Area obj=new Area();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Length : ");
		int length=sc.nextInt();
		
		System.out.println("Enter b : ");
        int b=sc.nextInt();
        
        obj.setDim(length, b);
       System.out.println("Ara of Ractangle is : "+ obj.getArea());
	}

}
