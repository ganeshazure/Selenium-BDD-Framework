@tag
Feature: Login fature

  @tag1
  Scenario: validate user is able to login with valid credentials
    Given user is on the login page
    When user enter username "ganes@gmail.com" into username field
    And user enter password "ganes@123" into password field
    And user clicks on login button
    Then user should see homepage