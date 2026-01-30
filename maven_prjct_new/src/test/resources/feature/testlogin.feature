Feature: Test login functionality

Scenario Outline: check login is successful with the browser
Given  chrome browser is open
And user is on login open
When user enters <username> and <password>
And user clicks on login
Then user is navigated to home page

Examples:
   | username|password|
   | abhi |12345|
   | nihal|12345|
   | rishi|12345|
   