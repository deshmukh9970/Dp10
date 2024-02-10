package com.interfacedemo.lab;

import java.util.Scanner;

//Task2>>
//Create an online shopping which has various modes to paythe Bill
//If paid through cash.. no discount
//Paytm ... above 1000,, cashback 500
//Credit card .. any amount : 20% discount
//Debit card.... above 5000 : 20% discount
//Try to the pay bill using different modesTask2>>
//Create an online shopping which has various modes to paythe Bill
//If paid through cash.. no discount
//Paytm ... above 1000,, cashback 500
//Credit card .. any amount : 20% discount
//Debit card.... above 5000 : 20% discount
//Try to the pay bill using different modes

interface PaymentProcess{
	
	void processPayment(double amount);
		
}

class Paytm implements PaymentProcess
{
	private static double cashback=500;
	private static double mincashshop=1000;
	
	

	@Override
	public void processPayment(double amount) {

              if(amount >mincashshop)
              {
            	  System.out.println("Shopping Amount : "+amount);
            	  System.out.println("Total Amount removing 500 Cashback :  "+(amount-mincashshop));
            	
              }
              else {
            	  System.out.println("No Cashback Apllicable your shopping Minimum Shopping 1000 : "+amount);
            	  
              }
            	  
	}
	
	
}

class CreditCard implements PaymentProcess
{
    private static double discount=0.2;
     
    
    
	@Override
	public void processPayment(double amount) {
		
		 System.out.println("Shopping Amount : "+amount);
		System.out.println("Total price After 20% discount Price is : "+amount*(1-discount));
		
		
	}
	
	
	
	
}

class DebitCard implements PaymentProcess
{
   private static double discount=0.2;
   private static double  min_shoping=5000;
   
	
	@Override
	public void processPayment(double amount) {

            if(amount>5000)
            {
            	 System.out.println("Shopping Amount : "+amount);
            	System.out.println("Total price After 20% discount Price is : "+amount*(1-discount));
            	
            	
            }else
            {
            	System.out.println("No applicable 20% discount shop above 5000 : "+amount);
            	
            }
		
	}
	
}


public class PaymentExample {
	
	private double amount;
	
	 
	

	  public double getAmount() {
		return amount;
	}



	public void setAmount(double amount) {
		this.amount = amount;
	}


   //loosly Copling by Interface name passing to here 
	public void setN(PaymentProcess p,double amount)
	  {
		  p.processPayment(amount);
	  }
    
	 private static Scanner scanner = new Scanner(System.in);
	
	 private static void getAmountFromUser(PaymentExample instance) {
	        System.out.println("Enter Amount: ");
	        instance.setAmount(scanner.nextDouble());
	        // You can perform additional processing or validation on the entered amount here if needed.
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter Amount : ");
//		double amt=sc.nextDouble();
//		
//		PaymentExample e=new PaymentExample();
//		PaymentProcess p1;
//		
//		p1=new Paytm();
//		e.setN(p1, amt);
//		
//		p1=new CreditCard();
//		e.setN(p1, 5000);
		
		
		
		
		PaymentExample e=new PaymentExample();
		 getAmountFromUser(e);
		PaymentProcess p1;
		
		p1=new Paytm();
		e.setN(p1, e.getAmount());
		
		 getAmountFromUser(e);
		p1=new CreditCard();
		e.setN(p1, e.getAmount());
		
		
//		PaymentProcess p;
//		p=new Paytm();
//		p.processPayment(2000);
//		
//		System.out.println("*************************************");
//		p=new CreditCard();
//		p.processPayment(400);
//		
//		System.out.println("*************************************");
//		
//		p=new DebitCard();
//		p.processPayment(6000);
//		
		
		

	}

}
