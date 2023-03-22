Feature: Calendar module functionality

  As a user, I should be able to see Daily-Weekly-Monthly calendar view
   and create a new event under the Calendar module

  Background:
    Given user is on the home page after logged in


  Scenario: User can display daily calendar view
    When the user clicks on the calendar module icon
    And the user clicks on navigation toggle button next to today button
    And the user clicks on the day option
    Then the application should display the daily calander view



