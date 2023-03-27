  @CEA10-328
  Feature: Calendar module functionality

  As a user, I should be able to see Daily-Weekly-Monthly calendar view
  and create a new event under the Calendar module


  Background:
    Given user is on the home page after logged in

  @CEA10-323
  Scenario: User can display daily calendar view
    When the user clicks on the calendar module icon
    And the user clicks on navigation toggle button next to today button
    And the user clicks on the day option
    Then the application should display the daily calendar view

  @CEA10-324
  Scenario: User can display weekly calendar view
    When the user clicks on the calendar module icon
    And the user clicks on navigation toggle button next to today button
    And the user clicks on the week option
    Then the application should display the weekly calendar view

  @CEA10-325
  Scenario: User can display monthly calendar view
    When the user clicks on the calendar module icon
    And the user clicks on navigation toggle button next to today button
    And the user clicks on the month option
    Then the application should display the monthly calendar view

  @CEA10-326
  Scenario: User can create a new event under the Calendar module and see it on the related day
             through the Monthly Calendar view
    When the user clicks on the calendar module icon
    And the user clicks on the new event button
    And the user fills inside event title box
    And the user clicks on the all day button to set the event date
    And user clicks on the save button
    Then the application should display the created event through the monthly calendar view

  @CEA10-327
  Scenario: User can delete any event through the Monthly Calendar view by clicking on the event
             and then using “more” option
    When the user clicks on the calendar module icon
    And the user clicks on the event already set on the calendar
    And the user clicks on more button
    And the user clicks on three dots next to the event title box
    And the user clicks on the delete option
    Then the user should be able to delete the event permanently



