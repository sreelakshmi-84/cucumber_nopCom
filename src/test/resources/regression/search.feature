Feature: search products feature


  @search
  Scenario: keyword search from home page

    Given I am on landing page
    When I search with keyword
      | keyword  |
      | computer |
    Then I should see atleast one search
