@reg_json
Feature: User Registration Using JSON

  Scenario: Register a new user with JSON test data

    Given JSON user opens the application browser
    And JSON user opens the registration page
    When JSON user loads "RegisterData.json" and enters registration details
    And JSON user selects the Privacy Policy agreement
    And JSON user submits the registration form
