@Android @MobileChargeTransfer
Feature: Mobile charge top up with transfer

  Background:
    Given user is on login page
    When user input email or phone number "dummy@gmail.com"
    And user input password "PASSword123?!"
    And user click login button
    Then user directed to home page

  @UMD163
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

  @UMD002-041
  Scenario Outline: User successfully do mobile credit top up with direct transfer by manually input 12 digit and a
  valid provider using camera
    Given User is on the mobile top up page
    When User manually input "<phone_number>"
    And User see the provider logo
    And User see mobile charge options
    And User choose one of the "<provider>" options
    And User see the choose payment method pop-up with correct amount to pay
    And User click direct transfer
    And User click Pay Now
    And User click take photo receipt
    And User click take photo
    And User take the photo using camera
    And User click upload
    Then User see payment successful pop up with the amount they buy
    And the destination phone number

    Examples:
      | phone_number | provider  |
      | 859567890123 | XL
      | 877567890123 | XL        |
      | 878567890123 | XL        |
      | 817567890123 | XL        |
      | 818567890123 | XL        |
      | 819567890123 | XL        |
      | 811567890123 | TELKOMSEL |
      | 812567890123 | TELKOMSEL |
      | 813567890123 | TELKOMSEL |
      | 821567890123 | TELKOMSEL |
      | 822567890123 | TELKOMSEL |
      | 823567890123 | TELKOMSEL |
      | 852567890123 | TELKOMSEL |
      | 853567890123 | TELKOMSEL |
      | 851567890123 | TELKOMSEL |
      | 898567890123 | TRI       |
      | 899567890123 | TRI       |
      | 895567890123 | TRI       |
      | 896567890123 | TRI       |
      | 897567890123 | TRI       |
      | 814567890123 | INDOSAT   |
      | 815567890123 | INDOSAT   |
      | 816567890123 | INDOSAT   |
      | 855567890123 | INDOSAT   |
      | 856567890123 | INDOSAT   |
      | 857567890123 | INDOSAT   |
      | 858567890123 | INDOSAT   |
      | 889567890123 | SMARTFREN |
      | 881567890123 | SMARTFREN |
      | 882567890123 | SMARTFREN |
      | 883567890123 | SMARTFREN |
      | 886567890123 | SMARTFREN |
      | 887567890123 | SMARTFREN |
      | 888567890123 | SMARTFREN |
      | 884567890123 | SMARTFREN |
      | 885567890123 | SMARTFREN |
      | 832567890123 | AXIS      |
      | 833567890123 | AXIS      |
      | 838567890123 | AXIS      |
      | 831567890123 | AXIS      |

