@dynamic @flaky
Feature: Dynamic textbox handling
Background: 
    Scenario: Validating the Login functionality with valid credentials
    Given User is on the login page
    When user enter email "ganesh@gmail.com" into Email filed
    And user enter password "gani@123" into Password field
    And user clicks on login button
    Then User should see the Home page on successful login
    
  Scenario: Validate entering text into dynamically loaded textbox
    Given user opens dynamic textbox page
    When user clicks on Add Textbox1 button
    Then user enters text into textbox1
    
    Scenario: Validate entering text into dynamically loaded textbox
    Given user opens dynamic textbox page
    When user clicks on Add Textbox1 button
    Then user enters text into textbox1
    
    Scenario: Validate entering text into dynamically loaded textbox
    Given user opens dynamic textbox page
    When user clicks on Add Textbox1 button
    Then user enters text into textbox1
    
    Scenario: Validate entering text into dynamically loaded textbox
    Given user opens dynamic textbox page
    When user clicks on Add Textbox1 button
    Then user enters text into textbox1
    
    Scenario: Validate entering text into dynamically loaded textbox
    Given user opens dynamic textbox page
    When user clicks on Add Textbox1 button
    Then user enters text into textbox1
    
    Scenario: Validate entering text into dynamically loaded textbox
    Given user opens dynamic textbox page
    When user clicks on Add Textbox1 button
    Then user enters text into textbox1
    
