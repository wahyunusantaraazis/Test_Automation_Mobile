@android
Feature: Operation Calculator

  Scenario: test verify user succesfully to plus numbers
    #berhasil login
    Given User succesfully login
        And I am input username "admin"
        And I am input password "admin"
        And I am click button login
    When I am input angka pertama dengan "5"
        When I choose plus in dropdown menu operators
        When I am input angka kedua dengan "10"
        And I am click button equals
    Then I am succesfully calculate the numbers

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
    Then user succesfully calculate minus the numbers

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
    Then user succesfully calculate times the numbers

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
    Then user succesfully calculate divided the numbers
