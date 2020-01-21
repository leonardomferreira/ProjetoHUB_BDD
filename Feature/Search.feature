Feature: Search Action
@SearchTest @Valid
Scenario: success when searching for product
	Given User is on Home Page
	When user click on the desired category
	And user click on the desired product
	Then successfully researched product
	
@SearchTest	@Invalid
Scenario: failed to search for product
	Given User is on Home Page
	When user click on View details
	Then invalid product text
	