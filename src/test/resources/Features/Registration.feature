@reg
Feature: Registration

  Scenario: User fills out the form and submits it
    Given I am on the form page
    When I enter "John" as the first name
    And I enter "Doe" as the last name
    And I enter "john.doe@example.com" as the email
    And I enter "1234567890" as the telephone
    And I enter "password123" as the password
    And I enter "password123" as the password confirm
    And I select "No" as the newsletter option
    And I submit the form
    Then I should see a confirmation message
