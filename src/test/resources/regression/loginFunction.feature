Feature: MyAccount-Login
  Description: This feature will test a login functionality

  Scenario: user should be able to login successfully
    Given user is on home page
    When user click on login
    And Enter registered "lellasreelakshmi@gmail.com" and "Aanya@2020"
    And user click on login button
    Then user must be able to login the web page
  And user logout from the application


  Scenario: Log-in with invalid username and password
   Given user is on home page
    When user click on login
    And Enter invalid username and password
      |username                   |password|
      |lellasreelakshmi@gmail.com |Aanya@201|
      |rsunkara@gmail.com |Nani@2020 |
    And user click on login button
    Then user must not login to the web page

