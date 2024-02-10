package com.opps.extraAssignment.lab;

//4.
//Write a program to print the area and perimeter of a triangle having sides
//of 3, 4 and 5 units by creating a class named 'Triangle' without any 
//parameter in its constructor.

public class Triangle {
	
	double area;
	double perimeter;
	int side1;
	int side2;
	int side3;
	
	public void setData()
	{
		this.side1=3;
		this.side2=4;
		this.side3=5;
	}
	
	public double areaOfTring()
	{
	   area=(side1*side2*side3)/2;
	   return area;
	}
	
	public double perimeterTring()
	{
		perimeter=side1+side2+side3;
		return perimeter;
	}
	
	public void diplay()
	{
		System.out.println("Area of trinagle : "+areaOfTring());
		System.out.println("Perimeter of Trinagle : "+perimeterTring());
	}
	

}
