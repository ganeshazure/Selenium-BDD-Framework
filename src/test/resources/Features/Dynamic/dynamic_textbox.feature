@dyanmic
Feature: Dynamic textbox handling

  Scenario: Validate entering text into dynamically loaded textbox
    Given user opens dynamic textbox page
    When user clicks on Add Textbox1 button
    Then user enters text into textbox1
