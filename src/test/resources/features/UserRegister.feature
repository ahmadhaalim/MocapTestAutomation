@Android @UserRegister

Feature: User Register Functionality Check

  Background:
    Given user is on login page
    When user click register text
    Then user directed to register page

    @URpageToRVpage
    Scenario: User input all correct register data format and directed to Register Verification Page
      When user input email "dummy1@gmail.com" on register page
      And user input phone number "081271465456" on register page
      And user input password "PASSword123?!" on register page
      And user input password confirmation "PASSword123?!" on register page
      And user click register button
      Then user directed to register verification page

    @UR016-066
    Scenario Outline: User failed to register because input data format is incorrect or empty
      When user input email "<email>" on register page
      And user input phone number "<phoneNumber>" on register page
      And user input password "<password>" on register page
      And user input password confirmation "<passwordConfirmation>" on register page
      And user click register button
      Then user see warning toast on register page "Input Format is Incorrect"
      Examples:
        | email            | phoneNumber  | password      | passwordConfirmation |
        | dummy1@gmail.com | 081271465456 | PASSword123?! | pass                 |
        | dummy1@gmail.com | 081271465456 | pass          | pass                 |
        | dummy1@gmail.com | 081271465456 | PASSword123?! |                      |
        | dummy1@gmail.com | 081271465456 | pass          |                      |
        | dummy1@gmail.com | 081271465456 |               | pass                 |
        | dummy1@gmail.com | 081271465456 |               |                      |
        | dummy1@gmail.com | 081234567    | PASSword123?! | pass                 |
        | dummy1@gmail.com | 081234567    | pass          | pass                 |
        | dummy1@gmail.com | 081234567    | PASSword123?! |                      |
        | dummy1@gmail.com | 081234567    | pass          |                      |
        | dummy1@gmail.com | 081234567    |               | pass                 |
        | dummy1@gmail.com | 081234567    |               |                      |
        | dummy1@gmail.com |              | PASSword123?! | pass                 |
        | dummy1@gmail.com |              | pass          | pass                 |
        | dummy1@gmail.com |              | PASSword123?! |                      |
        | dummy1@gmail.com |              | pass          |                      |
        | dummy1@gmail.com |              |               | pass                 |
        | dummy1@gmail.com |              |               |                      |
        |                  | 081271465456 | PASSword123?! | pass                 |
        |                  | 081271465456 | pass          | pass                 |
        |                  | 081271465456 | PASSword123?! |                      |
        |                  | 081271465456 | pass          |                      |
        |                  | 081271465456 |               | pass                 |
        |                  | 081271465456 |               |                      |
        |                  | 081234567    | PASSword123?! | pass                 |
        |                  | 081234567    | pass          | pass                 |
        |                  | 081234567    | PASSword123?! |                      |
        |                  | 081234567    | pass          |                      |
        |                  | 081234567    |               | pass                 |
        |                  | 081234567    |               |                      |
        |                  |              | PASSword123?! | pass                 |
        |                  |              | pass          | pass                 |
        |                  |              | PASSword123?! |                      |
        |                  |              | pass          |                      |
        |                  |              |               | pass                 |
        |                  |              |               |                      |
        | dummy1           | 081271465456 | PASSword123?! | pass                 |
        | dummy1           | 081271465456 | pass          | pass                 |
        | dummy1           | 081271465456 | PASSword123?! |                      |
        | dummy1           | 081271465456 | pass          |                      |
        | dummy1           | 081271465456 |               | pass                 |
        | dummy1           | 081271465456 |               |                      |
        | dummy1           | 081234567    | PASSword123?! | pass                 |
        | dummy1           | 081234567    | pass          | pass                 |
        | dummy1           | 081234567    | PASSword123?! |                      |
        | dummy1           | 081234567    | pass          |                      |
        | dummy1           | 081234567    |               | pass                 |
        | dummy1           | 081234567    |               |                      |
        | dummy1           |              | PASSword123?! | pass                 |
        | dummy1           |              | pass          | pass                 |
        | dummy1           |              | PASSword123?! |                      |
        | dummy1           |              | pass          |                      |
        | dummy1           |              |               | pass                 |
        | dummy1           |              |               |                      |

    @UR067-69 @UR079
    Scenario Outline: User input incorrect or empty email format
      When user input email "<email>" on register page
      Then user see warning text below input field
      Examples:
        | email      |
        | dummy1@    |
        | @gmail.com |
        | dummy1     |
        |            |

    @UR071-072 @UR80
    Scenario Outline: User input incorrect or empty email format
      When user input phone number "<phoneNumber>" on register page
      Then user see warning text below input field
      Examples:
        | phoneNumber     |
        | 08123456        |
        | 081234567890123 |
        |                 |

    @UR072-077 @UR81
    Scenario Outline: User input incorrect or empty email format
      When user input password "<password>" on register page
      Then user see warning text below input field
      Examples:
        | password      |
        | PASSw3?       |
        | password123?! |
        | PASSWORD123?! |
        | PassWord1     |
        | PassWord!     |
        |               |

    @UR82 @UR83
    Scenario Outline: User input incorrect or empty email format
      When user input password confirmation "<passwordConfirmation>" on register page
      Then user see warning text below input field
      Examples:
        | passwordConfirmation |
        | PassWord!            |
        |                      |