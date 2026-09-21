@ai_registration
Feature: User Registration

Scenario: Successful user registration

Given I am on the TutorialsNinja registration page
When I enter valid registration details
And I select No for newsletter
And I agree to the Privacy Policy
And I click the Continue button
Then the registration should be successful
