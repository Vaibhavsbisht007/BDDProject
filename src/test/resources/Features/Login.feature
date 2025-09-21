Feature: test automation for login page https://www.saucedemo.com/
Scenario: user login authentication

Given user is on the login page
When user enter the user_name and Password
And user click on the Button
Then user log in successfully
And close the browser