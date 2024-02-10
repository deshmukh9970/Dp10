package com.opps.classWork;

public class Employee {
	
	private int eid;
	private String ename;
	private double esalary;
	
      Employee()
      {
    	  System.out.println("Default Constrctor..............");
      }
      
      Employee(int eid,String ename)
      {
    	  System.out.println("Para Constrctor 2 ..............");
    	  this.eid=eid;
    	  this.ename=ename;
    	  esalary=12244.50;
      }
      
      Employee(int eid,String ename,double esalary)
      {
    	  System.out.println("Para Constrctor 3..............");
    	  this.eid=eid;
    	  this.ename=ename;
    	  this.esalary=esalary;
      }
      
     
      
      public void setSalary(double esalary )
 	 {
 		 this.esalary=esalary;
 	 }
 	 
 	 public double getSalary()
 	 {
 		 return esalary;
 	 }
       
      public String toString()
      {
    	  return "Eid :"+eid+"\t Ename: "+ename+"\tEsalary :"+esalary;
      }

	

}
