package com.inhertance.lab;

public class Car1 extends Vehicle{
	
	String  carinfo;
	
	Car1(String vname,String carinfo)
	{
	  super(vname);	
	  this.carinfo=carinfo;
	  System.out.println("Sub class Constractor... ");
	}

}
