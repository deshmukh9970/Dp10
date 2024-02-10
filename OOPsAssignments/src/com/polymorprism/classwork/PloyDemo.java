package com.polymorprism.classwork;

public class PloyDemo {
	
	void area(int side)
	{
		System.out.println("Area of Suare"+(side*side));
	}
	
	void area(int length,int width)
	{
		System.out.println("Area of Trangle"+(length*width));
	}
	
	void area(float redius )
	{
		System.out.println("Area of Suare"+(3.14*redius*redius));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PloyDemo p1=new PloyDemo();
		p1.area(12);
		p1.area(12.4f);
		p1.area(4, 8);
		

	}

}
