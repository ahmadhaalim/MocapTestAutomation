@Android

Feature: User Login Functionality Check

  Background:
    Given user is on login page

  @UL001
  Scenario Outline: Registered user successfully login with valid email/phone number and password
    When user input email or phone number "<identifier>"
    And user input password "<password>"
    And user click login button
    Then user directed to home page
    Examples:
      | identifier      | password      |
      | dummy@gmail.com | PASSword123?! |
      | 081271465456    | PASSword123?  |

