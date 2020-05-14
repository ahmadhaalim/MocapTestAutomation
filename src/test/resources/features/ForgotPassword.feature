@Android @ForgotPassword

Feature: Forgot Password Functionality Check

  Background:
    Given user is on login page
    When user click forgot password text
    Then user directed to forgot password page

    @FPpageToFPVpage
    Scenario: Registered user directed to forgot password verification page
      When user input email or phone number "dummy1@gmail.com" on forgot password page
      Then user directed to forgot password verification page

    @FP025-031 @FP056-062
    Scenario Outline: Registered email / phone number failed to be directed to reset password page because OTP format is incorrect
      When user input email or phone number "dummy1@gmail.com" on forgot password page
      Then user directed to forgot password verification page
      When user input OTP "<otp>"
      Then user see warning toast on forgot password verification page "OTP is incorrect"
      Examples:
        | otp     |
        | 111111  |
        | 1010    |
        | 0000001 |
        |         |

    @FP063-065 @FP067-069
    Scenario: Registered user failed to be directed to forgot password verification page because internet / server is down
      When user input email or phone number "dummy1@gmail.com" on forgot password page
      Then user see warning toast on forgot password page "Connection Error"

    @FP071
    Scenario: Unregistered user failed to be directed to forgot password verification page
      When user input email or phone number "dummy2@gmail.com" on forgot password page
      Then user see next button is not active

    @FP066
    Scenario: User failed to be directed to forgot password verification page because didn't input email / phone number
      When user input email or phone number "" on forgot password page
      Then user see warning toast on forgot password page "Data can't be empty"
