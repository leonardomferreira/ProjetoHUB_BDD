Feature: Register Action

Scenario: Successful Register with Valid Credentials
	Given User is on Home Page
	When User Navigate to LogIn Page
	And user click on the button create new account
	And user correctly fill in all fields
	Then will be successfully registered
	
Scenario: Fail Register with Valid Credentials
	Given User is on Home Page
	When User Navigate to LogIn Page
	And user click on the button create new account
	And user incorrectly fill in all fields
	Then failed to register the user	