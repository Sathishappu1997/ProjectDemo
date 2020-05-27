@orangehrm
Feature: orangehrm website

@tc_0_login
Scenario Outline: validate the login functionality

Given launch the browser and the enter the url
When login page is opened
Then enter the "<username1>" and "<password1>"
Then click the login button
And close the browser

Examples:
|username1 |password1|
|Admin     |admin123 |
|admin     |Admin124 |

@tc_1_Admin
Scenario: validate the admin functionality

When admin page is opened
Then click admin
And click usermgmt
And click users
And enter adminuname
And select role
And enter empname
And select status
And click search