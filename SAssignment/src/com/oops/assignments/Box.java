package com.oops.assignments;

public class Box {
	
	int legnth=10;
	int width=20;
	int height=30;
	
	public void calculetVolume()
	{
		int volume=legnth*width*height;
		System.out.println("Volume Of Box : "+volume);
	}
	
	public void calculetRectangle()
	{
		int areaOfRectangle=legnth*width;
		System.out.println("Ara of Reactangle :"+areaOfRectangle);
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		Box obj=new Box();
		
		obj.calculetVolume();
		obj.calculetRectangle();
		
	}

}
