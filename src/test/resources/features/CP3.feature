#Autor: Carlos
Feature: Curs
  As a user,I want to learn how to automate in screamplay at the Swaglabs page with the automation course
  @CP3
  Scenario: Confirm the purchase
    Given than carlos is on the cart shopping page
    When he checkout his purchase
    And he enters his information to finalize the purchase
    Then he visualizes that his thank you for your order