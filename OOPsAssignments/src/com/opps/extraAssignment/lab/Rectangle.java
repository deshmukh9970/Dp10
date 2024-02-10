package com.opps.extraAssignment.lab;

//6.
//Write a program to print the area of two rectangles having sides 
//(4,5) and (5,8) respectively by creating a class named 'Rectangle' 
//with a method named 'Area' which returns the area and length and breadth passed
//as parameters to its constructor.

public class Rectangle {
	
	double area;
	int length;
	int breadth;
	
	public void setData(int length,int breadth)
	{
		this.length=length;
		this.breadth=breadth;
		
	}
	
	public double areaMethod()
	{
		area=length*breadth;
		return area;
	}
	
	public void display()
	{
		System.out.println("Area of Reactangle : "+areaMethod());
	
	}
	
	

}
