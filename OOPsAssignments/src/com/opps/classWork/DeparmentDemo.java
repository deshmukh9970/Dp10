package com.opps.classWork;

class DeparmentSciance{
	
	int did;
	String dname;
	int dsalary;
	
	DeparmentSciance()
	{
		System.out.println("Default Constrctor.............");
	}
	DeparmentSciance(int did,String dname)
	{
		this();
		System.out.println("Para Constrctor 2.............");
		this.did=did;
		this.dname=dname;
		this.dsalary=554888;
		
		
	}
	DeparmentSciance(int did,String dname,int dsalary)
	{
		System.out.println("Para Constrctor 3.............");
		this.did=did;
		this.dname=dname;
		this.dsalary=dsalary;
	}
	
	 public void setSalary(int dsalary )
 	 {
 		 this.dsalary=dsalary;
 	 }
 	 
 	 public double getSalary()
 	 {
 		 return dsalary;
 	 }
	
	public String toString()
	{
		return "Dparment Detalis : "+did+"\tname : "+dname+"\tsalary"+dsalary;
	}
	
	
}


public class DeparmentDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DeparmentSciance d1=new DeparmentSciance();
		System.out.println(d1);
		
		DeparmentSciance d2=new DeparmentSciance(101,"Sciance");
		System.out.println(d2);
		d2.setSalary(555555);
		System.out.println(d2);
		
		DeparmentSciance d3=new DeparmentSciance(102,"History",788888);
		System.out.println(d3);

	}

}
