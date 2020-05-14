@Android @UMD
Feature: Mobile charge top up with transfer
  Background:
    Given user is on login page
    When user input email or phone number "dummy@gmail.com"
    And user input password "PASSword123?!"
    And user click login button
    Then user directed to home page

    Scenario: User click back button when in the take photo page
      Given User is on the mobile top up page
      And User see the account default number
      And User see the provider logo
      And User see mobile charge options
      When User choose one of the options
      And User see the choose payment method pop-up with correct amount to pay
      And User click direct transfer
      And User click Pay Now
      And User click take photo receipt
      And User click back button
      Then User is back to the direct transfer pop up


