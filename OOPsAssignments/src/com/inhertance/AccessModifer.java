package com.inhertance;

public class AccessModifer {
 
	   private int a;
	   int b;
	   protected int c;
	   public int d;
	   
	   private void test()
	   {
		   System.out.println("Private");
	   }
	   
	    void show()
	   {
		   System.out.println("Default");
	   }
	   
	   protected void info()
	   {
		   System.out.println("Protected");
	   }
	   
	   public void check()
	   {
		   System.out.println("Public");
	   }
	   
	   public static void main(String[] args) {
		   
		   AccessModifer  obj=new AccessModifer();
		    obj.test();
		    obj.show();
		    obj.info();
		    obj.check();
		    System.out.println(obj.a);
		    System.out.println(obj.b);
		    System.out.println(obj.c);
		    System.out.println(obj.d);
		   
	}
}
