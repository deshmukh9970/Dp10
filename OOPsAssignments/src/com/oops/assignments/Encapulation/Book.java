package com.oops.assignments.Encapulation;

public class Book {
	
	private int bookId;
	private String bookName;
	private double price;
	
	
	public Book()
	{
		
	}

	 public Book(int bookId,String bookName,double price)
	 {
		 this.bookId=bookId;
		 this.bookName=bookName;
		 this.price=price;
	 }
	 
	 public void setBookId(int bookId)
	 {
		 this.bookId=bookId;
	 }
	 
	 public int getBookId()
	 {
		 return bookId;
	 }
	 
	 public void setBookName(String bookName )
	 {
		 this.bookName=bookName;
	 }
	 
	 public String getBookName()
	 {
		 return bookName;
	 }
	 
	 public void setPrice(double price )
	 {
		 this.price=price;
	 }
	 
	 public double getPrice()
	 {
		 return price;
	 }
	 
	 public String toString()
	 {
		 return "BookId: "+bookId+"\tBookName: "+bookName+"\tPrice : "+price;
	 }

}
