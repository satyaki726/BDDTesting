Feature: Ebay Home Page Scenarios

  @P1
  Scenario: Advanced Search Link
    Given I am on Ebay Home Page
    When I click on Advanced Link
    Then I navigate to Advaned Search Page

  @P3 @setCookies @Test
  Scenario: Search items count
    Given I am on Ebay Home Page
    When I search for 'iPhone 11'
    Then I validate atleast 1000 search items present

  @P4
  Scenario: Search an item in a category
    Given I am on Ebay Home Page
    When I search for 'soap' in 'baby' category

	@P6
  Scenario Outline: Home Page Links
    Given I am on Ebay Home Page
    When I click on the '<link>'
    Then I validate the page navigates to '<url>' and titles contains '<title>'

    Examples: 
      | link        | url                                                                | title       |
      | Electronics | https://www.ebay.com/b/Electronics/bn_7000259124                   | Electronics |
      | Fashion     | https://www.ebay.com/b/Clothing-Shoes-Accessories/11450/bn_1852545 | Clothing    |
