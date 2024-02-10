package com.constructor.lab;

//Object Passing and static: 17/01/24
//
//Task1: Create a class Book with the following details : id, name , price, category
//Create  methods to calDiscount(), compareDiscCost() 
//Create 4 objects of books by taking the user input and then compare the cost of any 2 books

public class Book {
	
	private int id;
	private String name;
	private double price;
	private String category;
//	private int quanty;
	private int discount;
	
	public double  calDiscount()
	{
//		double total=quanty*price;
		double discounts=price-(discount/100)*price;
	    
		return discounts;
   
	}
	
	public void compareDiscCost(Book b1)
	{
		if(this.calDiscount()>b1.calDiscount())
		{
			System.out.println(b1.price+" : Price is Low");
		}
		else if(this.calDiscount()<b1.calDiscount())
		{
			System.out.println(b1.price+" : Price is High");
		}
		else {
			System.out.println("Both are same Price ");
		}
	}
	
	public void setId(int id)
	{
		this.id=id;
	}
	
	public int getId()
	{
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public int getDiscount() {
		return discount;
	}

	public void setDiscount(int discount) {
		this.discount = discount;
	}
	
	public String toString()
	{
		return "Id :"+id+"\tName: "+name+"\tPrice : "+price+"\tCategory : "+category+"\t Discount : "+discount+"\tDiscount Price : "+calDiscount();
	}

}
