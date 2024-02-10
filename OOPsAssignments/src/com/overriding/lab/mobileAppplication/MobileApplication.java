package com.overriding.lab.mobileAppplication;

import com.overriding.lab.Application;
import com.overriding.lab.Developer;

public class MobileApplication extends Application {
    protected String mobileSpecificProperty;

    public MobileApplication(String version, String technologyUsed, Developer developer, String mobileSpecificProperty) 
    {
        super(version,technologyUsed,developer);
        this.mobileSpecificProperty = mobileSpecificProperty;
    }
}