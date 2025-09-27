package com.magento.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import java.time.Duration;

public class DriverManager {

    protected  static ThreadLocal <WebDriver> driver = new ThreadLocal<>();

    public static WebDriver loadDriverFromConfig() {
        String browser = ConfigReader.get("browser");
        String browserVersion = ConfigReader.get("browserVersion");
        int timeout = Integer.parseInt(ConfigReader.get("timeout"));
        boolean headless = Boolean.parseBoolean(ConfigReader.get("headless"));
        return loadDriver(browser, browserVersion, timeout, headless);
    }

    public static WebDriver loadDriver(String browser, String browserVersion, int timeout, boolean headless){
        if (browser.equalsIgnoreCase("chrome")) {
            ChromeOptions options = new ChromeOptions();
        
            if (browserVersion != null && !browserVersion.isEmpty()) {
                options.setBrowserVersion(browserVersion);
            }
        
            if (headless) {
                options.addArguments("--headless=new");
            }
            
            options.addArguments("--no-sandbox");
            options.addArguments("--disable-dev-shm-usage");
            options.addArguments("--disable-gpu"); 
            options.addArguments("--remote-allow-origins=*");
            options.addArguments("--user-data-dir=/tmp/chrome-profile-" + System.currentTimeMillis());
        
            driver.set(new ChromeDriver(options));
        }else if (browser.equalsIgnoreCase("firefox")) {
            FirefoxOptions options = new FirefoxOptions();
            if (browserVersion != null && !browserVersion.isEmpty()) {
                options.setBrowserVersion(browserVersion);
            }
            if (headless) options.addArguments("--headless");
            driver.set(new FirefoxDriver(options));
        } else if (browser.equalsIgnoreCase("edge")) {
            EdgeOptions options = new EdgeOptions();
            if (browserVersion != null && !browserVersion.isEmpty()) {
                options.setBrowserVersion(browserVersion);
            }
            if (headless) options.addArguments("--headless=new");
            driver.set(new EdgeDriver(options));
        }else{
            System.out.println("unsupported driver");
        }

        getDriver().manage().deleteAllCookies();
        getDriver().manage().window().maximize();
        getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(timeout));

        return getDriver();
    }


    public static WebDriver getDriver() {
        return driver.get();
    }

    public static void quitDriver() {
        if (driver.get() != null) {
            driver.get().quit();
            driver.remove();
        }
    }

}
