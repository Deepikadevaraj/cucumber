Feature: Login TestMeApp

Background: display welcome
Given welcome user
@login @regression
Scenario: login with the valid data credentials
 When user opens chrome browser and open application
 When user enters username as "<UserName>" And password as "<Password>"  field
 And user clicks on login
 Then verify the login
 
 @regression 
 Scenario: login with the invalid data credentials
 When user open chrome browser and open application
 When user enter username as "<UserName>" And password as "<Password>"  field
 And user clicks the login
 Then verify the page
 
 
 
 
 
 