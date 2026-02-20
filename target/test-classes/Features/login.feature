@logintest
Feature: login

Scenario: Validating the Login functionality with valid credentials
    Given User is on the login page
    When user enter email "ganesh@gmail.com" into Email filed
    And user enter password "gani@123" into Password field
    And user clicks on login button
    Then User should see the Home page on successful login
    Scenario: Validating the Login functionality with invalid credentials
    Given User is on the login page
    When user enter email "ganesh@gmail.com" into Email filed
    And user enter password "gani@123" into Password field
    And user clicks on login button
    Then User should see the Home page on successful login