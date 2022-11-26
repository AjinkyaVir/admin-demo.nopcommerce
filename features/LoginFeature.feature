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

Feature: Verify Login functionality

 
  Scenario: Login with valid credential
    Given Launch browser 
    When Enter valid url "https://admin-demo.nopcommerce.com/login"
    And Enter email as "admin@yourstore.com" and Password as "admin"
    And click on Login
    Then Page title should be "Dashboard / nopCommerce administration"
    When User click on Logout page
    Then Page title should be "Your store. Login"
    And close browser

 Scenario Outline: Login with valid credential
 		Given Launch browser 
    When Enter valid url "https://admin-demo.nopcommerce.com/login"
    And Enter email as "<email>" and Password as "<pass>"
    And click on Login
    Then Page title should be "Dashboard / nopCommerce administration"
    When User click on Logout page
    Then Page title should be "Your store. Login"
    And close browser
    
Examples:  
|email|pass|
|admin@yourstore.com|admin|
|test@yourstore.com|xyz|
    
    
    
    