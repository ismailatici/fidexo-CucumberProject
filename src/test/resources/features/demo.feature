@FIDEX-413
Feature: Default


	@FIDEX-366
	Scenario Outline: As a user, as a Salasmanager  should be able to log in so that I can land on homepage
		Given user is on the login page
		When user enters valid the "<username>" and password "<password>"
		And user clicks the Log in Button
		Then user is on the homepage

		Examples:
			| username                |  | password     |
			| salesmanager43@info.com |  | salesmanager |
			| salesmanager44@info.com |  | salesmanager |


	@FIDEX-374
	Scenario Outline: As a user,as a Posmanager should be able to log in so that.i can land on homepage
		Given user is on the login page
		When user enters valid the "<username>" and password "<password>"
		And user clicks the Log in Button
		Then user is on the homepage

		Examples:
			| username              |  | password   |
			| posmanager43@info.com |  | posmanager |
			| posmanager44@info.com |  | posmanager |


	@FIDEX-375
	Scenario: As a salesmanager, Wrong login/password" should be displayed for invalid (valid username-invalid password)credentials
		Given user is on the login page
		When user enters the "salesmanager43@info.com" and invalid password "salesmanager13"
		And user clicks the Log in Button
		Then user see the error message


	@FIDEX-378
	Scenario: As a salesmanager, Wrong login/password"  (invalid username-valid password) credentials
		Given user is on the login page
		When user enters invalid the "salesmanager4343@info.com" and valid password "salesmanager"
		And  user clicks the Log in Button
		Then user see the error message	


	@FIDEX-379
	Scenario: - "Please fill out this field" message should be displayed if the password or username is empty
		Given user is on the login page
		When user enters the username "" and password ""
		And user clicks the Log in Button
		Then user see the message	


	@FIDEX-410
	Scenario: " User land on the ‘reset password’ page after clicking on the "Reset password" link"
		Given user is on the login page
		When user clicks the reset password button
		Then user see email input page	


	@FIDEX-411
	Scenario: "User should see the password in bullet signs by default"
		Given user is on the login page
		When user enters the username "salesmanager10@info.com" and password "salesmanager10"
		Then user see that password is in bullet signs by default	


	@FIDEX-412
	Scenario: "Verify if the ‘Enter’ key of the keyboard is working correctly on the login page"
		Given user is on the login page
		When user enters the username "salesmanager10@info.com" and password "salesmanager"
		And user clicks the Log in Button
		Then user is on the homepage	


	@FIDEX-414
	Scenario: As a posmanager, Wrong login/password"  (valid username-invalid password) credentials
		Given user is on the login page
		When user enters the username "posmanager43@info.com" and password "posmanager10"
		And user clicks the Log in Button
		Then user see the error message	


	@FIDEX-415
	Scenario: As a posmanager Wrong login/password(invalid username-valid password)credentials
		Given user is on the login page
		When user enters the username "posmanager4343@info.com" and password "posmanager"
		And user clicks the Log in Button
		Then user see the error message