package com.fidexo.step_definitions;

import com.fidexo.Pages.FidexoLoginPage;
import com.fidexo.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DemoStepdefinitions {
    FidexoLoginPage fidexoLoginPage=new FidexoLoginPage();


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


}
