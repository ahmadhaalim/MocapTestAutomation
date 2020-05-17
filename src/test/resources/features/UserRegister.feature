@Android @UserRegister

Feature: User Register Functionality Check

  Background:
    Given user is on login page
    When user click register text
    Then user directed to register page

  @URpageToRVpage
  Scenario: User input all correct register data format and directed to Register Verification Page
    When user input name "Halo"on register page
    And user input email "dummy1000@gmail.com" on register page
    And user input phone number "81280976788" on register page
    And user input password "PASSword123?!!" on register page
    And user input password confirmation "PASSword123?!!" on register page
    And user click register button
    Then user directed to register verification page

  @UR84-85
  Scenario Outline: User failed to register because email or phone number already registered
    When user input name "<name>"on register page
    And user input email "<email>" on register page
    And user input phone number "<phoneNumber>" on register page
    And user input password "<password>" on register page
    And user input password confirmation "<passwordConfirmation>" on register page
    And user click register button
    Then user see warning toast on register page "Email or phone number have already registered"
    Examples:
      | name  | email             | phoneNumber | password | passwordConfirmation |
      | Dummy | dummy@gmail.com   | 81370000056 | Pass@123 | Pass@123             |
      | Dummy | dummy00@gmail.com | 81271465455 | Pass@123 | Pass@123             |

  @UR016-077
  Scenario Outline: User failed to register because input data format is incorrect or empty
    When user input name "<name>"on register page
    And user input email "<email>" on register page
    And user input phone number "<phoneNumber>" on register page
    And user input password "<password>" on register page
    And user input password confirmation "<passwordConfirmation>" on register page
    And user click register button
    Then user see warning toast on register page "Field Cannot Be Empty"
    Examples:
      | name  | email            | phoneNumber | password      | passwordConfirmation |
      |       | dummy2@gmail.com | 81271465450 | PASSword123?! | PASSword123?!        |
      |       | dummy2@gmail.com | 81271465450 | PASSword123?! | pass                 |
      |       | dummy2@gmail.com | 81271465450 | pass          | pass                 |
      |       | dummy2@gmail.com | 81271465450 | PASSword123?! |                      |
      |       | dummy2@gmail.com | 81271465450 | pass          |                      |
      |       | dummy2@gmail.com | 81271465450 |               | pass                 |
      |       | dummy2@gmail.com | 81271465450 |               |                      |
      |       | dummy2@gmail.com | 81234567    | PASSword123?! | PASSword123?!        |
      |       | dummy2@gmail.com | 81234567    | PASSword123?! | pass                 |
      |       | dummy2@gmail.com | 81234567    | pass          | pass                 |
      |       | dummy2@gmail.com | 81234567    | PASSword123?! |                      |
      |       | dummy2@gmail.com | 81234567    | pass          |                      |
      |       | dummy2@gmail.com | 81234567    |               | pass                 |
      |       | dummy2@gmail.com | 81234567    |               |                      |
      |       | dummy2@gmail.com |             | PASSword123?! | PASSword123?!        |
      |       | dummy2@gmail.com |             | PASSword123?! | pass                 |
      |       | dummy2@gmail.com |             | pass          | pass                 |
      |       | dummy2@gmail.com |             | PASSword123?! |                      |
      |       | dummy2@gmail.com |             | pass          |                      |
      |       | dummy2@gmail.com |             |               | pass                 |
      |       | dummy2@gmail.com |             |               |                      |
      |       |                  | 81271465450 | PASSword123?! | PASSword123?!        |
      |       |                  | 81271465450 | PASSword123?! | pass                 |
      |       |                  | 81271465450 | pass          | pass                 |
      |       |                  | 81271465450 | PASSword123?! |                      |
      |       |                  | 81271465450 | pass          |                      |
      |       |                  | 81271465450 |               | pass                 |
      |       |                  | 81271465450 |               |                      |
      |       |                  | 81234567    | PASSword123?! | PASSword123?!        |
      |       |                  | 81234567    | PASSword123?! | pass                 |
      |       |                  | 81234567    | pass          | pass                 |
      |       |                  | 81234567    | PASSword123?! |                      |
      |       |                  | 81234567    | pass          |                      |
      |       |                  | 81234567    |               | pass                 |
      |       |                  | 81234567    |               |                      |
      |       |                  |             | PASSword123?! | PASSword123?!        |
      |       |                  |             | PASSword123?! | pass                 |
      |       |                  |             | pass          | pass                 |
      |       |                  |             | PASSword123?! |                      |
      |       |                  |             | pass          |                      |
      |       |                  |             |               | pass                 |
      |       |                  |             |               |                      |
      |       | dummy1           | 81271465450 | PASSword123?! | PASSword123?!        |
      |       | dummy1           | 81271465450 | PASSword123?! | pass                 |
      |       | dummy1           | 81271465450 | pass          | pass                 |
      |       | dummy1           | 81271465450 | PASSword123?! |                      |
      |       | dummy1           | 81271465450 | pass          |                      |
      |       | dummy1           | 81271465450 |               | pass                 |
      |       | dummy1           | 81271465450 |               |                      |
      |       | dummy1           | 81234567    | PASSword123?! | PASSword123?!        |
      |       | dummy1           | 81234567    | PASSword123?! | pass                 |
      |       | dummy1           | 81234567    | pass          | pass                 |
      |       | dummy1           | 81234567    | PASSword123?! |                      |
      |       | dummy1           | 81234567    | pass          |                      |
      |       | dummy1           | 81234567    |               | pass                 |
      |       | dummy1           | 81234567    |               |                      |
      |       | dummy1           |             | PASSword123?! | PASSword123?!        |
      |       | dummy1           |             | PASSword123?! | pass                 |
      |       | dummy1           |             | pass          | pass                 |
      |       | dummy1           |             | PASSword123?! |                      |
      |       | dummy1           |             | pass          |                      |
      |       | dummy1           |             |               | pass                 |
      |       | dummy1           |             |               |                      |
      | Dummy | dummy2@gmail.com | 81271465450 | PASSword123?! |                      |
      | Dummy | dummy2@gmail.com | 81271465450 | pass          |                      |
      | Dummy | dummy2@gmail.com | 81271465450 |               | pass                 |
      | Dummy | dummy2@gmail.com | 81271465450 |               |                      |
      | Dummy | dummy2@gmail.com | 81234567    | PASSword123?! |                      |
      | Dummy | dummy2@gmail.com | 81234567    | pass          |                      |
      | Dummy | dummy2@gmail.com | 81234567    |               | pass                 |
      | Dummy | dummy2@gmail.com | 81234567    |               |                      |
      | Dummy | dummy2@gmail.com |             | PASSword123?! |                      |
      | Dummy | dummy2@gmail.com |             | pass          |                      |
      | Dummy | dummy2@gmail.com |             |               | pass                 |
      | Dummy | dummy2@gmail.com |             |               |                      |
      | Dummy |                  | 81234567    |               | pass                 |
      | Dummy |                  | 81271465450 | PASSword123?! |                      |
      | Dummy |                  | 81271465450 | pass          |                      |
      | Dummy |                  | 81271465450 |               | pass                 |
      | Dummy |                  | 81271465450 |               |                      |
      | Dummy |                  | 81234567    | PASSword123?! |                      |
      | Dummy |                  | 81234567    | pass          |                      |
      | Dummy |                  | 81234567    |               | pass                 |
      | Dummy |                  | 81234567    |               |                      |
      | Dummy |                  |             | PASSword123?! |                      |
      | Dummy |                  |             | pass          |                      |
      | Dummy |                  |             |               | pass                 |
      | Dummy | dummy1           | 81271465450 | PASSword123?! |                      |
      | Dummy | dummy1           | 81271465450 | pass          |                      |
      | Dummy | dummy1           | 81271465450 |               | pass                 |
      | Dummy | dummy1           | 81271465450 |               |                      |
      | Dummy | dummy1           | 81234567    | PASSword123?! |                      |
      | Dummy | dummy1           | 81234567    | pass          |                      |
      | Dummy | dummy1           | 81234567    |               | pass                 |
      | Dummy | dummy1           | 81234567    |               |                      |
      | Dummy | dummy1           |             | PASSword123?! |                      |
      | Dummy | dummy1           |             | pass          |                      |
      | Dummy | dummy1           |             |               | pass                 |
      | Dummy | dummy1           |             |               |                      |
