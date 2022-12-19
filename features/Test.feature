Feature: Check Login Page access
  I want to use this template for my feature file

 

  Scenario Outline: Go to the main page, type your credentials and Verify that is displayed
   Given Go to the main page
    When Add your <username> and <password>

    #And Click on login Page
    #Then verify if page was displayed
    Examples: 
      | username                | password     |
      | standard_user           | secret_sauce |
      | locked_out_user         | secret_sauce |
      | problem_user            | secret_sauce |
      | performance_glitch_user | secret_sauce |

  Scenario Outline: Go to the main page and add a product to the cart list
   Given Go the main page
   	When Add the <username> and <password>
    And get elements and select specific item
   
    And go to cart list
    Then wait and remove

     Examples: 
      | username                | password     |
      | standard_user           | secret_sauce |