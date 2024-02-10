package com.containment.assignments;

public class SubTopic {
	
	private int sid;
	private String sname;
	private Question question;
	
	SubTopic()
	{
		
	}
	
	SubTopic(int sid,String sname,Question question)
	{
		this.sid=sid;
		this.sname=sname;
		this.question=question;
		
	}
	
	
	public void setSid(int sid)
	{
		this.sid=sid;
		
	}
	
	public int getSid()
	{
		return sid;
	}
	
	public void setSname(String sname)
	{
		this.sname=sname;
	}
	
	public String getSname()
	{
		return sname;
	}
	
	public void setQuestion(Question question)
	{
		this.question=question;
	}
	
	public Question getQuestion()
	{
		return question;
	}
	
	public String toString()
	{
		return "Subtopic "+sid+" \t sname "+sname+" \t Question "+question;
	}

}
