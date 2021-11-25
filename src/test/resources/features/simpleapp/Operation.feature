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
