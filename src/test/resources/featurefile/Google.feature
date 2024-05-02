Feature: Test for google application

  Scenario: verify Tittle of google page
    Given Browser should open app should launch
    When User capture Tittle of google page
    Then Expected and Actual Tittle should match
