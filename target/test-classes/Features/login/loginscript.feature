@tloginscript
Feature: login feature

Scenario: login with valid credentials
 Given i am on tutorialsninja login page
 When i enter valid username
 And i enter valid password
 And i click on tlogin button
 Then i should be navigated to dashboard
 
 #Scenario: unable to login with invalid credentials
 #Given i am login tutorialsninja login page
 #When i enter valid username
 #And i enter valid password
 #And i click on login button
 #Then i should be navigated to dashboard

 