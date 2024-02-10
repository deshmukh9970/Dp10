package com.overriding.lab;

public class CurrentAccount extends Bank{
	
	CurrentAccount(int bid,String bname,double pamount,double interest)
	{
		super(bid,bname,pamount,interest);
	}
	
	@Override
	void display()
	{
		
		double total=calculateInterest();
		System.out.println("Priciple Amount : "+pamount);
		System.out.println("Current account rate of interest 5% tota Amount "+total);
		System.out.println("");
	}
	
	
	

}
