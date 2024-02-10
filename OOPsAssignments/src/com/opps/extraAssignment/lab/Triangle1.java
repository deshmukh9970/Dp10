package com.opps.extraAssignment.lab;

//5.
//Write a program to print the area and perimeter of a triangle having sides 
//of 3, 4 and 5 units by creating a class named 'Triangle' with constructor
//having the three sides as its parameters.

public class Triangle1 {
	
	double area;
	double perimeter;
	int side1;
	int side2;
	int side3;
	
	public void setData(int side1,int side2,int side3)
	{
		this.side1=side1;
		this.side2=side2;
		this.side3=side3;
		
		
	}
	
	public double areaOftriangle()
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
		System.out.println("Area of trinagle : "+areaOftriangle());
		System.out.println("Perimeter of Trinagle : "+perimeterTring());
	}
	

}
