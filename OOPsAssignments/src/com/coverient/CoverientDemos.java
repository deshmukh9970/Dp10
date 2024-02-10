package com.coverient;

class Shape
{
	Shape getShape()
	{
		System.out.println("this is shape ");
		return new Shape();
	}
}


class Circle extends Shape
{
	
	Circle getShape()
	{
		System.out.println("This Circle shape");
		return new Circle();
		
	}
	
	
}





public class CoverientDemos {

	public static void main(String[] args) {
		
//		Circle c=new Circle();
//		c.getShape();
		
		Shape s=new Circle();
		s.getShape();
		

	}

}
