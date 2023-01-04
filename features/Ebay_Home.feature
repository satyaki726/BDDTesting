Feature: Ebay Home Page Scenarios

@P1
Scenario: Advanced Search Link

Given I am on Ebay Home Page
When I click on Advanced Link
Then I navigate to Advaned Search Page

@P3
Scenario: Search items count

Given I am on Ebay Home Page
When I search for 'iPhone 11'
Then I validate atleast 1000 search items present

@P4
Scenario: Search an item in a category

Given I am on Ebay Home Page
When I search for 'soap' in 'baby' category