Feature: Check Login Page access
  I want to use this template for my feature file

 
  Scenario: Login as a Standard User
    Given Go to the SWAGLABS main page
    When Add your username
    And Click on login Page
    Then verify if page was displayed 

    
  Scenario Outline: Check login acces for all users
    Given browser is open
    And user in on login page
    When user enters <username> and <password>
    And clicks on login button
    Then user is navigated to the home page

    Examples: 
      | username | password |
      | standard_user   |    secret_sauce |
      | locked_out_user     |    secret_sauce |
			| problem_user | secret_sauce |
			| performance_glitch_user | secret_sauce |