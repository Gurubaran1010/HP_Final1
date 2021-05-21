Feature: To validate Login Functionality in a Facebook application
Scenario Outline: To validate login with invalid usernam and invalid password
	Given User have to enter into facebook login page
	When User enter invalid username "<username>" and passwork"<password>"
	And User have to click login button 
	Then User should be invalid credentials page
	
	Examples:
	
	| username| password|
	| Greens| grean1|
	| Green12| grean2|
	| name11| plan123|
	
	
