package com.finalkeyword;


class Developer{
	
	String name;
	final int panno;
	final static int noOfhours;
	
	static 
	{
		noOfhours=8;
	}
	
	
	Developer()
	{
		panno=8;
	}
	
	final void show()
	{
		System.out.println("hi");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPanno() {
		return panno;
	}

	public static int getNoofhours() {
		return noOfhours;
	}
	
	
	
	
}

class FullstackDeveloper extends Developer
{
	 
//	 Cannot override the final method from Developer
//	final void show()
//	{
//		System.out.println("hello");
//	}
	
	
}






public class FinalDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Developer d=new Developer();
		System.out.println(d.panno+""+d.noOfhours);

	}

}
