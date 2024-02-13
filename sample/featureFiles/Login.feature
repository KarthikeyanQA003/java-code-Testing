Feature: Login feature of HRM 
Scenario: Login scenario
Given user is on the login page
When The user is entering the login creadential "Admin" and " admin123 "

And clicks the login button 
Then user should be navigate to the home page
  