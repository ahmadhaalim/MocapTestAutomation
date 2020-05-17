@Android @ValidateAccount

Feature: Validate account functionality check

  Background:
    Given user is on login page
    When user click forgot password text
    Then user directed to forgot password page


  @VA002 @VA006 @VA010 @VA015 @VA019 @VA023
  Scenario Outline: Registered but unvalidated user can't validate because internet / server is down
    When user input email or phone number "<identifier>" on validate account page
    Then user input password "<password>" on validate account page
    Then user directed to validate account verification page
    When user input OTP "<otp>" on validate account verification page
    Then user see warning toast on validate account verification page "Connection error"
    Examples:
      | identifier      | password | otp    |
      | dummy@gmail.com | Pass@123 | 123456 |
      | 081271465455    | Pass@123 | 123456 |
      | 6281271465455   | Pass@123 | 123456 |

  @VA007-008 @VA020-021
  Scenario Outline: Registered but unvalidated user can't validate because OTP format is incorrect
    When user input email or phone number "<identifier>" on validate account page
    Then user input password "<password>" on validate account page
    Then user directed to validate account verification page
    When user input OTP "<otp>" on validate account verification page
    Then user see verify button doesn't active on validate account verification page
    Examples:
      | identifier      | password | otp       |
      | dummy@gmail.com | Pass@123 | 123       |
      | dummy@gmail.com | Pass@123 | 123456789 |
      | 081271465455    | Pass@123 | 123       |
      | 081271465455    | Pass@123 | 123456789 |

  @VA005 @VA018
  Scenario Outline: Registered but unvalidated user can't validate because OTP is invalid
    When user input email or phone number "<identifier>" on validate account page
    Then user input password "<password>" on validate account page
    Then user directed to validate account verification page
    When user input OTP "<otp>" on validate account verification page
    Then user see warning toast on validate account verification page "Please input the correct OTP code"
    Examples:
      | identifier      | password | otp    |
      | dummy@gmail.com | Pass@123 | 111111 |
      | 081271465455    | Pass@123 | 111111 |
      | 6281271465455   | Pass@123 | 111111 |

  @VA009 @VA022
  Scenario Outline: Registered but unvalidated user can't validate because OTP field is empty
    When user input email or phone number "<identifier>" on validate account page
    Then user input password "<password>" on validate account page
    Then user directed to validate account verification page
    When user input OTP "<otp>" on validate account verification page
    Then user see verify button doesn't active on validate account verification page
    Examples:
      | identifier      | password | otp |
      | dummy@gmail.com | Pass@123 |     |
      | 081271465455    | Pass@123 |     |
      | 6281271465455   | Pass@123 |     |

  @VA013 @VA026
  Scenario Outline: User failed to validate account because account already verified
    When user input email or phone number "<identifier>" on validate account page
    Then user input password "<password>" on validate account page
    Then user see warning toast on validate account page "Account has been verified"
    Examples:
      | identifier      | password |
      | dummy@gmail.com | Pass@123 |
      | 081271465455    | Pass@123 |
      | 6281271465455   | Pass@123 |

  @VA012 @VA025
  Scenario Outline: User failed to validate account because email or phone number is unregistered
    When user input email or phone number "<identifier>" on validate account page
    Then user input password "<password>" on validate account page
    Then user see warning toast on validate account page "Wrong email or password"
    Examples:
      | identifier        | password |
      | dummy69@gmail.com | Pass@123 |
      | 0812710000055     | Pass@123 |
      | 6281270000055     | Pass@123 |

  @VA027-029
  Scenario Outline: User failed to validate account because field is empty
    When user input email or phone number "<identifier>" on validate account page
    Then user input password "<password>" on validate account page
    Then user see warning toast on validate account page "Field cannot be empty."
    Examples:
      | identifier          | password |
      | dummy6996@gmail.com |          |
      | 0812710300055       |          |
      | 6281270300055       |          |
      |                     | pass     |
      |                     |          |

