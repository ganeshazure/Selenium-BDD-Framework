@Registration
Feature: Registration feature

  Scenario: Register with valid details
    Given User is on the Registration page
    When user enter firstname "ganesh" into firstname filed
    And user enter Lastname "gani" into lastname field
    And user enter Email "ganesh@gmail.com" into email feild
    And user enter telephone "9123567123" into telephone field
    And user enter password "123456" into password filed
    And user enter confirmpassword "123456" into confirmpassword field
    And user click the checkbox into checkbox field
    Then registration should be successfull 