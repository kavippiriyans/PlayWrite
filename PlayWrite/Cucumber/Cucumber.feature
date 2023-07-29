Feature: OrangeHrm Login Page

Background: 
Given Url: "https://https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"
            Then OrangeHrm Login Page is Displayed

Scenario: Valid Username with Valid Password

Given Username "Admin"
Then Entered Username is displayed
Given Password "admin123"
Then Entered Password is displayed in dot shape
And click on login button
Then OrangeHrm Homepage is displayed

Scenario: Invalid Username with Valid Password 
 
Given Username "Admi"
Then Entered Username is dispalyed
Given Password "admin123"
Then Entered Password is displayed in dot shape
And click on login button 
Then Error message is displayed like Invalid credentials

Scenario: Null Username with Valid Password 
 
Given Username ""
Then Entered Username is dispalyed
Given Password "admin123"
Then Entered Password is displayed in dot shape
And click on login button 
Then Error message is displayed like Username Required
