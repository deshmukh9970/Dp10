package com.overriding.lab;

public class BankMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Bank b=new Bank(102,"Idbi",24000,2);
		b.display();
		
		SavingAccount s=new SavingAccount(105,"SBI",24000,3);
		s.display();
		
		CurrentAccount cs=new CurrentAccount(104,"Hdfc",45000,5);
		cs.display();
		 
	}

}
