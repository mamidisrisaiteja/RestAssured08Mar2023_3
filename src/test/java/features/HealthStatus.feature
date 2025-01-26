Feature: Simple Book API Health Status
  

 @test3
 @smoke
  Scenario: To verify Health Status of simple books api
   Given I call the health status api
   Then I veirfy the response to be 200
  
    