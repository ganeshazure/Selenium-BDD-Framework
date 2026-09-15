Feature: Shopping Cart - Add to Cart functionality
  As a user
  I want to add products to the cart
  So that I can purchase them successfully

  Background:
    Given user launches TutorialNinja application
    And user navigates to Products page

  # ---------------- POSITIVE SCENARIOS ----------------

  Scenario: Validate adding a product to cart with default quantity
    When user clicks Add to Cart for "MacBook"
    Then product should be added to cart with quantity "1"
    And success message should be displayed

  Scenario: Validate adding same product multiple times increases quantity
    When user clicks Add to Cart for "MacBook"
    And user clicks Add to Cart again for "MacBook"
    Then cart should show quantity "2" for "MacBook"

  Scenario: Validate adding product with updated quantity
    When user enters quantity "3" for product "MacBook"
    And user clicks Add to Cart
    Then product should be added to cart with quantity "3"

  Scenario: Validate adding multiple different products to cart
    When user adds product "MacBook" to cart
    And user adds product "iPhone" to cart
    Then cart should display both products
    And each product should have correct quantity

  Scenario: Validate updating product quantity from cart page
    Given product "MacBook" is added to cart
    When user updates quantity to "5" in cart
    Then cart should reflect updated quantity "5"
    And total price should be updated accordingly

  Scenario: Validate removing product from cart
    Given product "MacBook" is added to cart
    When user removes the product from cart
    Then cart should be empty

  Scenario: Validate cart count after adding product
    When user adds product "MacBook" to cart
    Then cart icon should show count "1"

  Scenario: Validate cart persistence after page refresh
    Given product "MacBook" is added to cart
    When user refreshes the page
    Then cart should still contain the product

  # ---------------- NEGATIVE SCENARIOS ----------------

  Scenario: Validate adding product with quantity zero
    When user enters quantity "0" for product "MacBook"
    And user clicks Add to Cart
    Then error message should be displayed
    And product should not be added to cart

  Scenario: Validate adding product with negative quantity
    When user enters quantity "-1" for product "MacBook"
    And user clicks Add to Cart
    Then validation message should be displayed
    And product should not be added to cart

  Scenario: Validate adding out-of-stock product
    When user attempts to add out-of-stock product "Canon EOS 5D"
    Then out-of-stock error message should be displayed
    And product should not be added to cart

  Scenario: Validate cart behavior on browser back and forward navigation
    Given product "MacBook" is added to cart
    When user navigates back and forward
    Then cart should still retain the product

  Scenario: Validate cart behavior after logout and login
    Given product "MacBook" is added to cart
    When user logs out and logs in again
    Then cart should retain products as per application behavior
