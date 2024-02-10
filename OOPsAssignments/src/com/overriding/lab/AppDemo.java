package com.overriding.lab;

//Write a program with ‘Application’ class in package app.prog 
//containing properties like version, technology used, Developer and behaviors like install(),uninstall(). 
//Developer class has properties, devName, devExperience,skills and methods debugApp(),integrateCode(). 
//Application class further used to create ‘DesktopApplication’ and ‘WebApplication’ classes in same package.              
//Application class is used to create ‘MobileApplication’ class in app.mob package.
//Do appropriate utilization of super keyword in creation of respective class objects and show details of each.


class DesktopApplication extends Application {
	
    DesktopApplication(String version, String technologyUsed, Developer developer) {
        super(version, technologyUsed, developer);
    }
    
    @Override
    void install() {
        System.out.println("Installing the DesktopApplication...");
    }
    
    @Override
    void uninstall() {
        System.out.println("Uninstalling the DesktopApplication...");
    }
    
}

class WebApplication extends Application {

    WebApplication(String version, String technologyUsed, Developer developer) {
        super(version, technologyUsed, developer);
    }
    
    @Override
    void install() {
        System.out.println("Installing the WebApplication...");
    }
    
    @Override
    void uninstall() {
        System.out.println("Uninstalling the WebApplication...");
    }
}


public class AppDemo {
    public static void main(String[] args) {
        Developer desktopDeveloper = new Developer("John Doe", 5, "Java, C++");
        Developer webDeveloper = new Developer("Jane Smith", 3, "HTML, CSS, JavaScript");
       

        DesktopApplication desktopApp = new DesktopApplication("1.0", "JavaFX", desktopDeveloper);
        WebApplication webApp = new WebApplication("2.0", "HTML5, CSS3", webDeveloper);
       

        System.out.println("***********************Details of Desktop Application:*********");
        desktopApp.install();
        desktopApp.uninstall();
        desktopDeveloper.debugApp();
        desktopDeveloper.integrateCode();

        System.out.println("*************************Details of Web Application:*******************");
        webApp.install();
        webApp.uninstall();
        webDeveloper.debugApp();
        webDeveloper.integrateCode();

    }
}



