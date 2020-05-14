@Android

Feature: User Login Functionality Check

  Background:
    Given user is on login page

  @UL001 @UL014
  Scenario Outline: Registered user successfully login with valid email/phone number and password
    When user input email or phone number "<identifier>"
    And user input password "<password>"
    And user click login button
    Then user directed to home page
    Examples:
      | identifier      | password      |
      | dummy@gmail.com | PASSword123?! |
      | 081271465456    | PASSword123?! |

  @UL006 @UL011-013 @UL019 @UL024-026
  Scenario Outline: User failed to login because one of all input field is empty
    When user input email or phone number "<identifier>"
    And user input password "<password>"
    And user click login button
    Then user see login button doesn't active
    Examples:
      | identifier       | password      |
      | dummy@gmail.com  |               |
      | dummy2@gmail.com |               |
      |                  | PASSword123?! |
      | 081271465456     |               |
      | 08123456789      |               |
      |                  | PASSword123?! |
      |                  |               |

  @UL007 @UL020
  Scenario Outline: User failed to login because email or phone number is unregistered
    When user input email or phone number "<identifier>"
    And user input password "<password>"
    And user click login button
    Then user see warning toast on login page "Account' doesn't exist"
    Examples:
      | identifier       | password       |
      | dummy2@gmail.com | PASSword123?!  |
      | 08123456789      | KATAsandi456?! |

  @UL003-005 @UL008-011 @UL015-018 @UL021-023
  Scenario Outline: User failed to login because internet connection or server is down
    When user input email or phone number "<identifier>"
    And user input password "<password>"
    And user click login button
    Then user see warning toast on login page "Internet or Server is ERROR"
    Examples:
      | identifier       | password       |
      | dummy@gmail.com  | PASSword123?!  |
      | 081271465456     | PASSword123?!  |
      | dummy2@gmail.com | KATAsandi456?! |
      | 08123456789      | KATAsandi456?! |

  @UL027
  Scenario: User click forgot password text direction page
    When user click forgot password text
    Then user directed to forgot password page

  @UL028
  Scenario: User click register text direction page
    When user click register text
    Then user directed to register page