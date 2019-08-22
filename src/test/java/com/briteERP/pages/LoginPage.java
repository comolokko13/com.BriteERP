package com.briteERP.pages;

import com.briteERP.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    public LoginPage(){

        PageFactory.initElements(Driver.getDriver(),this);

    }
//1
//2
    @FindBy(xpath = "//input[@id='login']")
    private
    WebElement email;

    @FindBy(id = "password")
    private
    WebElement password;

    @FindBy(xpath = "//button[contains(text(),'Log in')]")
    private
    WebElement loginButton;



    public void login(String email,String password){
        this.email.sendKeys(email);
        this.password.sendKeys(password);
        loginButton.click();
    }
}
