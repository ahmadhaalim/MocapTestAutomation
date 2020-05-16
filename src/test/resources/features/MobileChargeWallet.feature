@Android @MobileChargeBalance

Feature: Mobile charge top up with In App Balance

  Background:
    Given user is on login page
    When user input email or phone number "tester1@gmail.com"
    And user input password "Tester1@123"
    And user click login button
    And user directed to home page

  @UMB001
  Scenario: User successfully do mobile credit top up with In App Balance using default number
    Given User is on the mobile top up page
    And User see the account default number
    And User see the provider logo
    And User see mobile charge options
    When User choose one of the options
    And User see the choose payment method pop-up with correct amount to pay
    And User click In App balance
    And User click Pay Now
    Then User see payment successful pop up with the amount they buy
    And the destination phone number

  @UMB002
  Scenario: User click exit button on the payment pop up
    Given User is on the mobile top up page
    And User see the account default number
    And User see the provider logo
    And User see mobile charge options
    When User choose one of the options
    And User see the choose payment method pop-up with correct amount to pay
    And User click exit button on the pop up
    Then User focused back on the mobile top up page

  @UMB003-042
  Scenario Outline: User successfully do mobile credit top up with In App Balance by manually input 12 digit and a
  valid provider
    Given User is on the mobile top up page
    When User manually input "<phone_number>"
    And User see the provider logo
    And User see mobile charge options
    And User choose one of the "<provider>" options
    And User see the choose payment method pop-up with correct amount to pay
    And User click In App balance
    And User click Pay Now
    Then User see payment successful pop up with the amount they buy
    And the destination phone number
    Examples:
      | phone_number | provider  |
      | 859567890123 | XL        |
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

  @UMB043-082
  Scenario Outline: User succesfully do mobile credit top up with In App Balance by manually input 11 digit and a
  valid provider
    Given User is on the mobile top up page
    When User manually input "<phone_number>"
    And User see the provider logo
    And User see mobile charge options
    And User choose one of the "<provider>" options
    And User see the choose payment method pop-up with correct amount to pay
    And User click In App balance
    And User click Pay Now
    Then User see payment successful pop up with the amount they buy
    And the destination phone number

    Examples:
      | phone_number | provider  |
      | 85956789012  | XL        |
      | 87756789012  | XL        |
      | 87856789012  | XL        |
      | 81756789012  | XL        |
      | 81856789012  | XL        |
      | 81956789012  | XL        |
      | 81156789012  | TELKOMSEL |
      | 81256789012  | TELKOMSEL |
      | 81356789012  | TELKOMSEL |
      | 82156789012  | TELKOMSEL |
      | 82256789012  | TELKOMSEL |
      | 82356789012  | TELKOMSEL |
      | 85256789012  | TELKOMSEL |
      | 85356789012  | TELKOMSEL |
      | 85156789012  | TELKOMSEL |
      | 89856789012  | TRI       |
      | 89956789012  | TRI       |
      | 89556789012  | TRI       |
      | 89656789012  | TRI       |
      | 89756789012  | TRI       |
      | 81456789012  | INDOSAT   |
      | 81556789012  | INDOSAT   |
      | 81656789012  | INDOSAT   |
      | 85556789012  | INDOSAT   |
      | 85656789012  | INDOSAT   |
      | 85756789012  | INDOSAT   |
      | 85856789012  | INDOSAT   |
      | 88956789012  | SMARTFREN |
      | 88156789012  | SMARTFREN |
      | 88256789012  | SMARTFREN |
      | 88356789012  | SMARTFREN |
      | 88656789012  | SMARTFREN |
      | 88756789012  | SMARTFREN |
      | 88856789012  | SMARTFREN |
      | 88456789012  | SMARTFREN |
      | 88556789012  | SMARTFREN |
      | 83256789012  | AXIS      |
      | 83356789012  | AXIS      |
      | 83856789012  | AXIS      |
      | 83156789012  | AXIS      |

  @UMB88-127
  Scenario Outline: User see warning invalid number, If user input 8 digit number with valid provider
    Given User is on the mobile top up page
    When User manually input "<phone_number>"
    Then User can't see the mobile options
    Examples:
      | phone_number |
      | 85956789     |
      | 87756789     |
      | 87856789     |
      | 81756789     |
      | 81856789     |
      | 81956789     |
      | 81156789     |
      | 81256789     |
      | 81356789     |
      | 82156789     |
      | 82256789     |
      | 82356789     |
      | 85256789     |
      | 85356789     |
      | 85156789     |
      | 89856789     |
      | 89956789     |
      | 89556789     |
      | 89656789     |
      | 89756789     |
      | 81456789     |
      | 81556789     |
      | 81656789     |
      | 85556789     |
      | 85656789     |
      | 85756789     |
      | 85856789     |
      | 88956789     |
      | 88156789     |
      | 88256789     |
      | 88356789     |
      | 88656789     |
      | 88756789     |
      | 88856789     |
      | 88456789     |
      | 88556789     |
      | 83256789     |
      | 83356789     |
      | 83856789     |
      | 83156789     |

  @UMB130-169
  Scenario Outline: User see warning invalid number, If user input 13 digit number with valid provider
    Given User is on the mobile top up page
    When User manually input "<phone_number>"
    Then User can't see the mobile options
    Examples:
      | phone_number  |
      | 8595678901234 |
      | 8775678901234 |
      | 8785678901234 |
      | 8175678901234 |
      | 8185678901234 |
      | 8195678901234 |
      | 8115678901234 |
      | 8125678901234 |
      | 8135678901234 |
      | 8215678901234 |
      | 8225678901234 |
      | 8235678901234 |
      | 8525678901234 |
      | 8535678901234 |
      | 8515678901234 |
      | 8985678901234 |
      | 8995678901234 |
      | 8955678901234 |
      | 8965678901234 |
      | 8975678901234 |
      | 8145678901234 |
      | 8155678901234 |
      | 8165678901234 |
      | 8555678901234 |
      | 8565678901234 |
      | 8575678901234 |
      | 8585678901234 |
      | 8895678901234 |
      | 8815678901234 |
      | 8825678901234 |
      | 8835678901234 |
      | 8865678901234 |
      | 8875678901234 |
      | 8885678901234 |
      | 8845678901234 |
      | 8855678901234 |
      | 8325678901234 |
      | 8335678901234 |
      | 8385678901234 |
      | 8315678901234 |


  Scenario Outline: User manually input valid number but app failed to connect to server
    Given User is on the mobile top up page
    When User manually input "<phone_number>"
    Then User see warning server is offline "Server Error"
    Examples:
      | phone_number |
      | 859567890123 |
      | 877567890123 |
      | 878567890123 |
      | 817567890123 |
      | 818567890123 |
      | 819567890123 |
      | 811567890123 |
      | 812567890123 |
      | 813567890123 |
      | 821567890123 |
      | 822567890123 |
      | 823567890123 |
      | 852567890123 |
      | 853567890123 |
      | 851567890123 |
      | 898567890123 |
      | 899567890123 |
      | 895567890123 |
      | 896567890123 |
      | 897567890123 |
      | 814567890123 |
      | 815567890123 |
      | 816567890123 |
      | 855567890123 |
      | 856567890123 |
      | 857567890123 |
      | 858567890123 |
      | 889567890123 |
      | 881567890123 |
      | 882567890123 |
      | 883567890123 |
      | 886567890123 |
      | 887567890123 |
      | 888567890123 |
      | 884567890123 |
      | 885567890123 |
      | 832567890123 |
      | 833567890123 |
      | 838567890123 |
      | 831567890123 |
