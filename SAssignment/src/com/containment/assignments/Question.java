package com.containment.assignments;

public class Question {
	
	private int qid;
	private String qname;
	
	Question()
	{
			
	}
	
	Question(int qid,String qname)
	{
		this.qid=qid;
		this.qname=qname;
	}
	
	public void setQid(int qid)
	{
		this.qid=qid;
	}
	
	public int getQid()
	{
		return qid;
	}
	
	public void setQname(String qname)
	{
		this.qname=qname;
	}
	
	public String getQname()
	{
		return qname;
	}
	
	public String toString()
	{
		return "Quention "+qid+"\t Qname "+qname;
	}

}
