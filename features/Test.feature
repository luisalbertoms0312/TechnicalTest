Feature: Check Login Page access
  I want to use this template for my feature file

 
  Scenario: Login as a Standard User
    Given Go to the SWAGLABS main page
    When Add your username
    And Click on login Page
    Then verify if page was displayed 

    
   Scenario: Login as a Unlocked User
    Given Go to the SWAGLABS main page
    When Add your username and password
    And Click on login Page
    Then verify message error