package com.constructor.lab;

import java.util.Scanner;

public class Book1Test {
	
	static Scanner sc=new Scanner(System.in); 
	
	
	public static void detalisBook(Book1 i)
	{
		System.out.println("Enter Book : ");
		i.setBooks(sc.next());
		
		System.out.println("Enter Book Detalis : ");
		i.setBookDetails(sc.next());
	}
	
	public static void main(String[] args) {
		
		Book1 b1=new Book1();
		detalisBook(b1);
		
		Book1 b2=new Book1();
		detalisBook(b2);
		
		System.out.println("Supplier name: "+Book1.name);
		System.out.println(b1);
		System.out.println(b2);
		
		
	}

}
