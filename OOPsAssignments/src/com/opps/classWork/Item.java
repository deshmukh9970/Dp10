package com.opps.classWork;

public class Item {
	
	private int id;
	private String name;
	private double price;
	private int quanty;
	private int discount;
	
	 public double calculetTotalPrice()
	 {
		 return price*quanty;
	 }
	 
	 public double discountPrice()
	 {
		 double discounts=calculetTotalPrice()-(discount/100)*price;
		 return discounts;
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

	public int getQuanty() {
		return quanty;
	}

	public void setQuanty(int quanty) {
		this.quanty = quanty;
	}

	public int getDiscount() {
		return discount;
	}

	public void setDiscount(int discount) {
		this.discount = discount;
	}
	 
	
	public String toString()
	{
		return "Id : "+id+"\t Name: "+name+"\t price: "+price+"\t quanty: "+quanty+"\t Discount"+discount+"discountPrice: "+discountPrice();
	}

}
