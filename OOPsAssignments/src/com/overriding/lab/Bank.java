package com.overriding.lab;

//Task1>
//A bank has a principal amount and a rate of interest which is 2%. 
//A savings account has a rate of interest 3% while a current account has 5%. 
//Write a method that displays the rate of interest based on whether 
//the account is default/ savings/ current.

public class Bank {
	
	protected int bid;
	protected String bname;
	protected double pamount;
	protected double interest;
//	
//	Bank()
//	{
//		
//	}
	
	Bank(int bid,String bname,double pamount,double interest)
	{
		this.bid=bid;
		this.bname=bname;
		this.pamount=pamount;
		this.interest=interest;
	}
	
	void display()
	{
		double total=calculateInterest();
		System.out.println("Principal Amount "+pamount);
		System.out.println("Default rate of interest 2% and Total amount " +total);
	}
	
	double calculateInterest() {
        return pamount * (interest / 100.0);
    }

	public double getPamount() {
		return pamount;
	}

	public void setPamount(double pamount) {
		this.pamount = pamount;
	}
	
	public String toString()
	{
		return " Bank "+pamount;
	}
	

}
