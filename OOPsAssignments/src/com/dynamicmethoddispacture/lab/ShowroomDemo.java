package com.dynamicmethoddispacture.lab;

//Task3>>
//Create a class Showroom having showroomid, showroomName
//Create the showroom name as static and final and create a variable space as final
//Initialize the final variable
//Create a final method empRules() and create a class BikeShowRoom which inherits Showroom and try
//to override empRules

class Showroom
{
	final static int showroomid;
	final static String showroomName;
	final int space;
	
	Showroom()
	{
		space=10;
	}
	
	static
	{
		showroomid=102;
		showroomName="BMW";
		
	}
	
//	final void empRules()
//	{
//		System.out.println("BmW Rules");
//	}
	
	void empRules()
	{
		System.out.println("BmW Rules");
	}
	
}

class BikeShowRoom extends Showroom
{
	//	- Cannot override the final method from Showroom
	//overrides com.dynamicmethoddispacture.lab.Showroom.
//	final void empRules()
//	{
//		System.out.println("BmW Rules");
//	}
	
	@Override
	void empRules()
	{
		System.out.println("Bike Rules");
	}
	
	
}




public class ShowroomDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Showroom s;
		
	     s=new BikeShowRoom();
	     s.empRules();
	    
	     System.out.println(s.showroomid);
	     System.out.println(s.showroomName);
	     System.out.println(s.space);
	     

	}

}
