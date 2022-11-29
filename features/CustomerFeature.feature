#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template

Feature: Add Customer 

  Scenario: Verify Add Customer functionality 
    Given Launch browser
    When Enter valid url "https://admin-demo.nopcommerce.com/login"
    And Enter email as "admin@yourstore.com" and Password as "admin"
    And click on Login
    Then User can view dashboard
    When User click on Customers menu
 		And click on Customers menu item
 		And Click on Add new button
 		Then User can see Add a new customer page
 		When user enter customer info
 		And click on Save button
 		Then User can view confirmation message "The new customer has been added successfully."
 		And close browser
 		
 		
 	Scenario: Search customer by Email address
 		Given Launch browser
 		When Enter valid url "https://admin-demo.nopcommerce.com/login"
 		And Enter email as "admin@yourstore.com" and Password as "admin"
 		And click on Login
 		Then User can view dashboard
 		When User click on Customers menu
 		And click on Customers menu item
 		When User enter email address
 		And click on search button
 		Then user should find email in search table
 		And close browser

 