 Feature: This is to test google search
Scenario: Goole search scenario 
   Given the user is entering google.co.in
     When a user is typing the search term "Karthik"
And clicks the search button
Then the user should see the Result 