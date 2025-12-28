@logitest
Feature: User Login

  Scenario: Successful login with valid credentials
    Given the user navigates to the login page
    When the user enters a valid email and password
    Then the user should be logged in and redirected to the homepage
    
    Scenario: Login with an unregistered email
    Given the user navigates to the login page
    When the user enters an unregistered email "unregistered@example.com" and a valid password
    Then the user should see an error message indicating the account is not found

  Scenario: Login with an incorrect password
    Given the user navigates to the login page
    When the user enters a valid email "valid@example.com" and an incorrect password "wrongpassword"
    Then the user should see an error message indicating the password is incorrect

  Scenario: Login with an empty email field
    Given the user navigates to the login page
    When the user leaves the email field empty and enters a password
    Then the user should see an error message indicating that the email is required

  Scenario: Login with an empty password field
    Given the user navigates to the login page
    When the user enters an email but leaves the password field empty
    Then the user should see an error message indicating that the password is required

  Scenario: Login with both fields empty
    Given the user navigates to the login page
    When the user leaves both the email and password fields empty
    Then the user should see an error message indicating that both fields are required