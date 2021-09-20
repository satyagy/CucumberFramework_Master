Feature: Search
  As a user I should able to Search some string in google

  @google
  Scenario: to do Google Search
    Given I am on Facebook Login Page
    When I enter Username into email field on Facebook Page
    And I enter Password into password field on Facebook Page
    And I click Login Button