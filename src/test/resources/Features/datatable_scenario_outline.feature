@reg_new
Feature: User Registration on TutorialsNinja


  # ✅ Using DataTable as List
  Scenario: Register with valid data using List
    When User enters the following details
      | Ganesh | Kumar | ganesh123@test.com | 9876543210 | pass123 | pass123 |
    And User selects Subscribe as "No"
    And User accepts the Privacy Policy
    And User clicks on Continue
    Then Registration should be successful

  # ✅ Using DataTable as Map
  Scenario: Register with valid data using Map
    When User enters details as map
      | FirstName | Suresh             |
      | LastName  | Reddy              |
      | Email     | suresh@test.com    |
      | Telephone | 8888888888         |
      | Password  | pass456            |
      | Confirm   | pass456            |
    And User selects Subscribe as "Yes"
    And User accepts the Privacy Policy
    And User clicks on Continue
    Then Registration should be successful

  # ✅ Using DataTable as Maps (multiple rows)
  Scenario: Register multiple users using Maps
    When User registers with multiple accounts
      | FirstName | LastName | Email              | Telephone  | Password | Confirm |
      | Ramesh    | Varma    | ramesh1@test.com   | 9090909090 | test111  | test111 |
      | Mahesh    | Babu     | mahesh1@test.com   | 8080808080 | test222  | test222 |
    Then All users should be registered successfully

  # ✅ Using Scenario Outline
  Scenario Outline: Register with different data
    When User enters "<FirstName>", "<LastName>", "<Email>", "<Telephone>", "<Password>", "<Confirm>"
    And User selects Subscribe as "<Subscribe>"
    And User accepts the Privacy Policy
    And User clicks on Continue
    Then Registration should be successful

    Examples:
      | FirstName | LastName | Email              | Telephone | Password | Confirm | Subscribe |
      | Ravi      | Teja     | ravi@test.com      | 9876541230 | pass111  | pass111 | No        |
      | Latha     | Devi     | latha@test.com     | 9865432109 | pass222  | pass222 | Yes       |
