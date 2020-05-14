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
    Then user see warning toast on register page
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
