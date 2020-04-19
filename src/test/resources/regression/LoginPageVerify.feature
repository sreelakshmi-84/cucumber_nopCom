@login
Feature: Registered customer signing to nopCommerce

  Scenario Outline: As a registered customer logging to nopCommerce with valid credentials
    Given I am on landing page
    When I click on Login icon from landing page
    Then I should be navigated to loginpage
    When I enter email "<email>" and password "<password>"
    And Click on login button
    Then I should be successfully logged in and see my account

    Examples:
      | email                  | password      |
      | 81482mi@yahoo.com      | mike1login    |
      | 44625ab@rocketmail.com | abraham1login |

  Scenario Outline: As a registered customer logging to nopCommerce with invalid credentials
    Given I am on landing page
    When I click on Login icon from landing page
    Then I should be navigated to loginpage
    When I enter email "<email>" and password "<password>"
    And Click on login button
    Then I should get error message

    Examples:
      | email                       | password      |
      | 512jew4243224233o@gmail.com | ohn1login     |
      | 44627ab23443@rocketmail.com | abraham1login |
