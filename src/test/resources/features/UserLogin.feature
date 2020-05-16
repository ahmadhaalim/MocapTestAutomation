@Android @UserLogin

Feature: User Login Functionality Check

  Background:
    Given user is on login page

  @UL001 @UL014
  Scenario Outline: Registered user successfully login with valid email/phone number and password
    When user input email or phone number "<identifier>"
    And user input password "<password>"
    And user click login button
    Then user directed to home page and see toast "success"
    Examples:
      | identifier      | password |
      | dummy@gmail.com | Pass@123 |
      | 081271465455    | Pass@123 |
      | 6281271465455   | Pass@123 |
      | +6281271465455  | Pass@123 |


  @UL005 @UL018
  Scenario Outline: Registered user failed to login with valid email/phone number because password is invalid
    When user input email or phone number "<identifier>"
    And user input password "<password>"
    And user click login button
    Then user see warning toast on login page "Wrong username or password"
    Examples:
      | identifier      | password |
      | dummy@gmail.com | 123      |
      | 081271465455    | 123      |
      | 6281271465455   | 123      |
      | +6281271465455  | 123      |

  @UL006 @UL011-013 @UL019 @UL024-026
  Scenario Outline: User failed to login because one or all of input field is empty
    When user input email or phone number "<identifier>"
    And user input password "<password>"
    And user click login button
    Then user see login button doesn't active
    Examples:
      | identifier       | password |
      | dummy@gmail.com  |          |
      | dummy2@gmail.com |          |
      | 6281271465455    |          |
      | +6281271465455   |          |
      | 081271465456     |          |
      | 08123456789      |          |
      |                  |          |

  @UL014 @UL29
  Scenario: User failed to login because email / phone number field is empty
    When user input email or phone number ""
    And user input password "pass123"
    And user click login button
    Then user see warning toast on login page "Field cannot be empty."

  @UL007 @UL020
  Scenario Outline: User failed to login because email or phone number is unregistered
    When user input email or phone number "<identifier>"
    And user input password "<password>"
    And user click login button
    Then user see warning toast on login page "Wrong username or password"
    Examples:
      | identifier       | password       |
      | dummy2@gmail.com | PASSword123?!  |
      | 08123456789      | KATAsandi456?! |

  @UL002-004 @UL008-010 @UL015-017 @UL021-023
  Scenario Outline: Registered or Unregistered user failed to login because internet connection or server is down
    When user input email or phone number "<identifier>"
    And user input password "<password>"
    And user click login button
    Then user see warning toast on login page "Connection Error"
    Examples:
      | identifier       | password       |
      | dummy@gmail.com  | Password@123   |
      | 081271465455     | Password@123   |
      | 6281271465455    | Password@123   |
      | +6281271465455   | Password@123   |
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