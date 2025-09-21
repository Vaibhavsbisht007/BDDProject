Feature: test automation for login page https://www.saucedemo.com/
Scenario Outline: user login authentication
Given user is on the login page
When user enter the "<user_name>" and "<Password>"
And user click on the Button
Then user log in successfully
And close the browser

Examples:
| user_name 		| Password 	   |	
| standard_user 	| secret_sauce |
| locked_out_user 	| secret_sauce |
| problem_user 		| secret_sauce |
| performance_glitch_user | secret_sauce |
| error_user 		| secret_sauce |
| visual_user 		| secret_sauce |