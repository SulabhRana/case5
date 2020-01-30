Feature: Demo Web Shop Login feature file

Scenario Outline: Valid Login For Demo Web Shop
Given The URL of the Demo Web Shop "http://demowebshop.tricentis.com/login"
When User enters "askmail@gmail.com" as username
And User enters "abc123" as password
When User clicks on Login button
Then User is in a valid page

Examples: 
|username|password|
|abc@gmail.com|abc1|
|abc@gmail.com|abc1|
|abc@gmail.com|abc1|