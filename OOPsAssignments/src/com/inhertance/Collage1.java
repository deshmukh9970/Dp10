package com.inhertance;

public class Collage1 extends Student{
	
	private int cid;
	
	

	public Collage1(String sname, int cid) {
		super(sname);
		this.cid = cid;
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}
	
	

}
