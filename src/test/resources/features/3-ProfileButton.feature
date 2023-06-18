Feature: Profile Button

  Scenario: Check functionality of profile button in the top right corner
    Given I am already login on to the application
    When I will be redirected to the homepage
    Then I click on the profile button in the "top" right corner

  Scenario: Check functionality of profile button in the bottom right corner
    Given I am already login on to the application
    When I will be redirected to the homepage
    Then I click on the profile button in the "bottom" right corner