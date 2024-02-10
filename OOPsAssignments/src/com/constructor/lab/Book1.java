package com.constructor.lab;

//Task2: Create a library of books , Count the number of books added in the library. All the books have 
//a common supplier "Mr XYZ" 
//Show the details of library as:
//Supplier name:
//Total books:
//Book details

public class Book1 {

	static String name="Mr. XYZ ";
	private String books;
	private String bookDetails;
	static int count;
	
	{
		
	    count++;
	}
	

	public String getBooks() {
		return books;
	}

	public void setBooks(String books) {
		this.books = books;
	}

	public String getBookDetails() {
		return bookDetails;
	}

	public void setBookDetails(String bookDetails) {
		this.bookDetails = bookDetails;
	}
	
	public String toString()
	{
		return " Books : "+books+"\t Book Details : "+bookDetails+" \tBook Count : "+count;
	}
	
}
