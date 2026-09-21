@megfeature
Feature: search products

  Scenario: search for iphone
    Given i am on homepage
    And i enter iphone into search box
    When I clik on search button
    Then I should see ihone in search results

