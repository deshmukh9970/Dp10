package com.polymorprisam.lab;

//You have to build a loan calculator.
//If a single rate of interest is provided then it is a housing loan 
//and loan is principal amount * (100 + rate) 
//If two values are provided then it is a commercial loan 
//and loan is principal amount * (value 1 + value 2 +100)

public class LoanCalculator {

  	
	
	public static double calculetLoan(double amount,double rate)
	{
	
		return amount * (100 + rate);
		
	}
	
	public static double calculetLoan(double amount,double value1,double value2)
	{
		return amount * (value1 + value2 +100);
		
	}
	
	public static void main(String[] args) {
		
		System.out.println("housing loan : "+calculetLoan(15000,10 ));
		System.out.println("commercial loan : "+calculetLoan(12000, 150, 180));
		
	}

}
