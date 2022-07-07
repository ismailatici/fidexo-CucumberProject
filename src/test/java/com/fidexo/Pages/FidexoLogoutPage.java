package com.fidexo.Pages;

import com.fidexo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class FidexoLogoutPage {


    public FidexoLogoutPage(){
        PageFactory.initElements(Driver.getDriver(),this);}

    @FindBy(xpath ="(//ul[@class='dropdown-menu'])[2]/li[6]/a")
    public WebElement logoutButton;

    @FindBy(xpath ="//span[@class='oe_topbar_name']")
    public WebElement userProfilename;

    @FindBy(xpath = "//p[@class='alert alert-danger']")
    public WebElement errorMessage;

    @FindBy(css = "a.navbar-brand")
    public WebElement loginText;

    @FindBy(xpath = "//div[@class='o_dialog_warning modal-body']")
    public WebElement stepBackWarning;




}
