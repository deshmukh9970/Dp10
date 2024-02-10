package com.inhertance;

public class School1 extends Student{

	
	
	protected int sid;
	
	School1(String sname,int sid)
	{
        super(sname);
		this.sid=sid;
		System.out.println("School");
		
		
	}

	

	@Override
	public String toString() {
		return ", sid=" + sid+" "+getSname();
	}
}
