package com.coverient;

interface Developer
{
    default void work()
    {
    	System.out.println("I am Developer");
    }
}

interface Manger
{
	default void work()
	{
		System.out.println("i am Manger");
	}
}



public class DiamondProbleam implements Developer,Manger {
	
	public void work()
	{
		System.out.println("I am DiamondProbleam");
		Developer.super.work();
		Manger.super.work();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Developer d;
		d=new DiamondProbleam();
		d.work();
		
		Manger m;
		m=new DiamondProbleam();
		m.work();

	}

}
