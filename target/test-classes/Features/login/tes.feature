
@testfeature
Feature: test feature

  @tag1
  Scenario: search a product
    Given user navigates to Products page
    When I serch for apple product
    Then I validate the product
