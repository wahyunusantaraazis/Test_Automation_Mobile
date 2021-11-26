@android
Feature: Complex Action in list Page

  #LongPress
  Scenario: Verify Long Press Element
    Given user is on login page
      And user input username "admin"
      And user input password "admin"
      And user click button login
      And user successfully login
    When user go to list menu
    Then Long press certain list

  #Tap Multiple Times
  Scenario: Verify Tap Multiple Times Element
    Given user is on login page
    And user input username "admin"
    And user input password "admin"
    And user click button login
    And user successfully login
    When user go to list menu
    Then Tap multiple times certain list