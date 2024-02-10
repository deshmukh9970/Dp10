package com.oops.assignments.constrctor;

public class AnnomissBlockOrIIB {
	
	int num;
	String name;
	
	{
		System.out.println("this Annomisss Block or IIB(Instance,inilize block");
		System.out.println("use for common stement for every time");
		System.out.println("You can two consture this excuty two time ");
	}
	
	public AnnomissBlockOrIIB(int num,String name)
	{
		this.num=num;
		this.name=name;
		System.out.println("Name : "+name);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// two time calling constor obj and obj1
		AnnomissBlockOrIIB obj=new AnnomissBlockOrIIB(2,"Pramod");
		AnnomissBlockOrIIB obj1=new AnnomissBlockOrIIB(3,"ram");

	}

}
