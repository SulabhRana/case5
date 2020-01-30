Feature: Login the app

  Scenario Outline: Login in TestMeApp
    Given User should be in login page using "http://10.232.237.143:443/TestMeApp"
    When User enetrs "<username>" and "<password>"
    And User enetrs the "Login" button
    Then User must be in SignOut page

    Examples: 
      | username      | password |
      | sulabh        | sul123   |
     ## | abc@gmail.com | abc1     |
