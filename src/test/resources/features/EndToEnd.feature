Feature: Verify end to end scenarios of the application

  @Smoke
  Scenario: Verify user can place order
    Given  user open website
    Then verify that user is on login page
    When user login with username "standard_user" and password "secret_sauce"
    Then verify that user is on home page
    When user clicks on add to cart button of the first item
    Then verify cart icon displays quantity one
    When user clicks on the cart icon
    Then verify user is on cart page
    When user clicks on checkout button
    Then verify user is on checkout page
    When user fill on  all checkout details
    And click on continue button
    Then verify user is on review page
    When user click on finish button
    Then verify user is on order confirmation page




