package com.array.project;

public class Student {
	
	private int studentid;
	private String stdentName;
	private String studentCorse;
	private int courseFee;
	
	Student()
	{
		
	}
	
	public Student(int studentid, String stdentName, String studentCorse, int courseFee) {
		super();
		this.studentid = studentid;
		this.stdentName = stdentName;
		this.studentCorse = studentCorse;
		this.courseFee = courseFee;
	}

	public int getStudentid() {
		return studentid;
	}

	public void setStudentid(int studentid) {
		this.studentid = studentid;
	}

	public String getStdentName() {
		return stdentName;
	}

	public void setStdentName(String stdentName) {
		this.stdentName = stdentName;
	}

	public String getStudentCorse() {
		return studentCorse;
	}

	public void setStudentCorse(String studentCorse) {
		this.studentCorse = studentCorse;
	}

	public int getCourseFee() {
		return courseFee;
	}

	public void setCourseFee(int courseFee) {
		this.courseFee = courseFee;
	}

	@Override
	public String toString() {
		return "Student [studentid=" + studentid + ", stdentName=" + stdentName + ", studentCorse=" + studentCorse
				+ ", courseFee=" + courseFee + "]";
	}
	
	
	
	
	
	

}
