Feature:User Registration
  Description:This feature test a Registration functionality
  @RegTest
  Scenario:User Registration with personal details
    Given user is on registration page
    When user click on registration
    And Enter Firstname "Sree" and Lastname "Lella"
    And select DOB date "20" and month "10" and year "1985"
    And Enter Email address "lellasreelakshmi@gmail.com" and Company name "freelance"
    And Enter Password "Aanya@2020" and Confirm Password "Aanya@2020"
    And user click registration button
    Then user successfully registered to the application




  @RegTest
  Scenario Outline: User Registration with  invalid personal details
    Given user is on registration page
    When user click on registration
    And Enter Firstname "<firstname>" and Lastname "Lella"
    And select DOB date "20" and month "10" and year "1985"
    And Enter Email address "<email>" and Company name "freelance"
    And Enter Password "<password>" and Confirm Password "<confirmPassword>"
    And user click registration button
    Then user must not registered to the application
    Examples:
      |email                            | firstname |password |confirmPassword|
      | yashwantrsunkara@gmail.com     | sree       |Aanya@2020|Aanya2021     |
