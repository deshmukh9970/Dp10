package com.cotainment.classwork;

public class Author {
	
	private int aid;
	private String aname;
	
	
	Author()
	{
		
	}
  
	Author(int aid, String aname)
	{
		this.aid=aid;
		this.aname=aname;
	}
	
	public void setAid(int aid)
	{
		this.aid=aid;
	}
	
	public int getAid()
	{
		return aid;
	}

	public String getAname() {
		return aname;
	}

	public void setAname(String aname) {
		this.aname = aname;
	}
	
	public String toString()
	{
		return "Author eid : "+aid+" "+aname;
	}
}
