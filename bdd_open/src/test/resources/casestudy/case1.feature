Feature: Register user on TestMe App

  Scenario: Fill fields on Register page
    Given The url for TestMe App "http://10.232.237.143:443/TestMeApp/RegisterUser.htm"
    When User enters "sulabhrana" as user
    And User enters "abcdef" as firstname
    And User enters "rana" as lastname
    And User enters "abc123" as passw
    And User enters "abc123" as confirm_passw
    And User enters "Male" as gender
    And User enters "askmail@gmail.com" as email
    And User enters "1234567890" as mobile number
    And User enters "22/01/2020" as dob
    And User enters "adkjckidlmjlcs" as address
    And User enters "What is your favour color?" as security question
    And User enters "red" as answer
    And User clicks on the register button
    Then User is in valid page
