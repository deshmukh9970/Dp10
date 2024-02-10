package com.containment.assignments;

public class Topic {
	
	private int tid;
	private String tname;
	private SubTopic subtopic;
	
	Topic()
	{
		
	}
	
	Topic(int tid,String tname,SubTopic subtopic)
	{
		this.tid=tid;
		this.tname=tname;
		this.subtopic=subtopic;
	}
	
	 public void setSubtopic(SubTopic subtopic)
	 {
		 this.subtopic=subtopic;
	 }
	 
	 public SubTopic getSubtopic()
	 {
		 return subtopic;
	 }

	public int getTid() {
		return tid;
	}

	public void setTid(int tid) {
		this.tid = tid;
	}

	public String getTname() {
		return tname;
	}

	public void setTname(String tname) {
		this.tname = tname;
	}
	 
	 public String toString()
	 {
		 return "Topic "+tid+"\t Name "+tname+"\t Subtopic "+subtopic;
	 }

}
