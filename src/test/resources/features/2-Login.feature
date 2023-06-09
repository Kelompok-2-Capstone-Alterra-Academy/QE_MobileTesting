Feature: Login

  Scenario: TC01 - Login with valid data
    Given I am in the login page
    When I fill email field to login
    And I fill password field to login
    And I click login button
    And I verify save to password
    Then Redirect in the homepage
