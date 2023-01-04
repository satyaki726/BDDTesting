Feature: Ebay Advanced Search Page

  @P2
  Scenario: Ebay Logo on Advanced Search Page
    Given I am on Ebay Advanced Search Page
    When I click on Ebay Logo
    Then I am navigated to Ebay Home Page

  @P5
  Scenario: Advanced Search an item
    Given I am on Ebay Advanced Search Page
    When I advanced search an item
      | keyword   | exclude     | min | max |
      | iphone 11 | refurbished | 300 | 900 |
