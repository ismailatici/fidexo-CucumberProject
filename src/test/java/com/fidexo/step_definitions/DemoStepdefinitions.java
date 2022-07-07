package com.fidexo.step_definitions;

import com.fidexo.Pages.FidexoLoginPage;
import com.fidexo.Pages.FidexoLogoutPage;
import com.fidexo.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class DemoStepdefinitions {
    FidexoLoginPage fidexoLoginPage=new FidexoLoginPage();
    FidexoLogoutPage fidexoLogoutPage=new FidexoLogoutPage();


    @Given("user is on the login page")
    public void user_is_on_the_login_page() {
        Driver.getDriver().get("https://qa.fidexio.com");



    }
    @When("user enters the {string} and invalid password {string}")
    public void user_enters_the_and_password(String username, String password) {
        fidexoLoginPage.inputUsername.sendKeys(username);

        fidexoLoginPage.inputPassword.sendKeys(password);


    }
    @Then("user is on the homepage")
    public void user_is_on_the_homepage() {
        System.out.println("user is on the home page");

    }

    @Then("user see the error message")
    public void userSeeTheErrorMessage() {
        System.out.println("user see the error message");
    }

    @Then("user see the message")
    public void userSeeTheMessage() {
        System.out.println("user see the message");
    }

    @When("user clicks the reset password button")
    public void userClicksTheResetPasswordButton() {
        fidexoLoginPage.resetPassword.click();
    }

    @Then("user see email input page")
    public void userSeeEmailInputPage() {
        System.out.println("User see Email input Page");
    }

    @Then("user see that password is in bullet signs by default")
    public void userSeeThatPasswordIsInBulletSignsByDefault() {
        System.out.println("User see that password is bullet signs by default");

    }

    @And("user clicks the Enter Button")
    public void userClicksTheEnterButton() {
    }

    @And("user clicks the Log in Button")
    public void userClicksTheLogInButton() {
        fidexoLoginPage.loginButton.click();
    }

    @When("user enters valid the {string} and password {string}")
    public void userEntersValidTheAndPassword(String username, String password) {
        fidexoLoginPage.inputUsername.sendKeys(username);

        fidexoLoginPage.inputPassword.sendKeys(password);

    }

    @When("user enters invalid the {string} and valid password {string}")
    public void userEntersInvalidTheAndValidPassword(String username, String password) {
        fidexoLoginPage.inputUsername.sendKeys(username);

        fidexoLoginPage.inputPassword.sendKeys(password);

    }

    @When("user enters the username {string} and password {string}")
    public void userEntersTheUsernameAndPassword(String username, String password) {
        fidexoLoginPage.inputUsername.sendKeys(username);

        fidexoLoginPage.inputPassword.sendKeys(password);

    }



    @When("user enters the {string} and  {string}")
    public void userEntersTheAnd(String username, String password) {
    }


    @And("user is clicks on the username")
    public void userIsClicksOnTheUsername() {
        fidexoLogoutPage.userProfilename.click();

    }

    @When("user enters the logout button")
    public void userEntersTheLogoutButton() {
        fidexoLogoutPage.logoutButton.click();

    }

    @Then("user see text at the top of the page {string}")
    public void userSeeTextAtTheTopOfThePage(String expectedText) {
        String actualText = fidexoLogoutPage.loginText.getText();
        System.out.println(actualText);

        Assert.assertEquals(expectedText, actualText);

    }

    @Then("user clicks the step back button")
    public void userClicksTheStepBackButton() {
        Driver.getDriver().navigate().back();

    }

    @Then("user see error message{string}")
    public void userSeeErrorMessage(String errorMessage) {
        Assert.assertEquals(errorMessage, fidexoLogoutPage.stepBackWarning.getText());

    }
}
