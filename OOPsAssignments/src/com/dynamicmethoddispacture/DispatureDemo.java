package com.dynamicmethoddispacture;

class Bank{
	
	double rate;
	
	void getRateOfinterst()
	{
		rate=9.8;
		System.out.println("Rate of interest is "+rate);
	}
}

class SBIbank extends Bank{
	
	void getRateOfinterst()
	{
		rate=9.8;
		System.out.println("Rate of interest is "+rate);
	}
	
	void show()
	{
		System.out.println("hello");
	}
}

class HDFCbank extends Bank{
	
	void getRateOfinterst()
	{
		rate=9.8;
		System.out.println("Rate of interest is "+rate);
	}
}




public class DispatureDemo {
	
	public static void main(String[] args) {
		
		
		Bank p;
		  p=new SBIbank();
		  
		  p.getRateOfinterst(); //here calll SBIbank
		  
		 // p.show()// not in bank class method
		
	}
	
	  
	  
	

}
