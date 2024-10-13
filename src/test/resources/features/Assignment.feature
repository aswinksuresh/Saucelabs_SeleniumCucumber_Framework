Feature: Verify different  scenarios of the application
  Background:
    Given  user open website
    Then verify that user is on login page
    When user login with username "standard_user" and password "secret_sauce"
    Then verify that user is on home page

Scenario: Verify products sorted Z to A
When user filters products from Z to A
Then verify products are sorted from Z to A

Scenario: Verify products sorted by price
When user filters products from high to low
Then verify products are sorted from high to low

Scenario: Verify on cart page total items equals to items  added in the cart
When user add all items to cart
Then verify cart icon quantity is equals to items you added in the cart
When user navigate to cart page
Then verify user is on cart page
Then Verify on cart page total items equals to items you added in the cart

Scenario: Verify total price is correct
When user add all items to cart
Then verify cart icon quantity is equals to items you added in the cart
When user navigate to cart page
Then verify user is on cart page
When user navigate to checkout page
Then verify user is on checkout page
When user navigate to review  page
Then verify user is on review page
Then verify total price is correct

Scenario: Verify remove button is not displayed
When user add all items to cart
Then verify cart icon quantity is equals to items you added in the cart
When user navigate to cart page
Then verify user is on cart page
When user navigate to checkout page
Then verify user is on checkout page
When user navigate to review  page
Then verify user is on review page
Then verify total price is correct
Then user click on finish button
Then verify user is on order confirmation page
When user click on back to home button
Then verify that user is on home page
Then verify remove button is not displayed on home page
