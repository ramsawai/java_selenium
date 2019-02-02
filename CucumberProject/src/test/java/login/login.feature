Feature: Login Functionality
@Smoke
Scenario: Check Login Functionality with Valid Username and Password

Given Open Chrome Browser
Then Launch Gmail Url
Then Enter Valid Username 

@Regression
Scenario: Check Login Functionality with Invalid Username and Password
Given Open Firefox Browser
Then Launch facebook Url
Then Enter Invalid Username