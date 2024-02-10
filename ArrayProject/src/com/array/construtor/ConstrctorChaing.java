package com.array.construtor;



public class ConstrctorChaing {
	

	
	ConstrctorChaing()
	{
		this(4);
		System.out.println("Default ");
	}
	ConstrctorChaing(int id)
	{
		this("Hello");
		System.out.println("int Parametrize");
	}
	ConstrctorChaing(String name)
	{
		System.out.println("String Parametrize");
	}
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstrctorChaing obj=new ConstrctorChaing();

	}

}
