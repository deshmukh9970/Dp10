package com.opps.classWork;

public class Reactangle {
	
	int l;
	int b;
	int area;
	int peri;
	
	public void setMethod(int l,int b)
	{
		this.l=l;
		this.b=b;
	}
	
	public int calArea()
	{
	   return area=l*b;	
	}
    
	public int calPerimeter()
	{
		return peri=2*(l+b);
	}
	
	public void display()
	{
		System.out.println("length :"+l);
		System.out.println("width :"+b);
		System.out.println("Area  :"+calArea());
		System.out.println("peri :"+calPerimeter());
		
		
	}
}
