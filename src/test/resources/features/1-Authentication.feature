#Feature: Authentication
#
#  Scenario: Login with valid data
#    Given I am in the login page
#    When I fill email field to login
#    And I fill password field to login
#    And I click login button
#    And I verify save to password
#    Then Redirect in the homepage
#
#  Scenario: Login with email field empty
#    Given I am logged in
#    When I filled email field with "empty"
#    And I filled password field with "valid data"
#    Then I click the login button
#
#  Scenario: Login with password field empty
#    Given I am logged in
#    When I filled email field with "valid data"
#    And I filled password field with "empty"
#    Then I click the login button
#
#  Scenario: Login with incorrect email
#    Given I am on login page
#    When I fills email field with "incorrect"
#    And I fills password field with "valid data"
#    Then I click at the login button
#
#  Scenario: Login with incorrect password
#    Given I am on login page
#    When I fills email field with "valid data"
#    And I fills password field with "incorrect"
#    Then I click at the login button
#
#  Scenario: Login without fill all fields
#    Given I am at the login page
#    When I login without filling in the email field
#    And I login without filling in the password field
#    Then I click in the login button
#
#  Scenario: Login with unregistered email
#    Given I am in login page
#    When I fill email field with unregistered email
#    And I fill password field with accordingly
#    Then I click in login button
#
#  Scenario: Logout with valid data
#    Given I am already login in the application
#    When I click account button
#    Then I click logout button