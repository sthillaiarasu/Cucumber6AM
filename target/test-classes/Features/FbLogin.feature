@Smoke @sanity
Feature: Facebook login validation

Background:
   Given launch the browser and open Facebook URL

@run
Scenario: Validate the facebook login with valid credentials
    
    When enter the username and password
    |username|password|address|phone|mobile|
    |thillai|arasu|hsajkfd|fsdfsd|sdfsd|
    |jsdhasjd|asdkassa|jhasddjas|jsadh|jhds|
    |jdksah|ajdhsaj|sjfhsd|jhsd|hfsdjkl|
    Then validate the login message   
    
    
 @mul   
Scenario Outline: Validate the facebook login with Invalid credentials
        When enter the "<username>" and "<password>"
    Then validate the login message    
    Then add the new line
    Examples:
    |username|password|
    |arasu|thillai|
    |thillai| arasu|
    |tchnology|java|
    
   #  |username|password|sno|add|phone|
   # |thillai|arasu|hsajkfd|fsdfsd|sdfsd|