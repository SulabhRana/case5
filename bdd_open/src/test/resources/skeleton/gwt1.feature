Feature: Shout Feature
Scenario: Persons are within the range
Given Sean is 10 meters away from Lucia
When Sean shouts "Free coffee"
Then Lucia hears the message "Free coffee"

Scenario: Persons are not in the range
Given Sean is 100 meters away from Lucia
When Sean shouts "Free coffee"
Then Lucia hears no message