Feature: TextSearch
@TextSearchTest @Valid
Scenario: success when searching for product by text
	Given User is on Home Page
	When user click on the magnifying glass
	And user write the desired product
	And user click on product
	Then success when looking for the product
	
@TextSearchTest @Invalid
Scenario: Fail when searching for product by text
	Given User is on Home Page
	When user click on the magnifying glass
	And user searches for an invalid product
	Then Fail when looking for the product	