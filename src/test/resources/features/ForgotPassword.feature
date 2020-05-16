@Android @ForgotPassword

Feature: Forgot Password Functionality Check

  Background:
    Given user is on login page
    When user click forgot password text
    Then user directed to forgot password page

  @FPpageToFPVpage
  Scenario: Registered user directed to forgot password verification page
    When user input email or phone number "dummy@gmail.com" on forgot password page
    And user click next button on forgot password page
    Then user directed to forgot password verification page

  @FP025-031 @FP056-062
  Scenario Outline: Registered email / phone number failed to be directed to reset password page because OTP format is incorrect
    When user input email or phone number "<identifier>" on forgot password page
    And user click next button on forgot password page
    Then user directed to forgot password verification page
    When user input OTP "<otp>"
    And user click verify button
    Then user see button verify doesn't active
    Examples:
      | identifier      | otp     |
      | dummy@gmail.com | 111111  |
      | dummy@gmail.com | 1010    |
      | dummy@gmail.com | 0000001 |
      | dummy@gmail.com |         |
      | 081271465455    | 111111  |
      | 081271465455    | 1010    |
      | 081271465455    | 0000001 |
      | 081271465455    |         |

  @FP063-065 @FP067-069
  Scenario Outline: Registered user failed to be directed to forgot password verification page because internet / server is down
    When user input email or phone number "<identifier>" on forgot password page
    Then user click next button on forgot password page
    Then user see warning toast on forgot password page "Connection Error"
    Examples:
      | identifier      |
      | dummy@gmail.com |
      | 081271465455    |


  @FP071
  Scenario Outline: Unregistered user failed to be directed to forgot password verification page
    When user input email or phone number "<identifier>" on forgot password page
    Then user click next button on forgot password page
    Then user see warning toast on forgot password page "Email or phone number is not recognized by system"
    Examples:
      | identifier             |
      | dummy2lalala@gmail.com |
      | 0812393939             |

  @FP066
  Scenario: User failed to be directed to forgot password verification page because didn't input email / phone number
    When user input email or phone number "" on forgot password page
    Then user click next button on forgot password page
    Then user see next button is not active
