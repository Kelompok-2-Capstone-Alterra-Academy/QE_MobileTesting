Feature: Logout

  Scenario: Logout with valid data
    Given I am on the login page
    When I filled in email on the login field to logout
    And I filled in password on the login field to logout
    And I click on the login button
    And I verify save on the password
    And Redirect on the homepage
    And I click account button
    Then I click logout button