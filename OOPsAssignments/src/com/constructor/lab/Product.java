package com.constructor.lab;

//Using Setter And Getter

//4>Write a Java program to create Product class as per below details
//Data member : proId,name,description,price,quantity and discount
//methods : displayProduct,calculateTotalPrice(),calculateDiscountPrice()

public class Product {

	private int proId;
	private String name;
	private String description;
	private double price;
	private int quantity;
	private double discount;
	
	Product()
	{
		
		
	}
	
	public double calculateTotalPrice()
	{
		double total= price*quantity;
		
		return total;
	}
	
	public void calculateDiscountPrice()
	{
		
		double discounts= (discount/100)*price;
		double discountPrice= quantity*discounts;
		System.out.println("Discount : "+discountPrice);
		double totalPice= calculateTotalPrice()-discountPrice;
		
		System.out.println("Discount Price : "+totalPice);
		
	}
	
	public void displayProduct()
	{
		System.out.println("Product Information...........");
		System.out.println("Total Price : "+calculateTotalPrice());
		calculateDiscountPrice();
		
		System.out.println("Product Id : "+proId);
		System.out.println("Name : "+name);
		System.out.println("Discrpiction : "+description);
		System.out.println("Price : "+price);
		System.out.println("Quantity : "+quantity);
		System.out.println("Discount "+discount);
		
	}

	public int getProId() {
		return proId;
	}

	public void setProId(int proId) {
		this.proId = proId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}
	
	
	
	
	
}
