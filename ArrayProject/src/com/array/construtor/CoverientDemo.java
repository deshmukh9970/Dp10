package com.array.construtor;

class Shape
{
	Shape show()
	{
		System.out.println("Shape Class");
		return new Shape();
	}
	
//	Circle show()
//	 {
//		 System.out.println("Circle class");
//		 return new Shape();
//	 }
	
	
}
class Circle extends Shape
{
	
	 Shape show()
	 {
		 System.out.println("Circle class");
		 return new Circle();
	 }
	 
//		Shape show()
//		{
//			System.out.println("Shape Class");
//			return new Shape();
//		}
}


public class CoverientDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Shape s=new Circle();
		s.show();

	}

}
