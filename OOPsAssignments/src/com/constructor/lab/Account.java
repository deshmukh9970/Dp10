package com.constructor.lab;

//Task3:Create a class Account containing following methods : 
//insert() to insert account data 
//display() to display account information 
//deposit() to deposit amount 
//withdraw() to withdraw amount 
//checkbalance() to check balance 
//e.g. 
//class Account{ 
//int acc_no; 
//String name; 
//float amount; 
//} 
//All the account have common rateofInterest which is credited i.e 8% and have common bank name
//Also check how many account are created


public class Account {
	
	private int acc_no;
	private String name;
	private double amount;
	
	public double deposit(double amt)
	{
		
		amount=amount+amt;
		return amount;
		
	}
	
	public void withdraw(double amt)
	{
		if(amount>amt)
		{
			amount=amount-amt;
			System.out.println("Remaing Balance : "+amount);
		}
		else
		{
			System.out.println("Insufficient Balance : ");
		}
	}
	
	public void checkbalance()
	{
		System.out.println("Current Balance "+amount);
	}
	
	public  void rateofInterest()
	{
		double rateofInterest=0.08*amount;
		System.out.println("Rate Of Interest : "+rateofInterest);
	}

	public int getAcc_no() {
		return acc_no;
	}

	public void setAcc_no(int acc_no) {
		this.acc_no = acc_no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	public String toString()
	{
		return "Account No : "+acc_no+"\t Name : "+name+" \t Amount : "+amount+" "+deposit(amount);
	}
	
	

}
