package com.oops.assignments.method;

public class Student {
	int id;
	String name;
	// 1st Question
   public void displayData()
   {

	  // Change id and name 
	   id=1;
	   name="xyz";
	   System.out.println("Change id in method :"+id);
	   System.out.println("Change name in method : "+name);
	   
   }
   
   
  //3rd
   public void setCustomData(int customid,String customName)
   {
	   id=customid;
	   name=customName;
   }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student obj=new Student();
		obj.displayData();
		
		//overriding value of setCustomData
		obj.setCustomData(2, "Abc");
		System.out.println("Override id :"+obj.id);
		System.out.println("oveerid name :"+obj.name);
		

	}

}
