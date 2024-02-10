package com.overriding.lab;

public class Application {
   protected String version;
   protected String technologyUsed;
   protected Developer developer;

   protected Application()
    {
    	
    }
    
   protected Application(String version, String technologyUsed, Developer developer) {
        this.version = version;
        this.technologyUsed = technologyUsed;
        this.developer = developer;
    }

    void install() {
        System.out.println("Installing the application...");
    }

    void uninstall() {
        System.out.println("Uninstalling the application...");
    }
}