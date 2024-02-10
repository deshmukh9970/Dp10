package com.array.objects3;

import java.util.Arrays;

public class Supplier {
	
	private int sid;
	private String sname;
	private long moblieNo;
	private Iteam iteam[];
	
	Supplier()
	{
		
	}

	public Supplier(int sid, String sname, long moblieNo, Iteam[] iteam) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.moblieNo = moblieNo;
		this.iteam = iteam;
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public long getMoblieNo() {
		return moblieNo;
	}

	public void setMoblieNo(long moblieNo) {
		this.moblieNo = moblieNo;
	}

	public Iteam[] getIteam() {
		return iteam;
	}

	public void setIteam(Iteam[] iteam) {
		this.iteam = iteam;
	}

	@Override
	public String toString() {
		return "Supplier [sid=" + sid + ", sname=" + sname + ", moblieNo=" + moblieNo + ", iteam="
				+ Arrays.toString(iteam) + "]";
	}
	
	
	
	
	
	

}
