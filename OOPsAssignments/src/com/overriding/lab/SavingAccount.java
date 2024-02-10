package com.overriding.lab;

public class SavingAccount extends Bank{
	
	SavingAccount(int bid,String bname,double pamount,double interest)
	{
	   super(bid,bname,pamount,interest);
		System.out.println("");
		
	}
	
	@Override
	void display()
	{
		super.display();
		double total=pamount*0.03;
		System.out.println("Saving rate of interest 3% total amount "+total);
	}
	
	

}
