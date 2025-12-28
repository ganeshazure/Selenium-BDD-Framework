Feature: User Registration

  Scenario: Successful registration with valid details
    Given I am on the registration page
    When I enter first name as "John"
    And I enter last name as "Doe"
    And I enter email as "john.doe@example.com"
    And I enter telephone as "1234567890"
    And I enter password as "password123"
    And I confirm password as "password123"
    And I agree to the privacy policy
    And I click on continue
    Then I should be redirected to the next page

    Scenario: Attempt to register with an empty first name
    Given I am on the registration page
    When I enter first name as ""
    And I enter last name as "Doe"
    And I enter email as "john.doe@example.com"
    And I enter telephone as "1234567890"
    And I enter password as "password123"
    And I confirm password as "password123"
    And I agree to the privacy policy
    And I click on continue
    Then I should see an error message for the first name field
    
     Scenario: Attempt to register with mismatched passwords
    Given I am on the registration page
    When I enter first name as "John"
    And I enter last name as "Doe"
    And I enter email as "john.doe@example.com"
    And I enter telephone as "1234567890"
    And I enter password as "password123"
    And I confirm password as "password321"
    And I agree to the privacy policy
    And I click on continue
    Then I should see an error message that passwords do not match