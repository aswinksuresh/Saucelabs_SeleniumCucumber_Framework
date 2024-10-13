package com.automation.steps;

import com.automation.pages.CartPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class CartSteps {
    CartPage cartPage = new CartPage();
    @Then("verify user is on cart page")
    public void verify_user_is_on_cart_page() {
        Assert.assertTrue(cartPage.isCartPageDisplayed());
    }

    @When("user clicks on checkout button")
    public void user_clicks_on_checkout_button() {
        cartPage.clickOnCheckoutBtn();

    }


    @When("user navigate to checkout page")
    public void userNavigateToCheckoutPage() {
        cartPage.clickOnCheckoutBtn();
    }
}
