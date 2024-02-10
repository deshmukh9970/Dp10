package com.array.eillips;

public class RulesOveloading {
	
	static void show1(int ...a)
	{
	      for(int x:a)
	      {
	    	  System.out.println(x);
	      }
	}
	
	static void show1(double ...b)
	{
	      for(double x:b)
	      {
	    	  System.out.println(x);
	      }
	}
	
	
	// ---------Above ovloading possible
	
	
	static void show(char c,int ...a)
	{
		System.out.println(c);
	      for(int x:a)
	      {
	    	  System.out.println(x);
	      }
	}
	
	static void show(int a,char ...c)
	{
		
		System.out.println(a);
	      for(char x:c)
	      {
	    	  System.out.println(x);
	      }
	}
	
  //-------------------above code ambigute 
	
	//----below cod is warrper class
	
	static void show2(Integer ...i1)
	{
		System.out.println("in Integer");
		
	      for(Integer  x:i1)
	      {
	    	  System.out.println(x);
	      }
	}
	
	static void show2(Number ...i1)
	{
		System.out.println("in Number");
		
	      for(Number  x:i1)
	      {
	    	  System.out.println(x);
	      }
	}
	
	//Promoted to parent class
	static void show2(Object ...i1)
	{
		System.out.println("in object");
	      for(Object  x:i1)
	      {
	    	  System.out.println(x);
	      }
	}
	
	
	
	
	
	public static void main(String[] args) {
		
		show(4, 'a','b'); 
		
		show2(4.5, 'a','b');//Promoted to charctor promoted to object
	}


}
