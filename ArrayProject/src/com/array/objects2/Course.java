package com.array.objects2;

public class Course {
	
	private int cid;
	private String sname;
	
	Course()
	{
		
	}

	public Course(int cid, String sname) {
		super();
		this.cid = cid;
		this.sname = sname;
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	@Override
	public String toString() {
		return "Course [cid=" + cid + ", sname=" + sname + "]";
	}
	
	
	

}
