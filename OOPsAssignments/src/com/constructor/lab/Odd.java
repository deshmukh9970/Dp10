package com.constructor.lab;

//WAP to print odd numbers from 521 to 229 using while loop. (using class constructor,object,this)

public class Odd {
	
	int start;
	int end;
	
	Odd(int start,int end)
	{
		this.start=start;
		this.end=end;
	}
	
	public void oddNumber()
	{
		int i=start;
		while(i>=end)
		{
			if(i%2 !=0)
			{
				System.out.println(i);
			}
			i--;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Odd obj=new Odd(521,229);
		obj.oddNumber();

	}

}
