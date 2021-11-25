@login @android
Feature: Login

  @test @positive
  Scenario: Verify user successfully login when input valid email and password
    Given user is on login page
    When user input username "admin"
    When user input password "admin"
    When user click button login
    Then user successfully login
    When user go to list menu
    When scroll list

  @negative
  Scenario: Verify user failed to login when input invalid email and password
    Given user is on login page
    When user input username "invalid"
    When user input password "invalid"
    When user click button login

  #Operator +
  Scenario: verify user succesfully to plus numbers
    Given user is on login page
      And user input username "admin"
      And user input password "admin"
      And user click button login
    When user input angka pertama dengan "5"
      And user choose plus in dropdown menu operators
      And user input angka kedua dengan "10"
      And user click button equals
    Then user succesfully calculate plus the numbers

  #Operator -
  Scenario: verify user succesfully to minus numbers
    Given user is on login page
      And user input username "admin"
      And user input password "admin"
      And user click button login
    When user input angka pertama dengan "20"
      And user choose minus in dropdown menu operators
      And user input angka kedua dengan "10"
      And user click button equals
    Then user succesfully calculate the numbers

  #Operator *
  Scenario: verify user succesfully to times numbers
    Given user is on login page
    And user input username "admin"
    And user input password "admin"
    And user click button login
    When user input angka pertama dengan "30"
    And user choose times in dropdown menu operators
    And user input angka kedua dengan "2"
    And user click button equals
    Then user succesfully calculate the numbers

  #Operator /
  Scenario: verify user succesfully to divided numbers
    Given user is on login page
    And user input username "admin"
    And user input password "admin"
    And user click button login
    When user input angka pertama dengan "50"
    And user choose divided in dropdown menu operators
    And user input angka kedua dengan "2"
    And user click button equals
    Then user succesfully calculate the numbers

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

  Scenario: Verify test Times Element
    Given user login with username "admin" and password "admin"


