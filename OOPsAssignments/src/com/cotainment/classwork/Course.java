package com.cotainment.classwork;

public class Course {
	
	private int cid;
	private String cname;
	private double cprice;
	
	Course()
	{
		
	}
    
	Course(int cid,String cname,double cprice)
	{
		this.cid=cid;
		this.cname=cname;
		this.cprice=cprice;
	}
	
	public void setCid(int cid)
	{
		this.cid=cid;
		
	}
	
	public int getCid()
	{
		return cid;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public double getCprice() {
		return cprice;
	}

	public void setCprice(double cprice) {
		this.cprice = cprice;
	}
	
	public String toString()
	{
		return "Cid : "+cid+" "+cname+" "+cprice;
	}
	
	
}
