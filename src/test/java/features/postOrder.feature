Feature: Simple Book API
  I want to use this template for my feature file

 @test
  Scenario: To verify Post API in Simple
    Given I have a auth token
    When I Submit an order for books using POST call
    Then I veirfy the response to be 201
    #And I verify the response body
    #Given I have a auth token
    #Given I get the order generated using GET call
    #Then I veirfy the response to be 200
    