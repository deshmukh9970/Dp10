package com.interfacejava8;

interface one
{
	default void print()
	{
		System.out.println("one");
	}
	
}
interface two extends one
{
	default void print()
	{
		one.super.print();
		System.out.println("two");
	}
	
}

interface three extends one
{
	default void print()
	{
		System.out.println("three");
	}
}




public class DiamondProbelamRevolved implements  two,three{
	
	// provied own implemntaion of method that is revolvd diamond probleam 
	public void print()
	{
		two.super.print(); //call defult method usin super keyword 
		three.super.print();
		System.out.println("Main"); 
		
	}
	
	public static void main(String[] args) {
		
		DiamondProbelamRevolved d=new DiamondProbelamRevolved();
		  
		d.print();
	}

}
