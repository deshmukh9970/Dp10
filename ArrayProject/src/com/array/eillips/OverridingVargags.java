package com.array.eillips;

class Parent
{
	void display(int ...a)
	{
		System.out.println("Parent");
	}
}
class child extends Parent
{
	@Override
	void display(int ...a)
	{
		System.out.println("child");
	}
}


public class OverridingVargags {
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		child c=new child();

	}

}
