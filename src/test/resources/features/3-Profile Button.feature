Feature: Profile Button

  Scenario: Check functionality of profile button in the top right corner
    Given I am currently on the login page
    When I fill email in the designated field
    And I fill password in the designated field
    And I clicking on the login button
    And I confirm in the option to save password
    And I will be redirected to the homepage
    Then I click on the profile button in the top right corner

  Scenario: Check functionality of profile button in the bottom right corner
    Given I am currently in the login page
    When I filled email on the designated field
    And I filled password on the designated field
    And I clicking in the login button
    And I confirm on the option to save password
    And I will be redirected in the homepage
    Then I click on the profile button in the bottom right corner
