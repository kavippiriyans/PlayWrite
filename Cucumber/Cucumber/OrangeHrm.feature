Feature: OrangeHrm Login Page

Background: Given Url(https://https://opensource-demo.orangehrmlive.com/web/index.php/auth/login)
            Then OrangeHrm Login Page is Displayed

Scenario: Valid Username with Valid Password

Given Username "Admin"
Then Entered Username is displayed
Given Password "admin123"
Then Entered Password is displayed in dot shape
And click on login button
Then OrangeHrm Homepage is displayed
