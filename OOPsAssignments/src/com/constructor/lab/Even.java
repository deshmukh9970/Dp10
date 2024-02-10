package com.constructor.lab;

//1.	 WAP to print even numbers from 121 to 229 using for loop. (using class constructor,object,this)

public class Even {
	int start;
	int end;
	
	Even(int start,int end)
	{
		this.start=start;
		this.end=end;
	}
	
	public void evenNumber()
	{
		for(int i=start;i<=end;i++)
		{
			if(i%2==0)
			{
				System.out.println(i);
			}
		}
		
		
	}
	
	public static void main(String[] args) {
		
		Even obj=new Even(121,229);
		obj.evenNumber();
	}

}
