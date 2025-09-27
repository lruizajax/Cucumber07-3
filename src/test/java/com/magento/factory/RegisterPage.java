package com.magento.factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage{

    WebDriver driver;
    /**
     * Web Elements
     * **/

    @FindBy(how = How.ID, using = "firstname")
    protected WebElement inpFName;
    @FindBy(how = How.ID, using = "lastname")
    protected  WebElement inpLName;
    @FindBy(how = How.ID, using = "email_address")
    protected  WebElement inpEmail;
    @FindBy(how = How.ID, using = "password")
    protected  WebElement inpPassword;
    @FindBy(how = How.ID, using = "password-confirmation")
    protected  WebElement inpConPassword;
    @FindBy(how =   How.XPATH, using = "//*[@title='Create an Account']")
    protected WebElement btnRegister;

    /**
     * Constructor
     * **/
    public RegisterPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    /**
     * Metodos
     * **/
    public void fillOutRegisterForm(String fname, String lname, String email,String pass){
        inpFName.sendKeys(fname);
        inpLName.sendKeys(lname);
        inpEmail.sendKeys(email);
        inpPassword.sendKeys(pass);
        inpConPassword.sendKeys(pass);
    }

    public void clickRegisterButton(){
        btnRegister.submit();
    }

}
