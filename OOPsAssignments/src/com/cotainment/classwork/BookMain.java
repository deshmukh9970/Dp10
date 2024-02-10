package com.cotainment.classwork;

import java.util.Scanner;

public class BookMain {
	
	
	Scanner sc= new Scanner(System.in);
	
	 public void enterDetails(Book i)
	 {
		
		 System.out.println("Enter Book id : ");
		 i.setBid(sc.nextInt());
		 
		 System.out.println("Enter Book id : ");
		 i.setBname(sc.next());
		 
		 System.out.println("Enter Book id : ");
		 i.setBprice(sc.nextDouble());
		 
		 //using object crate of author thhis anemias way
		 
//		 Author a=new Author();
//		 
//		 System.out.println("Enter Author Id ");
//		 a.setAid(sc.nextInt());
//		 
//		 System.out.println("Enter Author Id ");
//		 a.setAname(sc.next());
		 
//		 i.setAuthor(a); here all  Author data passing to object of Author
		 // 2nd way 
		 
		 i.setAuthor(new Author() );
		 
		 
	 }
	
	
	public static void main(String[] args) {
		
		//BookMain class object crated 
		BookMain bookmain=new BookMain();
		
		//book class object becuse of here inside author reference pass
		Book b1=new Book();
		
		// here calling object to mathod and passing object of Book
		bookmain.enterDetails(b1);
		
		//Annoymis 
		//Book b1=new Book(1,"java",452,new Author(102,"sunMicro"));
		
	}

}
