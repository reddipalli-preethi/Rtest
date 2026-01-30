Feature: Login to HRM Application
 
 Background:
  Given user is on HRMLogin page "https://opensource-demo.orangehrmlive.com"
  
  @ValidCredentials
  Scenario: Login with valid credentials
  
  When user enters username as "Admin" and password as "admin123"
  Then user should be able to login successfully and new page  open

  