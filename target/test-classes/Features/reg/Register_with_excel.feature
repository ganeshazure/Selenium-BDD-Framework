@reg_excel
Feature: Registration

  Scenario: User fills out the form and submits it

    Given User launches browser
    And User navigates to register page
    When I read registration data from Excel and fill the form
    And User agrees to the Privacy Policy
    And User clicks on Continue button
    Then I should see the account page