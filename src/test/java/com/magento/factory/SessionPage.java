package com.magento.factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SessionPage {

    WebDriver driver;

    @FindBy(id = "email") protected WebElement inpEmail;
    @FindBy(id = "pass") protected WebElement inpPassword;
    @FindBy(id = "send2") protected WebElement btnLogin;

    public SessionPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public void doLogin(String user,String pass){
        inpEmail.sendKeys(user);
        inpPassword.sendKeys(pass);
        btnLogin.click();
    }

}
