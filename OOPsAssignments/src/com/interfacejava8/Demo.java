package com.interfacejava8;



interface Opertion
{
	void area();
	
	default void volume()
	{
		confitaional(); //here call 
		dislpay();// 
		System.out.println("Default method of volume");
	}
	
	private void confitaional()
	{
		System.out.println("Adhar number");
		System.out.println("This instance private method you cant crate object how to call ?");
		System.out.println(" Instance method you cant crate object how to call ?");
		System.out.println("You can call by default method");
	}
	
	static private void dislpay()
	{
		
		System.out.println("pan Number: TT4800 ");
		System.out.println("yo can call static method and default method also");
	}
	
}
class Square implements  Opertion
{
   int side;
   Square()
   {
	   
   }
   Square(int side)
   {
	   this.side=side;
   }
   
   
	@Override
	public void area() {
		System.out.println("Area of square "+side*side);
	}
	
}

class Cube implements Opertion
{
	int side;
	Cube()
	{
		
	}
	Cube(int side)
	{
		this.side=side;
	}
	
	@Override
	public void area() {
		
		System.out.println("Area of square "+6*side*side);
	}
	
	
	@Override
	public void volume()
	{
		System.out.println("volume "+side*side*side);
	}
	
}


public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Opertion p;
		p=new Square(7);
		p.area();
		p.volume();
		
		p=new Cube(8);
		p.area();
		p.volume();
		
		

	}

}
