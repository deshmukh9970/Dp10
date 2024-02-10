package com.constructor.lab;

import java.util.Scanner;

public class BookTest {
	
	static Scanner sc=new Scanner(System.in);
	
	public static void bookDetalis(Book i)
	{
		System.out.println("Enter Id : ");
		i.setId(sc.nextInt());
		
		System.out.println("Enter Name : ");
		i.setName(sc.next());
		
		System.out.println("Enter Price : ");
		i.setPrice(sc.nextInt());
		
		System.out.println("Enter category : ");
		i.setCategory(sc.next());
		
		System.out.println("Enter Discount : ");
		i.setDiscount(sc.nextInt());
		
		System.out.println("***********************************************");
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Book b=new Book();
		bookDetalis(b);
		
		Book b1=new Book();
		bookDetalis(b1);
		
		System.out.println(b);
		System.out.println(b1);
		
		b.compareDiscCost(b1);

	}

}
