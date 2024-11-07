Feature: Demo signup functionality

  Background: 
    Given User is at signup page

  @single
  Scenario: Verify the signup with valid data
    ## Given User is at signup page
    When User enter the name and email
      | name   | email              |
      | anjali | anjali19@gmail.com |
    And click on signup Button
    Then User navigate to the information page

  ##For multiple secaniors of possite and negative cases of data
  ##@multiple
 ## Scenario Outline: verify the signup with multiple set of data
   ## When User input the <name> and <email>
   ## And click on button
  ##  Then User should navigate to the information page with valid data

   ## Examples: 
     ## | name   | email            |
     ## | abc    | abc@gmail.com    |
     ## | Anjali | anjali@gamil.com |
     ## | xyz    | xyz@in           |
