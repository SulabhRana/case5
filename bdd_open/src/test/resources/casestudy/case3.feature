Feature: The case study three
Scenario: Purchase the product on test me app
Given User opens signin page
And User enters username and password
Then User will be able to see homepage
When User searches the product
And User selects the product and add to cart
Then User will be able to purchase product

Scenario: The one where the user moves  without adding any item 
Given The user registers into TestMeApp
When searches a particular product like hadphones
And try to do payement without adding any items to the cart
Then The testmeapp doesn't display the cart icon