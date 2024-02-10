package com.overriding.lab;

public class Developer {
	protected String devName;
	protected int devExperience;
	protected String skills;

	protected Developer()
    {
    	
    }
    
	protected Developer(String devName, int devExperience, String skills) {
        this.devName = devName;
        this.devExperience = devExperience;
        this.skills = skills;
    }

    void debugApp() {
        System.out.println("Debugging the application...");
    }

    void integrateCode() {
        System.out.println("Integrating code for the application...");
    }
}
