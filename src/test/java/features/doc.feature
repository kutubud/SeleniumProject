Feature: Automate leaftap application


@smoke
Scenario Outline: TC001_Login and Logout

Given Lounch chrome browser and load url
And Enter username as <username>
And Enter password as <password>
When click  the login button
Then it's navigated homepage
And click the logout button
And close browser

Examples:
|username|password|
|DemoSalesManager|crmsfa|
|DemoCSR|crmsfa|

@wip
Scenario Outline: TC002_Login and Logout for Failure
Given Lounch chrome browser and load url
And Enter username as <username>
And Enter password as <password>
When click  the login button
Then it's navigated same page
But Verify error message
And close browser

Examples:
|username|password|
|kutub|crmsfa|
|DemoCSR|crmsfa1|

@regression
Scenario Outline:TC003_CreateLead
Given Launch chrome browser and load url 
And Enter username as DemoSalesManager 
And Enter Password as crmsfa 
And Click the login button
And Click CRMSFA
And Click leads link
When Click createLead	
And Enter the company name as <company>
And Enter the firstname as <fName>
And Enter the lastname as <lName>
And Choose source as Website
And Click the create lead button
Then It's navigated ViewLeadPage 
And Verify the firstname
And Close browser

Examples:

|company|fName|lName|
|ABC|Hema|Mali|
|XYZ|Hema|Mali|
|TCS|Hema|Mali|
