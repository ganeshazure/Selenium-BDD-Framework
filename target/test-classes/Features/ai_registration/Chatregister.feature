@clogin
Feature: TutorialsNinja Registration Functionality

  Scenario: Register with valid details
  Given I am on the TutorialsNinja registration page
    When I enter valid first name
    And I enter valid last name
    And I enter unique email
    And I enter valid telephone number
    And I enter valid password
    And I enter matching confirm password
    And I select newsletter No
    #And I agree to the Privacy
    And I click on Continue button
    #Then I should be successfully registered


 