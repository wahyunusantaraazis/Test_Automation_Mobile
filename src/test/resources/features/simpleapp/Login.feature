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

  #contoh jika memasukan 2 element string dalam satu method
  Scenario: Verify test Times Element
    Given user login with username "admin" and password "admin"


