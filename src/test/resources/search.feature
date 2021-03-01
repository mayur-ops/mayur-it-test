Feature: search
  As a new user
  so that search for travelodge hotels in london
  i want to book the hotels

  @search
  Scenario: search
    Given i am on home page
    When i do search for a hotels in "London"
    Then i do select the hotels available in london
