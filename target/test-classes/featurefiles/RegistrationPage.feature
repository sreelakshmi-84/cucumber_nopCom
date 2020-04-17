Feature: Customer Registration to nopCommerce

  @register
  Scenario Outline: As a customer register to nopCommerce with valid details
    Given Customer is on nopCommerce website
    When Customer Clicks on registration link
    Then Registration form should be shown with text fileds to enter
    When Customer enters valid details "<firstName>" "<lastName>" "<email>" and "<password>"
    And clicks on Submit
    Then Customer should receive successdull message
    Then quit the browser


    Examples:
      | firstName | lastName | email             | password      |
      | john      | K        | jo@gmail.com      | john1login    |
      | mike      | S        | mi@yahoo.com      | mike1login    |
      | abraham   | L        | ab@rocketmail.com | abraham1login |







