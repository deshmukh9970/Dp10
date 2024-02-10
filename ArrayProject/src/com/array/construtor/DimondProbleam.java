package com.array.construtor;

interface employee
{
	void work();
	default void Test()
	{
		System.out.println("I am Employee");
	}
}
interface Developer extends employee
{
	void work();
	default void Test()
	{
		System.out.println("I am Developer");
	}
}



public class DimondProbleam implements employee,Developer {
	
	
	@Override
	public void work() {
		System.out.println("Work");
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DimondProbleam d=new DimondProbleam();
		d.Test();

	}

	

}
