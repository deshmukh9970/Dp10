package com.opps.classWork;

import java.util.Scanner;

public class ItemTest {
	
	static Scanner sc=new Scanner(System.in);
	
	public static void enterInformatin(Item i)
	{
	    System.out.println("Enter id :");
	    i.setId(sc.nextInt());
	    
	    System.out.println("Enter Name :");
	    i.setName(sc.next());
	    
	    System.out.println("Enter Price :");
	    i.setPrice(sc.nextDouble());
	    
	    System.out.println("Enter Quanty :");
	    i.setQuanty(sc.nextInt());
	    
	    System.out.println("Enter Discount :");
	    i.setDiscount(sc.nextInt());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Item i1=new Item();
		enterInformatin(i1);
		
		Item i2=new Item();
		enterInformatin(i2);
		
		System.out.println(i1);
		System.out.println(i2);

	}

}
