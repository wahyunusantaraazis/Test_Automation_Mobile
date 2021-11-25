package com.example.app.properties;

import java.util.HashMap;

public class PropertiesData {
    public HashMap<String,String> appiumProperties;

    public HashMap<String, String> getAppiumProperties() {
        return appiumProperties;
    }

    public void setAppiumProperties(HashMap<String, String> appiumProperties) {
        this.appiumProperties = appiumProperties;
    }
}
