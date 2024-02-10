package com.cotainment.classwork;

public class Book {
	
	private int bid;
	private String bname;
	private double bprice;
	private Author author;
	
	Book()
	{
		
	}
	
	Book(int bid,String bname,double bprice,Author author)
	{
		this.bid=bid;
		this.bname=bname;
		this.bprice=bprice;
		this.author=author;
		
	}

	public int getBid() {
		return bid;
	}

	public void setBid(int bid) {
		this.bid = bid;
	}

	public String getBname() {
		return bname;
	}

	public void setBname(String bname) {
		this.bname = bname;
	}

	public double getBprice() {
		return bprice;
	}

	public void setBprice(double bprice) {
		this.bprice = bprice;
	}
	
	
	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}

	 
	public String toString()
	{
		return "Book bid "+bid+" "+bname+" "+bprice+" "+author;
	}

	
	
	

}
