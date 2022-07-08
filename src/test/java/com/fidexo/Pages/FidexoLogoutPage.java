package com.fidexo.Pages;

import com.fidexo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class FidexoLogoutPage {


    public FidexoLogoutPage(){
        PageFactory.initElements(Driver.getDriver(),this);}

    @FindBy(xpath ="//*[@id=\"oe_main_menu_navbar\"]/div[2]/ul[2]/li/ul/li[6]/a")
    public WebElement logoutButton;

    @FindBy(xpath ="//*[@id=\"oe_main_menu_navbar\"]/div[2]/ul[2]/li/a/span")
    public WebElement userProfile;

    @FindBy(xpath = "//*[@id=\"modal_2\"]/div/div/div[2]")
    public WebElement arizaMessage;

    @FindBy(xpath = "//*[@id=\"wrapwrap\"]/header/div/div/div[1]/a")
    public WebElement loginText;

    @FindBy(xpath = "//*[@id=\"modal_2\"]/div/div/div[2]")
    public WebElement stepBackWarning;





}
