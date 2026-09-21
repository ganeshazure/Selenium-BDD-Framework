@Sau_demo_login
Feature: SauceDemo Product Functionality

  Background:
    Given User launches the SauceDemo application
    When User enters username "standard_user"
    And User enters password "secret_sauce"
    And User clicks on Login button

  Scenario: Verify products are displayed
    Then User should see the Products page

  Scenario: Add product to cart
    When User adds "Sauce Labs Backpack" to the cart
    Then Cart should display "1" item