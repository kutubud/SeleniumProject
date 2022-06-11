Feature: Automate leaftap application


@smoke
Scenario outline: TC001_Login and Logout

Given Lounch ChromeBrowser and Load Url
And Enter username as <username>
And Enter password as <password>
When Click  the Login button
Then it's navigated homepage
And click the logout button
And close browser

Examples:
|username|password|
|DemoSalesManager|crmsfa|
|DemoCSRcrmsfa||

@smoke
Scenario outline: TC002_Login and Logout for Failure
Given Lounch ChromeBrowser and Load Url
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