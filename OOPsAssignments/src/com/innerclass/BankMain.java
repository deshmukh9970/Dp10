package com.innerclass;

class Bank
{
	private static String bname="SBI";
	String bankloc;
	String ifscCode;
	String aName;
	int accNo;
	
	{
		bankloc="Delhi";
		ifscCode="SBINDE4152";
	}
	
	Bank()
	{
		
	}

	public Bank(String aName, int accNo) 
	{
	
		this.aName = aName;
		this.accNo = accNo;
	}
	
	void display()
	{
		System.out.println(aName+"  "+accNo);
		System.out.println(ifscCode);
	}
	
	class Locker
	{
		int lockerId;
		String pass;
		//error becuse my version 1.5 jdk java15
		//static int LockerRent = 2000 ;
		
		int LockerRent = 2000 ;
		
		Locker()
		{
			
		}
		
		
		
		public Locker(int lockerId, String pass) {
			super();
			this.lockerId = lockerId;
			this.pass = pass;
		}



		void lockerDisplay()
		{
			display();
			System.out.println("Accountname "+aName+" with accno "+accNo );
			System.out.println("Bank locker id "+lockerId);
			System.out.println("Rent "+LockerRent);
		}
	}
	
	
	
}

public class BankMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Bank c=new Bank();
		Bank.Locker l=c.new Locker(18,"ok");
		
		

	}

}
