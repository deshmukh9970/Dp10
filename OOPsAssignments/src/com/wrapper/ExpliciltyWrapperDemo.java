package com.wrapper;

public class ExpliciltyWrapperDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  
		   //Boxing primitive to objcet
		     int num=23;
		     Integer i1= Integer.valueOf(num);
		     System.out.println(i1);
		     
		     Integer i3=num; //Autoboxing
		     
		     Integer  i2=new Integer(num);
		     
		     //Unboxing object to primmitive
		     Float f=8.4f;
		     float f1=f.floatValue();
		     
		     System.out.println(f1);
		     
		     //Dirctly complier add .floatValue complie time (Auto
		     float f2=f; 
		     

	}

}
