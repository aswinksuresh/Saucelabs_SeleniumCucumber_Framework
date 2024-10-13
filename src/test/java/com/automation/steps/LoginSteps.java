package com.automation.steps;

import com.automation.pages.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class LoginSteps {
    LoginPage loginPage = new LoginPage();
    @Given("user open website")
    public void user_open_website() {
     loginPage.openWebsite();
    }

    @Then("verify that user is on login page")
    public void verify_that_user_is_on_login_page() {
        Assert.assertTrue(loginPage.isLoginPageDisplayed());
    }

    @When("user login with username {string} and password {string}")
    public void user_login_with_username_and_password(String username ,String password) {

           loginPage.doLogin(username,password);
    }









}
