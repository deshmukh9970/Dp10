package com.oops.assignments.method;

import java.util.Scanner;

class Account {
    int acc_no;
    String name;
    float amount;

   public void insert(int a, String n, float amt) {
        acc_no = a;
        name = n;
        amount = amt;
    }

  
   public void display() {
        System.out.println("Account Number: " + acc_no);
        System.out.println("Account Holder Name: " + name);
        System.out.println("Account Balance: " + amount);
    }

    
   public void deposit(float amt) {
        amount =amount+amt;
        System.out.println("Amount Deposited. Updated Balance: " + amount);
    }

   
  public  void withdraw(float amt) {
        if (amount >= amt) {
            amount = amount-amt;
            System.out.println("Amount Withdrawn. Updated Balance: " + amount);
        } else {
            System.out.println("Insufficient Balance. Withdrawal Failed.");
        }
    }

    
  public void checkBalance() {
        System.out.println("Current Balance: " + amount);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

  
        Account myAccount = new Account();

       
        System.out.print("Enter Account Number: ");
        int accNumber = scanner.nextInt();
        System.out.print("Enter Account Holder Name: ");
        String accHolderName = scanner.next();
        System.out.print("Enter Initial Balance: ");
        float initialBalance = scanner.nextFloat();
        myAccount.insert(accNumber, accHolderName, initialBalance);

        
        System.out.println("\nAccount Information:");
        myAccount.display();

        
        System.out.print("\nEnter Amount to Deposit: ");
        float depositAmount = scanner.nextFloat();
        myAccount.deposit(depositAmount);

       
        System.out.print("\nEnter Amount to Withdraw: ");
        float withdrawAmount = scanner.nextFloat();
        myAccount.withdraw(withdrawAmount);

        
        myAccount.checkBalance();

        
    }
}
