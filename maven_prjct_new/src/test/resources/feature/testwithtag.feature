Feature: To show how tags work

@smoke 
Scenario Outline:
Sample1
Given browser is open
And user is on login feature
When user enters <username> and <password>
And user clicks on login
Then user is navigated to home page

@run
Scenario Outline:
Sample2
Given browser is open
And user is on login feature
When user enters <username> and <password>
And user clicks on login
Then user is navigated to home page

@run 
Scenario Outline:
Sample3
Given browser is open
And user is on login feature
When user enters <username> and <password>
And user clicks on login
Then user is navigated to home page