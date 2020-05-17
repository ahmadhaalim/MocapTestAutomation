#@Android @TransactionHistory
#
#Feature: User history and pending transaction
#
#  Background:
#    Given user is on login page
#    When user input email or phone number "tester1@gmail.com"
#    And user input password "Tester1@123"
#    And user click login button
#    Then user directed to home page
#
#  @UHT001
#  Scenario: User can see his success transaction using in App Balance
#    Given User is on the mobile top up page
#    And User see the account default number
#    And User see the provider logo
#    And User see mobile charge options
#    When User choose one of the options
#    And User see the choose payment method pop-up with correct amount to pay
#    And User click In App balance
#    And User click Pay Now
#    And User click OK button on the payment confirmation
#    And User is on the mobile top up page
#    And User click the history tab
#    And User click the In Progress tab
#    Then User can see his successful transaction
#
