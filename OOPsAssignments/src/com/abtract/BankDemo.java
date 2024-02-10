 package com.abtract;

import java.util.Scanner;

//Task1>> 
//Write a Java program to create an abstract class BankAccount with abstract methods deposit() 
//and withdraw().
//Create subclasses: SavingsAccount and CurrentAccount that extend the BankAccount class 
//and implement the respective methods to handle deposits and withdrawals for each account type.


abstract class BankAccount
{
	private int amount;
	
	BankAccount()
	{
		
	}
	
	BankAccount(int amount)
	{
		this.amount=amount;
	}
	
	abstract void deposit(); 
	abstract void withdraw(int amount); 
    	

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}
	
	
	
	
	
}

class SavingsAccount extends BankAccount
{
	
	SavingsAccount()
	{
		
	}
	
	SavingsAccount(int amount)
	{
		super(amount);
	}

	@Override
	public void deposit() {
		
		System.out.println(" SavingsAccount Deposit Amount "+getAmount());
	}

	@Override
	public void withdraw(int amount) {
		
		 if(getAmount() > amount )
		 {
			 setAmount(getAmount()-amount);
			 System.out.println(" SavingsAccount Remaing Amount "+getAmount());
		 }
		 else {
			 System.out.println("Insfficent balance");
		 }
		
		
	}
	
}

class CurrentAccount extends  BankAccount{
	
	CurrentAccount()
	{
		
	}
	
	CurrentAccount(int amount)
	{
		super(amount);
	}

	@Override
	void deposit() {
		
		System.out.println(" CurrentAccount Deposit Amount "+getAmount());
	}

	@Override
	void withdraw(int amount) {
		
		 if(getAmount() > amount )
		 {
			 setAmount(getAmount()-amount);
			 System.out.println(" CurrentAccount Remaing Amount "+getAmount());
		 }
		 else {
			 System.out.println("Insfficent balance");
		 }
	}
	
	
}

public class BankDemo {
	
	static Scanner sc=new Scanner(System.in);
	
	public static void enterDetalis(BankAccount i)
	{
	
		System.out.println("Enter Amount");
		i.setAmount(sc.nextInt());
		
		
		
		
	}
	
	
	
	public static void main(String[] args) {
		
		
		BankAccount b = new SavingsAccount(); ;
		enterDetalis(b);
		b.deposit();
		System.out.println("Enter Withdrawal Amount");
	    int withdrawalAmount = sc.nextInt();
	    b.withdraw(withdrawalAmount);
		
	    //System.out.println(b.getAmount());
	    
	    BankAccount b1 = new CurrentAccount(); 
	    enterDetalis(b1);
		b.deposit();
		System.out.println("Enter Withdrawal Amount");
	    int cwithdrawalAmount = sc.nextInt();
	    b.withdraw(cwithdrawalAmount);
		
		
	}
	
	
	
	

}
