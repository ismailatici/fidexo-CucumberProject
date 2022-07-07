package com.fidexo.Pages;

import com.fidexo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FidexoLoginPage {
    public FidexoLoginPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(name = "login")
    public WebElement inputUsername;

    @FindBy(name = "password")
    public WebElement inputPassword;

    @FindBy(xpath = "//*[@id=\"wrapwrap\"]/main/div/form/div[3]/button")
    public WebElement loginButton;

    @FindBy(xpath ="//*[@id=\"wrapwrap\"]/main/div/form/div[3]/a")
    public WebElement resetPassword;




   /* @FindBy(css = "#login")
    public WebElement errorMessageOnlyPassword;

    @FindBy(css = "#password")
    public WebElement errorMessageOnlyUsername;

    String actualMessage = loginPage.errorMessageOnlyUsername.getAttribute("validationMessage");

    */


    public void login(String username,String password){
        inputUsername.sendKeys(username);
        inputPassword.sendKeys(password);
        loginButton.click();

    }


}
