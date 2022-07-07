@FIDEX-465
Feature: Default


	@FIDEX-461
	Scenario Outline: US02 TC01 Salesmanager can log out and ends up in login page.
		Given user is on the login page
		And user enters valid the "<username>" and password "<password>"
		And user clicks the Log in Button
		And user is clicks on the username 
		When user enters the logout button
		Then user see text at the top of the page "Best solution for startup"
		
		    Examples:
		      | username                |  | password     |
		      | salesmanager43@info.com |  | salesmanager |
		      | salesmanager44@info.com |  | salesmanager |	


	@FIDEX-462
	Scenario Outline: US02-TC02 Posmanager can log out and ends up log in page
		Given user is on the login page
		And user enters valid the "<username>" and password "<password>"
		And user clicks the Log in Button
		And user is clicks on the username
		When user enters the logout button
		Then user see text at the top of the page "Best solution for startup"
		    Examples:
		      | username              |  | password     |
		      | posmanager43@info.com |  | posmanager |
		      | posmanager44@info.com |  | posmanager |	


	@FIDEX-463
	Scenario Outline: US02-TC03 Posmanager can not go to the home page again by clicking the step back button after successfully logged out.
		Given user is on the login page
		And user enters valid the "<username>" and password "<password>"
		And user clicks the Log in Button
		And user is on the homepage
		And user is clicks on the username
		When user enters the logout button
		Then user clicks the step back button
		Then user see error message"Your Odoo session expired.Please refresh the current web page"
		
		    Examples:
		      | username                |  | password     |
		      | posmanager43@info.com |  | posmanager |
		      | posmanager44@info.com |  | posmanager |	


	@FIDEX-464
	Scenario Outline: US02-TC04 Salesmanager can not go to the home page again by clicking the step back button after successfully logged out.
		Given user is on the login page
		And user enters valid the "<username>" and password "<password>"
		And user clicks the Log in Button
		And user is on the homepage
		And user is clicks on the username
		When user enters the logout button
		Then user clicks the step back button
		Then user see error message"Your Odoo session expired.Please refresh the current web page"

		Examples:
			| username                |  | password     |
			| salesmanager43@info.com |  | salesmanager |
			| salesmanager44@info.com |  | salesmanager |