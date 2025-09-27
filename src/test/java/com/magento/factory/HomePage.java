package com.magento.factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {

    WebDriver driver;
    /**
     * Web Elements
     * **/
    @FindBy(linkText = "Create an Account")
    WebElement registerLink;

    @FindBy(linkText = "Sign In")
    WebElement loginLink;

    /**
     * Constructor
     * **/

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    /**
     * Metodos
     * **/
    public void goToRegister(){
        registerLink.click();
    }

    public void goToSingIn(){
        loginLink.click();
    }

    public void handleGoogleVignette(){
        try {
            if (driver.getCurrentUrl().contains("#google_vignette")) {
                driver.navigate().back();
                Thread.sleep(1000); // Espera breve para evitar errores de sincronización
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
