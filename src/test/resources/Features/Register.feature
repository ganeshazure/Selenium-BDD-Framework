@smoke
Feature: User Registration

  Scenario: Successful user registration
    Given I open the registration page
    When I enter valid personal details
    And I agree to the Privacy Policy
    And I click the Continue button
    Then I should see a success message or reach the account page
    
#Scenario: Registration fails when First Name is missing
  #Given I open the registration page
  #When I enter valid details except first name
  #And I agree to the Privacy Policy
  #And I click the Continue button
  #Then I should see an error message for the missing first name
    #Scenario: Registration fails with invalid email format
  #Given I open the registration page
  #When I enter personal details with an invalid email
  #And I agree to the Privacy Policy
  #And I click the Continue button
  #Then I should see an error message for invalid email
    #Scenario: Registration fails when passwords do not match
  #Given I open the registration page
  #When I enter personal details with mismatched passwords
  #And I agree to the Privacy Policy
  #And I click the Continue button
  #Then I should see an error message for password confirmation
    #Scenario: Registration fails when Privacy Policy is not agreed
  #Given I open the registration page
  #When I enter all valid personal details
  #And I do not agree to the Privacy Policy
  #And I click the Continue button
  #Then I should see an error message for missing agreement
    #Scenario: Registration fails with already registered email
  #Given I open the registration page
  #When I enter personal details with an already used email
  #And I agree to the Privacy Policy
  #And I click the Continue button
  #Then I should see a warning that the email is already registered
    #Scenario: Registration fails when all fields are left blank
  #Given I open the registration page
  #When I submit the registration form without entering any data
  #Then I should see required field error messages for all inputs
    