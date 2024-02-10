package com.coverient;


	
class First{
	
	Number value;
	
	
//	Number displayValue()
//	{
//	    value=10;
//	    return value;
//	}
	
	Object displayValue()
	{
	    value=10;
	    return value;
	}
	
}
class Second extends First{
	Integer myVal;
	
	@Override
	Integer displayValue() // here Number is sub class of integer class
	{
		myVal=20;
		return myVal;
	}
	
	
}

class Thrid extends First{
	
	Character ch;
	
	Character displayValue() // here Character is sub class of object class 
	{
		ch='a';
		return ch;
	}
	
}

public class CoverientWrapperDemo 
{

	
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		
		First f=new First();
		f.displayValue();
		//The operator + is undefined for the argument type(s) Object, int
		//System.out.println(""+(f.displayValue()+10));
		
		System.out.println(""+f.displayValue());
		
		
		
		

	}

}

