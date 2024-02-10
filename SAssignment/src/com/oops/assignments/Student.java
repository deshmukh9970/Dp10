package com.oops.assignments;

 class Student {
	 
	 int roll;
	 String name;
	 
	 String name1;
	 int marksSub1;
	 int marksSub2;
	 int marksSub3;
	 
	 public void setMark(String Sname,int marks1,int marks2,int marks3)
	 {
		name1=Sname;
		 marksSub1=marks1;
		 marksSub2=marks2;
		 marksSub3=marks3;
		 System.out.println("mmm"+marksSub1);
	 }
	 
	public double calPercentage()
	{
		double Percentage;
		int total=marksSub1+marksSub2+marksSub3;
		Percentage=total/3;
		return Percentage;
		
	}
	
	public void Resultprint()
	{
	        double percentage=calPercentage();
	        
	        System.out.println("Student name :"+name1);
	        
	        if(percentage>=75)
	        {
	        	System.out.println("1st Class : "+percentage+"%");
	        }
	        else if(percentage>=60)
	        {
	        	System.out.println("2st Class : "+percentage+"%");
	        }
	        else if(percentage>=50)
	        {
	        	System.out.println("3st Class : "+percentage+"%");
	        }else
	        {
	        	System.out.println("fail");
	        }
	}
	 
	
	 public static void main(String[] args) {
		
		 Student s1=new Student();
		 Student s2=new Student();
		 
		 s1.setMark("pramod",25,35,60);
		 s2.setMark("Amar",80,85,90);
		 
		 s1.Resultprint();
		 s2.Resultprint();
		 
	}
	

}
