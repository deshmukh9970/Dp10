package com.abtract;

//Task2>>
//Write a Java program to create an abstract class Shape with abstract methods calculateArea()
// and calculatePerimeter(). 
//Create subclasses Circle and Triangle that extend the Shape class and implement the respective methods 
//to calculate the area and perimeter of each shape.


abstract class Shape
{
	Shape()
	{
		
	
	}
	abstract double calculateArea();
	abstract double calculatePerimeter();
}

class Circle extends Shape{

	private double redius;
	
	Circle()
	{
		
	}
	
	Circle(double redius)
	{
		this.redius=redius;
	}
	
	
	public double getRedius() {
		return redius;
	}

	public void setRedius(double redius) {
		this.redius = redius;
	}
	
	

	@Override
	public String toString() {
		return "Circle redius=" + redius + ", getRedius()=" + getRedius() + ", calculateArea()=" + calculateArea()
				+ ", calculatePerimeter()=" + calculatePerimeter();
	}

	@Override
	double calculateArea() {
		
//		System.out.println("Area of Circle : "+3.14*redius*redius);
		
		return 3.14*redius*redius;
		
	}

	@Override
	double calculatePerimeter() {
		
//		System.out.println("Area of Circle : "+2*3.14*redius);
		return 2*3.14*redius;
	}
	
	
	
}

public class ShapeDemo  {
	
	
	

}
