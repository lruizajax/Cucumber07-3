package com.magento.utils;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.util.Properties;

public class Hooks extends DriverManager {

    protected Properties properties;

    @Before
    public void setup(){
        ConfigReader.load("qa");
        DriverManager.loadDriverFromConfig();
    }

    @After
    public void tearDown(Scenario scenario){
        try{
            if(scenario.isFailed()){
                final byte[] screenshot = ((TakesScreenshot) DriverManager.getDriver()).getScreenshotAs(OutputType.BYTES);
                scenario.attach(screenshot,"image/png",scenario.getName());
            }
        }finally {
            DriverManager.quitDriver();
            ConfigReader.clear();
        }
    }
}
