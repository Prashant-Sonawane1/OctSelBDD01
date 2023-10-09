Feature: feature to login to the website

  Scenario Outline: Check user can login with valid credentials

    Given user is on website login page
    When user enters <username> and <password>
    And user clicks on login button
    Then user is navigated to Dashboard page
    Examples:
    |username|password|
    |admin   |admin|



