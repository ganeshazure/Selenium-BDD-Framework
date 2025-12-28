Feature: Search Samsung phones on Amazon with specific filters

@samsung
  Scenario: List Samsung phones with camera resolution 20 MP and above, model year 2023, and price range £50 - £100
    Given I open Amazon website
    When I search for "Samsung phones"
    And I apply filters for camera resolution 20 MP and above
    #And I apply filters for model year 2023
    And I apply filters for price range 50 to 100
    Then I should see the list of Samsung phones with these specifications