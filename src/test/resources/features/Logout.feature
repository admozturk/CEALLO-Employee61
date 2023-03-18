Feature: verify if user can log out

  User Story: As a user i should be able to log out and end to the login page


  Scenario: User can log out and ends in login page
    Given User is on the dashboard
    When Press the e button
    And Click on log out button
    Then User is on login page