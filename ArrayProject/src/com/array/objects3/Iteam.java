package com.array.objects3;

public class Iteam {
	
	private int id;
	private String Iname;
	private int icost;
	
	public Iteam()
	{
		
	}
	
	public Iteam(int id, String iname, int icost) {
		super();
		this.id = id;
		Iname = iname;
		this.icost = icost;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getIname() {
		return Iname;
	}

	public void setIname(String iname) {
		Iname = iname;
	}

	public int getIcost() {
		return icost;
	}

	public void setIcost(int icost) {
		this.icost = icost;
	}

	@Override
	public String toString() {
		return "Iteam [id=" + id + ", Iname=" + Iname + ", icost=" + icost + "]";
	}
	
	
	
	
	

}
