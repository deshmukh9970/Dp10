package com.interfacedemo.lab;

//Task 4>>

//Create a code to show how abstract class can have tight coupling issues

abstract class Shape {
	
	 String name;
//	Shape()
//	{
//		
//	}
	
	Shape(String name)
	{
		this.name=name;
	}
	
	
	
	abstract void draw();


	void calculateArea() {
		System.out.println("Calculating area in the base Shape class.");
	}
}


class Circle extends Shape {
	
	// because of tightly cople of constrctor 
	Circle()
	{
		
	}
	@Override
	void draw() {
		System.out.println("Drawing a circle.");
	}
}


class Square extends Shape {
	@Override
	void draw() {
		System.out.println("Drawing a square.");
	}
}

public class TightCouple
{
	public static void main(String[] args) {
		Shape circle = new Circle();
		Shape square = new Square();
		circle.draw();
		square.draw();
		circle.calculateArea();
		square.calculateArea();
	}
}
