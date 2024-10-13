package com.automation.steps;

import com.automation.pages.CartPage;
import com.automation.pages.HomePage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.Collections;
import java.util.List;

public class HomeSteps {
    HomePage homePage = new HomePage();
    CartPage cartPage = new CartPage();
    int homeProductsCount;

    @Then("verify that user is on home page")
    public void verify_that_user_is_on_home_page() {
          Assert.assertTrue(homePage.isHomePageDisplayed());
    }

    @When("user clicks on add to cart button of the first item")
    public void user_clicks_on_add_to_cart_button_of_the_first_item() {
       homePage.clickOnAddToCartOfFirstItem();
    }

    @Then("verify cart icon displays quantity one")
    public void verify_cart_icon_displays_quantity_one() {
         Assert.assertEquals(homePage.isCartIconCountCorrect(),"1");
    }

    @When("user clicks on the cart icon")
    public void user_clicks_on_the_cart_icon() {
       homePage.clickOnShoppingCartLink();
    }

    @When("user filters products from Z to A")
    public void userFiltersProductsFromZToA() {
        homePage.doZtoASort();
    }

    @Then("verify products are sorted from Z to A")
    public void verifyProductsAreSortedFromZToA() {
        Assert.assertTrue(homePage.isSortedFromZtoA());
    }

    @When("user filters products from high to low")
    public void userFiltersProductsFromHighToLow() {
        homePage.doPriceSortHighToLow();

    }

    @Then("verify products are sorted from high to low")
    public void verifyProductsAreSortedFromHighToLow() {
        Assert.assertTrue(homePage.isSortedByHighToLow());
    }

    @When("user add all items to cart")
    public void userAddAllItemsToCart() {
        homeProductsCount = homePage.getAllProducts().size();
        homePage.clickOnAllCartButtons();

    }

    @Then("verify cart icon quantity is equals to items you added in the cart")
    public void verifyCartIconQuantityIsEqualsToItemsYouAddedInTheCart() {
        Assert.assertEquals( Integer.parseInt(homePage.isCartIconCountCorrect()),homeProductsCount);

    }
    @When("user navigate to cart page")
    public void userNavigateToCartPage() {
       homePage.clickOnShoppingCartLink();
    }

    @Then("Verify on cart page total items equals to items you added in the cart")
    public void verifyOnCartPageTotalItemsEqualsToItemsYouAddedInTheCart() {
        int cartProductsCount = cartPage.getAllProducts().size();
         Assert.assertEquals(cartProductsCount,homeProductsCount);

    }

    @Then("verify remove button is not displayed on home page")
    public void verifyRemoveButtonIsNotDisplayedOnHomePage() {
        Assert.assertTrue(homePage.isRemoveBtnDisplayed());
    }
}
