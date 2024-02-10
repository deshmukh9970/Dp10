package com.opps.extraAssignment.lab;

//7.
//Write a program to print the area of a rectangle by creating 
//a class named 'Area' taking the values of its length and breadth as parameters 
//of its constructor and having a method named 'returnArea' which returns the area of
//the rectangle. Length and breadth of rectangle are entered through keyboard.

public class Rectangle1 {
	
	double area;
	int length;
	int breadth;
	
	public void setData(int length,int breadth)
	{
		this.length=length;
		this.breadth=breadth;
		
	}
	
	public double returnArea()
	{
		area=length*breadth;
		return area;
	}
	
	public void display()
	{
		System.out.println("Area of Reactangle : "+returnArea());
	
	}

}
