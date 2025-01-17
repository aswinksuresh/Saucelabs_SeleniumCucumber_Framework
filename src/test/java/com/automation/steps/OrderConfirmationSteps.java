package com.automation.steps;

import com.automation.pages.OrderConfirmationPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class OrderConfirmationSteps {
    OrderConfirmationPage orderConfirmationPage = new OrderConfirmationPage();
    @Then("verify user is on order confirmation page")
    public void verify_user_is_on_order_confirmation_page() {
          Assert.assertTrue(orderConfirmationPage.isOrderConfirmationMsgDisplayed());
    }

    @When("user click on back to home button")
    public void userClickOnBackToHomeButton() {
        orderConfirmationPage.backTOHomeBtnClick();
    }
}
